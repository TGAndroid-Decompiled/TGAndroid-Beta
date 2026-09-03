package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class um0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f29245w = 0.4f;
    public static final float f29246x = 1.0f - 0.4f;
    public static final float[] f29247y = new float[101];
    public static final float f29248z;
    public int f29249a;
    public int f29250b;
    public int f29251c;
    public int d;
    public int e;
    public int f29252f;
    public int f29253g;
    public int h;
    public int f29254i;
    public int f29255j;
    public int f29256k;
    public long f29257l;
    public int f29258m;
    public float f29259n;
    public float f29260o;
    public float f29261p;
    public final Interpolator f29263r;
    public float f29265t;
    public final float f29266u;
    public boolean f29262q = true;
    public final boolean f29264s = true;

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
                float y10 = e2.c.y(x10, f29246x, f15 * f29245w, f10) + f11;
                if (Math.abs(y10 - f13) < 1.0E-5d) {
                    break;
                } else if (y10 > f13) {
                    f14 = x10;
                } else {
                    f12 = x10;
                }
            }
            f29247y[i10] = f10 + f11;
        }
        f29247y[100] = 1.0f;
        f29248z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public um0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f29263r = decelerateInterpolator;
        this.f29266u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float w10;
        float f11 = f10 * f29248z;
        if (f11 < 1.0f) {
            w10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            w10 = e2.c.w(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return w10 * A;
    }

    public final void a() {
        this.f29255j = this.d;
        this.f29256k = this.e;
        this.f29262q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f29262q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f29257l);
        int i10 = this.f29258m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f29249a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f10 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f10 * 100.0f);
                    float f11 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f29247y;
                    float f12 = fArr[i12];
                    float w10 = e2.c.w(fArr[i13], f12, (f10 - f11) / ((i13 / 100.0f) - f11), f12);
                    int i14 = this.f29250b;
                    int round = Math.round((this.d - i14) * w10) + i14;
                    this.f29255j = round;
                    int min = Math.min(round, this.f29253g);
                    this.f29255j = min;
                    this.f29255j = Math.max(min, this.f29252f);
                    int i15 = this.f29251c;
                    int round2 = Math.round(w10 * (this.e - i15)) + i15;
                    this.f29256k = round2;
                    int min2 = Math.min(round2, this.f29254i);
                    this.f29256k = min2;
                    int max = Math.max(min2, this.h);
                    this.f29256k = max;
                    if (this.f29255j == this.d && max == this.e) {
                        this.f29262q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f29259n;
            Interpolator interpolator = this.f29263r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f29255j = Math.round(this.f29260o * interpolation) + this.f29250b;
            this.f29256k = Math.round(interpolation * this.f29261p) + this.f29251c;
            return true;
        }
        this.f29255j = this.d;
        this.f29256k = this.e;
        this.f29262q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.um0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f29249a = 0;
        this.f29262q = false;
        this.f29258m = i11;
        this.f29257l = AnimationUtils.currentAnimationTimeMillis();
        this.f29250b = 0;
        this.f29251c = 0;
        this.d = 0;
        this.e = i10;
        this.f29260o = 0;
        this.f29261p = i10;
        this.f29259n = 1.0f / this.f29258m;
    }
}
