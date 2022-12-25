package org.telegram.p009ui.Components.Paint;

import android.graphics.PointF;

public class Point {
    public boolean edge;
    public double f1067x;
    public double f1068y;
    public double f1069z;

    public Point(double d, double d2, double d3) {
        this.f1067x = d;
        this.f1068y = d2;
        this.f1069z = d3;
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
            return this.f1067x == point.f1067x && this.f1068y == point.f1068y && this.f1069z == point.f1069z;
        }
        return false;
    }

    public Point multiplySum(Point point, double d) {
        return new Point((this.f1067x + point.f1067x) * d, (this.f1068y + point.f1068y) * d, (this.f1069z + point.f1069z) * d);
    }

    public Point add(Point point) {
        return new Point(this.f1067x + point.f1067x, this.f1068y + point.f1068y, this.f1069z + point.f1069z);
    }

    public Point substract(Point point) {
        return new Point(this.f1067x - point.f1067x, this.f1068y - point.f1068y, this.f1069z - point.f1069z);
    }

    public Point multiplyByScalar(double d) {
        return new Point(this.f1067x * d, this.f1068y * d, this.f1069z * d);
    }

    public float getDistanceTo(Point point) {
        return (float) Math.sqrt(Math.pow(this.f1067x - point.f1067x, 2.0d) + Math.pow(this.f1068y - point.f1068y, 2.0d) + Math.pow(this.f1069z - point.f1069z, 2.0d));
    }

    public PointF toPointF() {
        return new PointF((float) this.f1067x, (float) this.f1068y);
    }
}
