package org.telegram.ui.Components.Paint;

import java.util.Arrays;
import java.util.Vector;

public class Path {
    private float baseWeight;
    private Brush brush;
    private int color;
    private Vector points;
    public double remainder;

    public Path(Point point) {
        Vector vector = new Vector();
        this.points = vector;
        vector.add(point);
    }

    public Path(Point[] pointArr) {
        Vector vector = new Vector();
        this.points = vector;
        vector.addAll(Arrays.asList(pointArr));
    }

    public float getBaseWeight() {
        return this.baseWeight;
    }

    public Brush getBrush() {
        return this.brush;
    }

    public int getColor() {
        return this.color;
    }

    public int getLength() {
        Vector vector = this.points;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public Point[] getPoints() {
        Point[] pointArr = new Point[this.points.size()];
        this.points.toArray(pointArr);
        return pointArr;
    }

    public void setup(int i, float f, Brush brush) {
        this.color = i;
        this.baseWeight = f;
        this.brush = brush;
    }
}
