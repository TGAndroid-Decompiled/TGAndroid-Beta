package org.telegram.ui.Components.Paint;

import java.util.Arrays;
import java.util.Vector;

public final class Path {
    public float baseWeight;
    public Brush brush;
    public int color;
    public final Vector points;
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
}
