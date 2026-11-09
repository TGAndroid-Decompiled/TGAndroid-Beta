package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class xk0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f40406w = 0.4f;
    public static final float f40407x = 1.0f - 0.4f;
    public static final float[] f40408y = new float[101];
    public static final float f40409z;
    public int f40410a;
    public int f40411b;
    public int f40412c;
    public int d;
    public int f40413e;
    public int f40414f;
    public int f40415g;
    public int h;
    public int f40416i;
    public int f40417j;
    public int f40418k;
    public long f40419l;
    public int f40420m;
    public float f40421n;
    public float f40422o;
    public float f40423p;
    public final Interpolator f40425r;
    public float f40427t;
    public final float f40428u;
    public boolean f40424q = true;
    public final boolean f40426s = true;

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
                float B = com.google.android.recaptcha.internal.a.B(A2, f40407x, f15 * f40406w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f40408y[i7] = f10 + f11;
        }
        f40408y[100] = 1.0f;
        f40409z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public xk0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f40425r = decelerateInterpolator;
        this.f40428u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z9;
        float f11 = f10 * f40409z;
        if (f11 < 1.0f) {
            z9 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z9 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z9 * A;
    }

    public final void a() {
        this.f40417j = this.d;
        this.f40418k = this.f40413e;
        this.f40424q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f40424q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f40419l);
        int i7 = this.f40420m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f40410a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f40408y;
                    float f12 = fArr[i11];
                    float z9 = com.google.android.recaptcha.internal.a.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f40411b;
                    int round = Math.round((this.d - i13) * z9) + i13;
                    this.f40417j = round;
                    int min = Math.min(round, this.f40415g);
                    this.f40417j = min;
                    this.f40417j = Math.max(min, this.f40414f);
                    int i14 = this.f40412c;
                    int round2 = Math.round(z9 * (this.f40413e - i14)) + i14;
                    this.f40418k = round2;
                    int min2 = Math.min(round2, this.f40416i);
                    this.f40418k = min2;
                    int max = Math.max(min2, this.h);
                    this.f40418k = max;
                    if (this.f40417j == this.d && max == this.f40413e) {
                        this.f40424q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f40421n;
            Interpolator interpolator = this.f40425r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f40417j = Math.round(this.f40422o * interpolation) + this.f40411b;
            this.f40418k = Math.round(interpolation * this.f40423p) + this.f40412c;
            return true;
        }
        this.f40417j = this.d;
        this.f40418k = this.f40413e;
        this.f40424q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xk0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f40410a = 0;
        this.f40424q = false;
        this.f40420m = i10;
        this.f40419l = AnimationUtils.currentAnimationTimeMillis();
        this.f40411b = 0;
        this.f40412c = 0;
        this.d = 0;
        this.f40413e = i7;
        this.f40422o = 0;
        this.f40423p = i7;
        this.f40421n = 1.0f / this.f40420m;
    }
}
