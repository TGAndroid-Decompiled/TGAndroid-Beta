package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class am0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f24440w = 0.4f;
    public static final float f24441x = 1.0f - 0.4f;
    public static final float[] f24442y = new float[101];
    public static final float f24443z;
    public int f24444a;
    public int f24445b;
    public int f24446c;
    public int d;
    public int e;
    public int f24447f;
    public int f24448g;
    public int h;
    public int f24449i;
    public int f24450j;
    public int f24451k;
    public long f24452l;
    public int f24453m;
    public float f24454n;
    public float f24455o;
    public float f24456p;
    public final Interpolator f24458r;
    public float f24460t;
    public final float f24461u;
    public boolean f24457q = true;
    public final boolean f24459s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float B = c3.i0.B(f13, f11, 2.0f, f11);
                float f14 = 1.0f - B;
                f7 = 3.0f * B * f14;
                f10 = B * B * B;
                float C = c3.i0.C(B, f24441x, f14 * f24440w, f7) + f10;
                if (Math.abs(C - f12) < 1.0E-5d) {
                    break;
                } else if (C > f12) {
                    f13 = B;
                } else {
                    f11 = B;
                }
            }
            f24442y[i10] = f7 + f10;
        }
        f24442y[100] = 1.0f;
        f24443z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public am0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f24458r = decelerateInterpolator;
        this.f24461u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f24443z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = c3.i0.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f24450j = this.d;
        this.f24451k = this.e;
        this.f24457q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f24457q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f24452l);
        int i10 = this.f24453m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f24444a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f24442y;
                    float f11 = fArr[i12];
                    float z10 = c3.i0.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f24445b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f24450j = round;
                    int min = Math.min(round, this.f24448g);
                    this.f24450j = min;
                    this.f24450j = Math.max(min, this.f24447f);
                    int i15 = this.f24446c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f24451k = round2;
                    int min2 = Math.min(round2, this.f24449i);
                    this.f24451k = min2;
                    int max = Math.max(min2, this.h);
                    this.f24451k = max;
                    if (this.f24450j == this.d && max == this.e) {
                        this.f24457q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f24454n;
            Interpolator interpolator = this.f24458r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f24450j = Math.round(this.f24455o * interpolation) + this.f24445b;
            this.f24451k = Math.round(interpolation * this.f24456p) + this.f24446c;
            return true;
        }
        this.f24450j = this.d;
        this.f24451k = this.e;
        this.f24457q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.am0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f24444a = 0;
        this.f24457q = false;
        this.f24453m = i11;
        this.f24452l = AnimationUtils.currentAnimationTimeMillis();
        this.f24445b = 0;
        this.f24446c = 0;
        this.d = 0;
        this.e = i10;
        this.f24455o = 0;
        this.f24456p = i10;
        this.f24454n = 1.0f / this.f24453m;
    }
}
