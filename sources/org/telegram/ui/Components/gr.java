package org.telegram.ui.Components;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
public final class gr implements Interpolator {
    public static final gr f28844f = new gr(0.25d, 0.1d, 0.25d, 1.0d);
    public static final gr f28845g = new gr(0.0d, 0.0d, 0.58d, 1.0d);
    public static final gr h = new gr(0.23d, 1.0d, 0.32d, 1.0d);
    public static final gr f28846i = new gr(0.42d, 0.0d, 1.0d, 1.0d);
    public static final gr f28847j = new gr(0.42d, 0.0d, 0.58d, 1.0d);
    public static final gr f28848k = new gr(0.34d, 1.56d, 0.64d, 1.0d);
    public static final PathInterpolator f28849l;
    public final PointF f28850a;
    public final PointF f28851b;
    public final PointF f28852c;
    public final PointF d;
    public final PointF f28853e;

    static {
        new PathInterpolator(f7.i8.d("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
        f28849l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public gr(float f10, float f11, float f12, float f13) {
        PointF pointF = new PointF(f10, f11);
        PointF pointF2 = new PointF(f12, f13);
        this.f28852c = new PointF();
        this.d = new PointF();
        this.f28853e = new PointF();
        float f14 = pointF.x;
        if (f14 >= 0.0f && f14 <= 1.0f) {
            float f15 = pointF2.x;
            if (f15 >= 0.0f && f15 <= 1.0f) {
                this.f28850a = pointF;
                this.f28851b = pointF2;
                return;
            }
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        throw new IllegalArgumentException("startX value must be in the range [0, 1]");
    }

    @Override
    public final float getInterpolation(float f10) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i9 = 1;
        float f11 = f10;
        while (true) {
            pointF = this.f28851b;
            pointF2 = this.f28850a;
            pointF3 = this.f28852c;
            pointF4 = this.d;
            pointF5 = this.f28853e;
            if (i9 >= 14) {
                break;
            }
            float f12 = pointF2.x * 3.0f;
            pointF5.x = f12;
            float f13 = ((pointF.x - pointF2.x) * 3.0f) - f12;
            pointF4.x = f13;
            float f14 = (1.0f - pointF5.x) - f13;
            pointF3.x = f14;
            float f15 = (((((f14 * f11) + pointF4.x) * f11) + pointF5.x) * f11) - f10;
            if (Math.abs(f15) < 0.001d) {
                break;
            }
            f11 -= f15 / (((((pointF3.x * 3.0f) * f11) + (pointF4.x * 2.0f)) * f11) + pointF5.x);
            i9++;
        }
        float f16 = pointF2.y * 3.0f;
        pointF5.y = f16;
        float f17 = ((pointF.y - pointF2.y) * 3.0f) - f16;
        pointF4.y = f17;
        float f18 = (1.0f - pointF5.y) - f17;
        pointF3.y = f18;
        return ((((f18 * f11) + pointF4.y) * f11) + pointF5.y) * f11;
    }

    public gr(double d, double d9, double d10, double d11) {
        this((float) d, (float) d9, (float) d10, (float) d11);
    }
}
