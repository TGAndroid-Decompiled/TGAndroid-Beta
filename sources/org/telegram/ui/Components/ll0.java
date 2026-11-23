package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class ll0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f37158w = 0.4f;
    public static final float f37159x = 1.0f - 0.4f;
    public static final float[] f37160y = new float[101];
    public static final float f37161z;
    public int f37162a;
    public int f37163b;
    public int f37164c;
    public int d;
    public int f37165e;
    public int f37166f;
    public int f37167g;
    public int h;
    public int f37168i;
    public int f37169j;
    public int f37170k;
    public long f37171l;
    public int f37172m;
    public float f37173n;
    public float f37174o;
    public float f37175p;
    public final Interpolator f37177r;
    public float f37179t;
    public final float f37180u;
    public boolean f37176q = true;
    public final boolean f37178s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i7 = 0; i7 <= 100; i7++) {
            float f13 = i7 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float A2 = com.google.android.gms.internal.vision.e2.A(f14, f12, 2.0f, f12);
                float f15 = 1.0f - A2;
                f10 = 3.0f * A2 * f15;
                f11 = A2 * A2 * A2;
                float B = com.google.android.gms.internal.vision.e2.B(A2, f37159x, f15 * f37158w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f37160y[i7] = f10 + f11;
        }
        f37160y[100] = 1.0f;
        f37161z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public ll0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f37177r = decelerateInterpolator;
        this.f37180u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z10;
        float f11 = f10 * f37161z;
        if (f11 < 1.0f) {
            z10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f37169j = this.d;
        this.f37170k = this.f37165e;
        this.f37176q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f37176q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f37171l);
        int i7 = this.f37172m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f37162a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f37160y;
                    float f12 = fArr[i11];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f37163b;
                    int round = Math.round((this.d - i13) * z10) + i13;
                    this.f37169j = round;
                    int min = Math.min(round, this.f37167g);
                    this.f37169j = min;
                    this.f37169j = Math.max(min, this.f37166f);
                    int i14 = this.f37164c;
                    int round2 = Math.round(z10 * (this.f37165e - i14)) + i14;
                    this.f37170k = round2;
                    int min2 = Math.min(round2, this.f37168i);
                    this.f37170k = min2;
                    int max = Math.max(min2, this.h);
                    this.f37170k = max;
                    if (this.f37169j == this.d && max == this.f37165e) {
                        this.f37176q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f37173n;
            Interpolator interpolator = this.f37177r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f37169j = Math.round(this.f37174o * interpolation) + this.f37163b;
            this.f37170k = Math.round(interpolation * this.f37175p) + this.f37164c;
            return true;
        }
        this.f37169j = this.d;
        this.f37170k = this.f37165e;
        this.f37176q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ll0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f37162a = 0;
        this.f37176q = false;
        this.f37172m = i10;
        this.f37171l = AnimationUtils.currentAnimationTimeMillis();
        this.f37163b = 0;
        this.f37164c = 0;
        this.d = 0;
        this.f37165e = i7;
        this.f37174o = 0;
        this.f37175p = i7;
        this.f37173n = 1.0f / this.f37172m;
    }
}
