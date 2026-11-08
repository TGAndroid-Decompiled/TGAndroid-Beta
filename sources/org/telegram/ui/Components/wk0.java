package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class wk0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f39976w = 0.4f;
    public static final float f39977x = 1.0f - 0.4f;
    public static final float[] f39978y = new float[101];
    public static final float f39979z;
    public int f39980a;
    public int f39981b;
    public int f39982c;
    public int d;
    public int f39983e;
    public int f39984f;
    public int f39985g;
    public int h;
    public int f39986i;
    public int f39987j;
    public int f39988k;
    public long f39989l;
    public int f39990m;
    public float f39991n;
    public float f39992o;
    public float f39993p;
    public final Interpolator f39995r;
    public float f39997t;
    public final float f39998u;
    public boolean f39994q = true;
    public final boolean f39996s = true;

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
                float B = com.google.android.recaptcha.internal.a.B(A2, f39977x, f15 * f39976w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f39978y[i7] = f10 + f11;
        }
        f39978y[100] = 1.0f;
        f39979z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public wk0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f39995r = decelerateInterpolator;
        this.f39998u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z9;
        float f11 = f10 * f39979z;
        if (f11 < 1.0f) {
            z9 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z9 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z9 * A;
    }

    public final void a() {
        this.f39987j = this.d;
        this.f39988k = this.f39983e;
        this.f39994q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f39994q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f39989l);
        int i7 = this.f39990m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f39980a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f39978y;
                    float f12 = fArr[i11];
                    float z9 = com.google.android.recaptcha.internal.a.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f39981b;
                    int round = Math.round((this.d - i13) * z9) + i13;
                    this.f39987j = round;
                    int min = Math.min(round, this.f39985g);
                    this.f39987j = min;
                    this.f39987j = Math.max(min, this.f39984f);
                    int i14 = this.f39982c;
                    int round2 = Math.round(z9 * (this.f39983e - i14)) + i14;
                    this.f39988k = round2;
                    int min2 = Math.min(round2, this.f39986i);
                    this.f39988k = min2;
                    int max = Math.max(min2, this.h);
                    this.f39988k = max;
                    if (this.f39987j == this.d && max == this.f39983e) {
                        this.f39994q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f39991n;
            Interpolator interpolator = this.f39995r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f39987j = Math.round(this.f39992o * interpolation) + this.f39981b;
            this.f39988k = Math.round(interpolation * this.f39993p) + this.f39982c;
            return true;
        }
        this.f39987j = this.d;
        this.f39988k = this.f39983e;
        this.f39994q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f39980a = 0;
        this.f39994q = false;
        this.f39990m = i10;
        this.f39989l = AnimationUtils.currentAnimationTimeMillis();
        this.f39981b = 0;
        this.f39982c = 0;
        this.d = 0;
        this.f39983e = i7;
        this.f39992o = 0;
        this.f39993p = i7;
        this.f39991n = 1.0f / this.f39990m;
    }
}
