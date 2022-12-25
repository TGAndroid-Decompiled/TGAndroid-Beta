package org.telegram.p009ui.Components.Paint;

import android.graphics.PointF;

public class Point {
    public boolean edge;
    public double f1077x;
    public double f1078y;
    public double f1079z;

    public Point(double d, double d2, double d3) {
        this.f1077x = d;
        this.f1078y = d2;
        this.f1079z = d3;
    }

    public Point(double d, double d2, double d3, boolean z) {
        this.f1077x = d;
        this.f1078y = d2;
        this.f1079z = d3;
        this.edge = z;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return this.f1077x == point.f1077x && this.f1078y == point.f1078y && this.f1079z == point.f1079z;
        }
        return false;
    }

    public Point multiplySum(Point point, double d) {
        return new Point((this.f1077x + point.f1077x) * d, (this.f1078y + point.f1078y) * d, (this.f1079z + point.f1079z) * d);
    }

    public Point add(Point point) {
        return new Point(this.f1077x + point.f1077x, this.f1078y + point.f1078y, this.f1079z + point.f1079z);
    }

    public Point substract(Point point) {
        return new Point(this.f1077x - point.f1077x, this.f1078y - point.f1078y, this.f1079z - point.f1079z);
    }

    public Point multiplyByScalar(double d) {
        return new Point(this.f1077x * d, this.f1078y * d, this.f1079z * d);
    }

    public float getDistanceTo(Point point) {
        return (float) Math.sqrt(Math.pow(this.f1077x - point.f1077x, 2.0d) + Math.pow(this.f1078y - point.f1078y, 2.0d) + Math.pow(this.f1079z - point.f1079z, 2.0d));
    }

    public PointF toPointF() {
        return new PointF((float) this.f1077x, (float) this.f1078y);
    }
}
