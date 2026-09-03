package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class vm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f31916w = 0.4f;
    public static final float f31917x = 1.0f - 0.4f;
    public static final float[] f31918y = new float[101];
    public static final float f31919z;
    public int f31920a;
    public int f31921b;
    public int f31922c;
    public int d;
    public int f31923e;
    public int f31924f;
    public int f31925g;
    public int h;
    public int f31926i;
    public int f31927j;
    public int f31928k;
    public long f31929l;
    public int f31930m;
    public float f31931n;
    public float f31932o;
    public float f31933p;
    public final Interpolator f31935r;
    public float f31937t;
    public final float f31938u;
    public boolean f31934q = true;
    public final boolean f31936s = true;

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
                float y10 = e2.c.y(x10, f31917x, f15 * f31916w, f10) + f11;
                if (Math.abs(y10 - f13) < 1.0E-5d) {
                    break;
                } else if (y10 > f13) {
                    f14 = x10;
                } else {
                    f12 = x10;
                }
            }
            f31918y[i10] = f10 + f11;
        }
        f31918y[100] = 1.0f;
        f31919z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public vm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f31935r = decelerateInterpolator;
        this.f31938u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float w10;
        float f11 = f10 * f31919z;
        if (f11 < 1.0f) {
            w10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            w10 = e2.c.w(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return w10 * A;
    }

    public final void a() {
        this.f31927j = this.d;
        this.f31928k = this.f31923e;
        this.f31934q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f31934q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f31929l);
        int i10 = this.f31930m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f31920a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f10 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f10 * 100.0f);
                    float f11 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f31918y;
                    float f12 = fArr[i12];
                    float w10 = e2.c.w(fArr[i13], f12, (f10 - f11) / ((i13 / 100.0f) - f11), f12);
                    int i14 = this.f31921b;
                    int round = Math.round((this.d - i14) * w10) + i14;
                    this.f31927j = round;
                    int min = Math.min(round, this.f31925g);
                    this.f31927j = min;
                    this.f31927j = Math.max(min, this.f31924f);
                    int i15 = this.f31922c;
                    int round2 = Math.round(w10 * (this.f31923e - i15)) + i15;
                    this.f31928k = round2;
                    int min2 = Math.min(round2, this.f31926i);
                    this.f31928k = min2;
                    int max = Math.max(min2, this.h);
                    this.f31928k = max;
                    if (this.f31927j == this.d && max == this.f31923e) {
                        this.f31934q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f31931n;
            Interpolator interpolator = this.f31935r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f31927j = Math.round(this.f31932o * interpolation) + this.f31921b;
            this.f31928k = Math.round(interpolation * this.f31933p) + this.f31922c;
            return true;
        }
        this.f31927j = this.d;
        this.f31928k = this.f31923e;
        this.f31934q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f31920a = 0;
        this.f31934q = false;
        this.f31930m = i11;
        this.f31929l = AnimationUtils.currentAnimationTimeMillis();
        this.f31921b = 0;
        this.f31922c = 0;
        this.d = 0;
        this.f31923e = i10;
        this.f31932o = 0;
        this.f31933p = i10;
        this.f31931n = 1.0f / this.f31930m;
    }
}
