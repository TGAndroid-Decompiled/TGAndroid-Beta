package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class vm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f29519w = 0.4f;
    public static final float f29520x = 1.0f - 0.4f;
    public static final float[] f29521y = new float[101];
    public static final float f29522z;
    public int f29523a;
    public int f29524b;
    public int f29525c;
    public int d;
    public int e;
    public int f29526f;
    public int f29527g;
    public int h;
    public int f29528i;
    public int f29529j;
    public int f29530k;
    public long f29531l;
    public int f29532m;
    public float f29533n;
    public float f29534o;
    public float f29535p;
    public final Interpolator f29537r;
    public float f29539t;
    public final float f29540u;
    public boolean f29536q = true;
    public final boolean f29538s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f13 = i10 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float x10 = e2.c.x(f14, f12, 2.0f, f12);
                float f15 = 1.0f - x10;
                f10 = 3.0f * x10 * f15;
                f11 = x10 * x10 * x10;
                float y10 = e2.c.y(x10, f29520x, f15 * f29519w, f10) + f11;
                if (Math.abs(y10 - f13) < 1.0E-5d) {
                    break;
                } else if (y10 > f13) {
                    f14 = x10;
                } else {
                    f12 = x10;
                }
            }
            f29521y[i10] = f10 + f11;
        }
        f29521y[100] = 1.0f;
        f29522z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public vm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f29537r = decelerateInterpolator;
        this.f29540u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float w10;
        float f11 = f10 * f29522z;
        if (f11 < 1.0f) {
            w10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            w10 = e2.c.w(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return w10 * A;
    }

    public final void a() {
        this.f29529j = this.d;
        this.f29530k = this.e;
        this.f29536q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f29536q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f29531l);
        int i10 = this.f29532m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f29523a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f10 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f10 * 100.0f);
                    float f11 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f29521y;
                    float f12 = fArr[i12];
                    float w10 = e2.c.w(fArr[i13], f12, (f10 - f11) / ((i13 / 100.0f) - f11), f12);
                    int i14 = this.f29524b;
                    int round = Math.round((this.d - i14) * w10) + i14;
                    this.f29529j = round;
                    int min = Math.min(round, this.f29527g);
                    this.f29529j = min;
                    this.f29529j = Math.max(min, this.f29526f);
                    int i15 = this.f29525c;
                    int round2 = Math.round(w10 * (this.e - i15)) + i15;
                    this.f29530k = round2;
                    int min2 = Math.min(round2, this.f29528i);
                    this.f29530k = min2;
                    int max = Math.max(min2, this.h);
                    this.f29530k = max;
                    if (this.f29529j == this.d && max == this.e) {
                        this.f29536q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f29533n;
            Interpolator interpolator = this.f29537r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f29529j = Math.round(this.f29534o * interpolation) + this.f29524b;
            this.f29530k = Math.round(interpolation * this.f29535p) + this.f29525c;
            return true;
        }
        this.f29529j = this.d;
        this.f29530k = this.e;
        this.f29536q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f29523a = 0;
        this.f29536q = false;
        this.f29532m = i11;
        this.f29531l = AnimationUtils.currentAnimationTimeMillis();
        this.f29524b = 0;
        this.f29525c = 0;
        this.d = 0;
        this.e = i10;
        this.f29534o = 0;
        this.f29535p = i10;
        this.f29533n = 1.0f / this.f29532m;
    }
}
