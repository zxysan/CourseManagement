package com.shuangyulin.domain;

public class ScoreInfo {
    /*��¼���*/
    private int scoreId;
    public int getScoreId() {
        return scoreId;
    }
    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    /*ѧ������*/
    private Student_QQ287307421 studentNumber;
    public Student_QQ287307421 getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(Student_QQ287307421 studentNumber) {
        this.studentNumber = studentNumber;
    }

    /*�γ̶���*/
    private CourseInfo_QQ254540457 courseNumber;
    public CourseInfo_QQ254540457 getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(CourseInfo_QQ254540457 courseNumber) {
        this.courseNumber = courseNumber;
    }

    /*�ɼ��÷�*/
    private float scoreValue;
    public float getScoreValue() {
        return scoreValue;
    }
    public void setScoreValue(float scoreValue) {
        this.scoreValue = scoreValue;
    }

    /*ѧ������*/
    private String studentEvaluate;
    public String getStudentEvaluate() {
        return studentEvaluate;
    }
    public void setStudentEvaluate(String studentEvaluate) {
        this.studentEvaluate = studentEvaluate;
    }

}