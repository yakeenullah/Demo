package com.basicStrong;

class Fan{
	private boolean isOn;
	public void turnOn() {
		isOn=true;
		System.out.println("Fan is spinning");
	}
	
	public void turnOff() {
		isOn=false;
		System.out.println("Fan is stop");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Fan obj=new Fan();
		obj.turnOn();
		

	}

}
