package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class wk0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f39991w = 0.4f;
    public static final float f39992x = 1.0f - 0.4f;
    public static final float[] f39993y = new float[101];
    public static final float f39994z;
    public int f39995a;
    public int f39996b;
    public int f39997c;
    public int d;
    public int f39998e;
    public int f39999f;
    public int f40000g;
    public int h;
    public int f40001i;
    public int f40002j;
    public int f40003k;
    public long f40004l;
    public int f40005m;
    public float f40006n;
    public float f40007o;
    public float f40008p;
    public final Interpolator f40010r;
    public float f40012t;
    public final float f40013u;
    public boolean f40009q = true;
    public final boolean f40011s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i7 = 0; i7 <= 100; i7++) {
            float f13 = i7 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float A2 = com.google.android.recaptcha.internal.a.A(f14, f12, 2.0f, f12);
                float f15 = 1.0f - A2;
                f10 = 3.0f * A2 * f15;
                f11 = A2 * A2 * A2;
                float B = com.google.android.recaptcha.internal.a.B(A2, f39992x, f15 * f39991w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f39993y[i7] = f10 + f11;
        }
        f39993y[100] = 1.0f;
        f39994z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public wk0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f40010r = decelerateInterpolator;
        this.f40013u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z9;
        float f11 = f10 * f39994z;
        if (f11 < 1.0f) {
            z9 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z9 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z9 * A;
    }

    public final void a() {
        this.f40002j = this.d;
        this.f40003k = this.f39998e;
        this.f40009q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f40009q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f40004l);
        int i7 = this.f40005m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f39995a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f39993y;
                    float f12 = fArr[i11];
                    float z9 = com.google.android.recaptcha.internal.a.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f39996b;
                    int round = Math.round((this.d - i13) * z9) + i13;
                    this.f40002j = round;
                    int min = Math.min(round, this.f40000g);
                    this.f40002j = min;
                    this.f40002j = Math.max(min, this.f39999f);
                    int i14 = this.f39997c;
                    int round2 = Math.round(z9 * (this.f39998e - i14)) + i14;
                    this.f40003k = round2;
                    int min2 = Math.min(round2, this.f40001i);
                    this.f40003k = min2;
                    int max = Math.max(min2, this.h);
                    this.f40003k = max;
                    if (this.f40002j == this.d && max == this.f39998e) {
                        this.f40009q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f40006n;
            Interpolator interpolator = this.f40010r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f40002j = Math.round(this.f40007o * interpolation) + this.f39996b;
            this.f40003k = Math.round(interpolation * this.f40008p) + this.f39997c;
            return true;
        }
        this.f40002j = this.d;
        this.f40003k = this.f39998e;
        this.f40009q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f39995a = 0;
        this.f40009q = false;
        this.f40005m = i10;
        this.f40004l = AnimationUtils.currentAnimationTimeMillis();
        this.f39996b = 0;
        this.f39997c = 0;
        this.d = 0;
        this.f39998e = i7;
        this.f40007o = 0;
        this.f40008p = i7;
        this.f40006n = 1.0f / this.f40005m;
    }
}
