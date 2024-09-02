package org.telegram.ui.Components.Paint;

import android.graphics.PointF;

public class Point {
    public boolean edge;
    public double x;
    public double y;
    public double z;

    public Point(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public Point(double d, double d2, double d3, boolean z) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.edge = z;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y && this.z == point.z;
    }

    public Point multiplySum(Point point, double d) {
        return new Point((this.x + point.x) * d, (this.y + point.y) * d, (this.z + point.z) * d);
    }

    public Point add(Point point) {
        return new Point(this.x + point.x, this.y + point.y, this.z + point.z);
    }

    public Point substract(Point point) {
        return new Point(this.x - point.x, this.y - point.y, this.z - point.z);
    }

    public Point multiplyByScalar(double d) {
        return new Point(this.x * d, this.y * d, this.z * d);
    }

    public float getDistanceTo(Point point) {
        return (float) Math.sqrt(Math.pow(this.x - point.x, 2.0d) + Math.pow(this.y - point.y, 2.0d) + Math.pow(this.z - point.z, 2.0d));
    }

    public PointF toPointF() {
        return new PointF((float) this.x, (float) this.y);
    }
}
