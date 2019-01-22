package com.test.proxy.v1;

/***
 * 静态代理
 */
public class StudentProxy implements Person {
    private Student stu;
    
    public StudentProxy(Person person){
        if(person.getClass()==Student.class){
            this.stu =(Student) person;
        }
    }

    @Override
    public void giveMoney() {
        System.out.println("张三最近学习有进步！");//aop
        stu.giveMoney();
    }
}
