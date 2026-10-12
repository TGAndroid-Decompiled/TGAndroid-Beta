package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class zn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f33439w = 0.4f;
    public static final float f33440x = 1.0f - 0.4f;
    public static final float[] f33441y = new float[101];
    public static final float f33442z;
    public int f33443a;
    public int f33444b;
    public int f33445c;
    public int d;
    public int f33446e;
    public int f33447f;
    public int f33448g;
    public int h;
    public int f33449i;
    public int f33450j;
    public int f33451k;
    public long f33452l;
    public int f33453m;
    public float f33454n;
    public float f33455o;
    public float f33456p;
    public final Interpolator f33458r;
    public float f33460t;
    public final float f33461u;
    public boolean f33457q = true;
    public final boolean f33459s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float z10 = com.google.android.gms.internal.vision.e2.z(f13, f11, 2.0f, f11);
                float f14 = 1.0f - z10;
                f7 = 3.0f * z10 * f14;
                f10 = z10 * z10 * z10;
                float A2 = com.google.android.gms.internal.vision.e2.A(z10, f33440x, f14 * f33439w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f33441y[i10] = f7 + f10;
        }
        f33441y[100] = 1.0f;
        f33442z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public zn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f33458r = decelerateInterpolator;
        this.f33461u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f33442z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f33450j = this.d;
        this.f33451k = this.f33446e;
        this.f33457q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f33457q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f33452l);
        int i10 = this.f33453m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f33443a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f33441y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.vision.e2.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f33444b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f33450j = round;
                    int min = Math.min(round, this.f33448g);
                    this.f33450j = min;
                    this.f33450j = Math.max(min, this.f33447f);
                    int i15 = this.f33445c;
                    int round2 = Math.round(y3 * (this.f33446e - i15)) + i15;
                    this.f33451k = round2;
                    int min2 = Math.min(round2, this.f33449i);
                    this.f33451k = min2;
                    int max = Math.max(min2, this.h);
                    this.f33451k = max;
                    if (this.f33450j == this.d && max == this.f33446e) {
                        this.f33457q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f33454n;
            Interpolator interpolator = this.f33458r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f33450j = Math.round(this.f33455o * interpolation) + this.f33444b;
            this.f33451k = Math.round(interpolation * this.f33456p) + this.f33445c;
            return true;
        }
        this.f33450j = this.d;
        this.f33451k = this.f33446e;
        this.f33457q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f33443a = 0;
        this.f33457q = false;
        this.f33453m = i11;
        this.f33452l = AnimationUtils.currentAnimationTimeMillis();
        this.f33444b = 0;
        this.f33445c = 0;
        this.d = 0;
        this.f33446e = i10;
        this.f33455o = 0;
        this.f33456p = i10;
        this.f33454n = 1.0f / this.f33453m;
    }
}
