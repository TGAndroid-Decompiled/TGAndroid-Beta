package org.telegram.p009ui.Components.Paint;

import android.graphics.PointF;

public class Point {
    public boolean edge;
    public double f1038x;
    public double f1039y;
    public double f1040z;

    public Point(double d, double d2, double d3) {
        this.f1038x = d;
        this.f1039y = d2;
        this.f1040z = d3;
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
        return this.f1038x == point.f1038x && this.f1039y == point.f1039y && this.f1040z == point.f1040z;
    }

    public Point multiplySum(Point point, double d) {
        return new Point((this.f1038x + point.f1038x) * d, (this.f1039y + point.f1039y) * d, (this.f1040z + point.f1040z) * d);
    }

    public Point add(Point point) {
        return new Point(this.f1038x + point.f1038x, this.f1039y + point.f1039y, this.f1040z + point.f1040z);
    }

    public Point substract(Point point) {
        return new Point(this.f1038x - point.f1038x, this.f1039y - point.f1039y, this.f1040z - point.f1040z);
    }

    public Point multiplyByScalar(double d) {
        return new Point(this.f1038x * d, this.f1039y * d, this.f1040z * d);
    }

    public float getDistanceTo(Point point) {
        return (float) Math.sqrt(Math.pow(this.f1038x - point.f1038x, 2.0d) + Math.pow(this.f1039y - point.f1039y, 2.0d) + Math.pow(this.f1040z - point.f1040z, 2.0d));
    }

    public PointF toPointF() {
        return new PointF((float) this.f1038x, (float) this.f1039y);
    }
}
