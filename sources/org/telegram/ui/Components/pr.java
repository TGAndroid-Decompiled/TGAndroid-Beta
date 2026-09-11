package org.telegram.ui.Components;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
public final class pr implements Interpolator {
    public static final pr f29466f = new pr(0.25d, 0.1d, 0.25d, 1.0d);
    public static final pr f29467g = new pr(0.0d, 0.0d, 0.58d, 1.0d);
    public static final pr h = new pr(0.23d, 1.0d, 0.32d, 1.0d);
    public static final pr f29468i = new pr(0.42d, 0.0d, 1.0d, 1.0d);
    public static final pr f29469j = new pr(0.42d, 0.0d, 0.58d, 1.0d);
    public static final pr f29470k = new pr(0.34d, 1.56d, 0.64d, 1.0d);
    public static final PathInterpolator f29471l;
    public final PointF f29472a;
    public final PointF f29473b;
    public final PointF f29474c;
    public final PointF d;
    public final PointF f29475e;

    static {
        new PathInterpolator(v7.g8.d("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
        f29471l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public pr(float f7, float f10, float f11, float f12) {
        PointF pointF = new PointF(f7, f10);
        PointF pointF2 = new PointF(f11, f12);
        this.f29474c = new PointF();
        this.d = new PointF();
        this.f29475e = new PointF();
        float f13 = pointF.x;
        if (f13 >= 0.0f && f13 <= 1.0f) {
            float f14 = pointF2.x;
            if (f14 >= 0.0f && f14 <= 1.0f) {
                this.f29472a = pointF;
                this.f29473b = pointF2;
                return;
            }
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        throw new IllegalArgumentException("startX value must be in the range [0, 1]");
    }

    @Override
    public final float getInterpolation(float f7) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i10 = 1;
        float f10 = f7;
        while (true) {
            pointF = this.f29473b;
            pointF2 = this.f29472a;
            pointF3 = this.f29474c;
            pointF4 = this.d;
            pointF5 = this.f29475e;
            if (i10 >= 14) {
                break;
            }
            float f11 = pointF2.x * 3.0f;
            pointF5.x = f11;
            float f12 = ((pointF.x - pointF2.x) * 3.0f) - f11;
            pointF4.x = f12;
            float f13 = (1.0f - pointF5.x) - f12;
            pointF3.x = f13;
            float f14 = (((((f13 * f10) + pointF4.x) * f10) + pointF5.x) * f10) - f7;
            if (Math.abs(f14) < 0.001d) {
                break;
            }
            f10 -= f14 / (((((pointF3.x * 3.0f) * f10) + (pointF4.x * 2.0f)) * f10) + pointF5.x);
            i10++;
        }
        float f15 = pointF2.y * 3.0f;
        pointF5.y = f15;
        float f16 = ((pointF.y - pointF2.y) * 3.0f) - f15;
        pointF4.y = f16;
        float f17 = (1.0f - pointF5.y) - f16;
        pointF3.y = f17;
        return ((((f17 * f10) + pointF4.y) * f10) + pointF5.y) * f10;
    }

    public pr(double d, double d10, double d11, double d12) {
        this((float) d, (float) d10, (float) d11, (float) d12);
    }
}
