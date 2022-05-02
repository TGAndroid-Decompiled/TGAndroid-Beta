package org.telegram.p009ui.Components.Paint;

import android.graphics.PointF;

public class Point {
    public boolean edge;
    public double f1052x;
    public double f1053y;
    public double f1054z;

    public Point(double d, double d2, double d3) {
        this.f1052x = d;
        this.f1053y = d2;
        this.f1054z = d3;
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
        return this.f1052x == point.f1052x && this.f1053y == point.f1053y && this.f1054z == point.f1054z;
    }

    public Point multiplySum(Point point, double d) {
        return new Point((this.f1052x + point.f1052x) * d, (this.f1053y + point.f1053y) * d, (this.f1054z + point.f1054z) * d);
    }

    public Point add(Point point) {
        return new Point(this.f1052x + point.f1052x, this.f1053y + point.f1053y, this.f1054z + point.f1054z);
    }

    public Point substract(Point point) {
        return new Point(this.f1052x - point.f1052x, this.f1053y - point.f1053y, this.f1054z - point.f1054z);
    }

    public Point multiplyByScalar(double d) {
        return new Point(this.f1052x * d, this.f1053y * d, this.f1054z * d);
    }

    public float getDistanceTo(Point point) {
        return (float) Math.sqrt(Math.pow(this.f1052x - point.f1052x, 2.0d) + Math.pow(this.f1053y - point.f1053y, 2.0d) + Math.pow(this.f1054z - point.f1054z, 2.0d));
    }

    public PointF toPointF() {
        return new PointF((float) this.f1052x, (float) this.f1053y);
    }
}
