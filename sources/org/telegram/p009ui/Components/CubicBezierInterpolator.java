package org.telegram.p009ui.Components;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class CubicBezierInterpolator implements Interpolator {
    protected PointF f1053a;
    protected PointF f1054b;
    protected PointF f1055c;
    protected PointF end;
    protected PointF start;
    public static final CubicBezierInterpolator DEFAULT = new CubicBezierInterpolator(0.25d, 0.1d, 0.25d, 1.0d);
    public static final CubicBezierInterpolator EASE_OUT = new CubicBezierInterpolator(0.0d, 0.0d, 0.58d, 1.0d);
    public static final CubicBezierInterpolator EASE_OUT_QUINT = new CubicBezierInterpolator(0.23d, 1.0d, 0.32d, 1.0d);
    public static final CubicBezierInterpolator EASE_IN = new CubicBezierInterpolator(0.42d, 0.0d, 1.0d, 1.0d);
    public static final CubicBezierInterpolator EASE_BOTH = new CubicBezierInterpolator(0.42d, 0.0d, 0.58d, 1.0d);
    public static final CubicBezierInterpolator EASE_OUT_BACK = new CubicBezierInterpolator(0.34d, 1.56d, 0.64d, 1.0d);

    public CubicBezierInterpolator(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f1053a = new PointF();
        this.f1054b = new PointF();
        this.f1055c = new PointF();
        float f = pointF.x;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f2 = pointF2.x;
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.start = pointF;
        this.end = pointF2;
    }

    public CubicBezierInterpolator(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }

    public CubicBezierInterpolator(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }

    @Override
    public float getInterpolation(float f) {
        return getBezierCoordinateY(getXForTime(f));
    }

    protected float getBezierCoordinateY(float f) {
        PointF pointF = this.f1055c;
        PointF pointF2 = this.start;
        float f2 = pointF2.y * 3.0f;
        pointF.y = f2;
        PointF pointF3 = this.f1054b;
        float f3 = ((this.end.y - pointF2.y) * 3.0f) - f2;
        pointF3.y = f3;
        PointF pointF4 = this.f1053a;
        float f4 = (1.0f - pointF.y) - f3;
        pointF4.y = f4;
        return f * (pointF.y + ((pointF3.y + (f4 * f)) * f));
    }

    protected float getXForTime(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            float bezierCoordinateX = getBezierCoordinateX(f2) - f;
            if (Math.abs(bezierCoordinateX) < 0.001d) {
                break;
            }
            f2 -= bezierCoordinateX / getXDerivate(f2);
        }
        return f2;
    }

    private float getXDerivate(float f) {
        return this.f1055c.x + (f * ((this.f1054b.x * 2.0f) + (this.f1053a.x * 3.0f * f)));
    }

    private float getBezierCoordinateX(float f) {
        PointF pointF = this.f1055c;
        PointF pointF2 = this.start;
        float f2 = pointF2.x * 3.0f;
        pointF.x = f2;
        PointF pointF3 = this.f1054b;
        float f3 = ((this.end.x - pointF2.x) * 3.0f) - f2;
        pointF3.x = f3;
        PointF pointF4 = this.f1053a;
        float f4 = (1.0f - pointF.x) - f3;
        pointF4.x = f4;
        return f * (pointF.x + ((pointF3.x + (f4 * f)) * f));
    }
}
