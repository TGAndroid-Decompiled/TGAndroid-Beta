package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class un0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f33448w = 0.4f;
    public static final float f33449x = 1.0f - 0.4f;
    public static final float[] f33450y = new float[101];
    public static final float f33451z;
    public int f33452a;
    public int f33453b;
    public int f33454c;
    public int d;
    public int e;
    public int f33455f;
    public int f33456g;
    public int h;
    public int f33457i;
    public int f33458j;
    public int f33459k;
    public long f33460l;
    public int f33461m;
    public float f33462n;
    public float f33463o;
    public float f33464p;
    public final Interpolator f33466r;
    public float f33468t;
    public final float f33469u;
    public boolean f33465q = true;
    public final boolean f33467s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float B = c3.h0.B(f13, f11, 2.0f, f11);
                float f14 = 1.0f - B;
                f7 = 3.0f * B * f14;
                f10 = B * B * B;
                float C = c3.h0.C(B, f33449x, f14 * f33448w, f7) + f10;
                if (Math.abs(C - f12) < 1.0E-5d) {
                    break;
                } else if (C > f12) {
                    f13 = B;
                } else {
                    f11 = B;
                }
            }
            f33450y[i10] = f7 + f10;
        }
        f33450y[100] = 1.0f;
        f33451z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public un0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f33466r = decelerateInterpolator;
        this.f33469u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f33451z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = c3.h0.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f33458j = this.d;
        this.f33459k = this.e;
        this.f33465q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f33465q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f33460l);
        int i10 = this.f33461m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f33452a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f33450y;
                    float f11 = fArr[i12];
                    float z10 = c3.h0.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f33453b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f33458j = round;
                    int min = Math.min(round, this.f33456g);
                    this.f33458j = min;
                    this.f33458j = Math.max(min, this.f33455f);
                    int i15 = this.f33454c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f33459k = round2;
                    int min2 = Math.min(round2, this.f33457i);
                    this.f33459k = min2;
                    int max = Math.max(min2, this.h);
                    this.f33459k = max;
                    if (this.f33458j == this.d && max == this.e) {
                        this.f33465q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f33462n;
            Interpolator interpolator = this.f33466r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f33458j = Math.round(this.f33463o * interpolation) + this.f33453b;
            this.f33459k = Math.round(interpolation * this.f33464p) + this.f33454c;
            return true;
        }
        this.f33458j = this.d;
        this.f33459k = this.e;
        this.f33465q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.un0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f33452a = 0;
        this.f33465q = false;
        this.f33461m = i11;
        this.f33460l = AnimationUtils.currentAnimationTimeMillis();
        this.f33453b = 0;
        this.f33454c = 0;
        this.d = 0;
        this.e = i10;
        this.f33463o = 0;
        this.f33464p = i10;
        this.f33462n = 1.0f / this.f33461m;
    }
}
