package org.telegram.ui.Components.Paint;

public final class Point {
    public boolean edge;
    public final double x;
    public final double y;
    public final double z;

    public Point(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public final boolean equals(Object obj) {
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

    public final float getDistanceTo(Point point) {
        return (float) Math.sqrt(Math.pow(this.z - point.z, 2.0d) + Math.pow(this.y - point.y, 2.0d) + Math.pow(this.x - point.x, 2.0d));
    }

    public Point(double d, double d2, double d3, int i) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.edge = true;
    }
}
