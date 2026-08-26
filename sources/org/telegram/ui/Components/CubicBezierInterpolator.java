package org.telegram.ui.Components;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.PathParser;

public final class CubicBezierInterpolator implements Interpolator {
    public static final PathInterpolator StandardDecelerate;
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF end;
    public final PointF start;
    public static final CubicBezierInterpolator DEFAULT = new CubicBezierInterpolator(0.25d, 0.1d, 0.25d, 1.0d);
    public static final CubicBezierInterpolator EASE_OUT = new CubicBezierInterpolator(0.0d, 0.0d, 0.58d, 1.0d);
    public static final CubicBezierInterpolator EASE_OUT_QUINT = new CubicBezierInterpolator(0.23d, 1.0d, 0.32d, 1.0d);
    public static final CubicBezierInterpolator EASE_IN = new CubicBezierInterpolator(0.42d, 0.0d, 1.0d, 1.0d);
    public static final CubicBezierInterpolator EASE_BOTH = new CubicBezierInterpolator(0.42d, 0.0d, 0.58d, 1.0d);
    public static final CubicBezierInterpolator EASE_OUT_BACK = new CubicBezierInterpolator(0.34d, 1.56d, 0.64d, 1.0d);

    static {
        new PathInterpolator(PathParser.createPathFromPathData("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
        StandardDecelerate = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public CubicBezierInterpolator(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF(f, f2);
        PointF pointF2 = new PointF(f3, f4);
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
        float f5 = pointF.x;
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f6 = pointF2.x;
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.start = pointF;
        this.end = pointF2;
    }

    @Override
    public final float getInterpolation(float f) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i = 1;
        float f2 = f;
        while (true) {
            pointF = this.end;
            pointF2 = this.start;
            pointF3 = this.a;
            pointF4 = this.b;
            pointF5 = this.c;
            if (i >= 14) {
                break;
            }
            float f3 = pointF2.x * 3.0f;
            pointF5.x = f3;
            float f4 = ((pointF.x - pointF2.x) * 3.0f) - f3;
            pointF4.x = f4;
            float f5 = (1.0f - pointF5.x) - f4;
            pointF3.x = f5;
            float f6 = (((((f5 * f2) + pointF4.x) * f2) + pointF5.x) * f2) - f;
            if (Math.abs(f6) < 0.001d) {
                break;
            }
            f2 -= f6 / (((((pointF3.x * 3.0f) * f2) + (pointF4.x * 2.0f)) * f2) + pointF5.x);
            i++;
        }
        float f7 = pointF2.y * 3.0f;
        pointF5.y = f7;
        float f8 = ((pointF.y - pointF2.y) * 3.0f) - f7;
        pointF4.y = f8;
        float f9 = (1.0f - pointF5.y) - f8;
        pointF3.y = f9;
        return ((((f9 * f2) + pointF4.y) * f2) + pointF5.y) * f2;
    }

    public CubicBezierInterpolator(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }
}
