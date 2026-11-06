package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class wk0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f40026w = 0.4f;
    public static final float f40027x = 1.0f - 0.4f;
    public static final float[] f40028y = new float[101];
    public static final float f40029z;
    public int f40030a;
    public int f40031b;
    public int f40032c;
    public int d;
    public int f40033e;
    public int f40034f;
    public int f40035g;
    public int h;
    public int f40036i;
    public int f40037j;
    public int f40038k;
    public long f40039l;
    public int f40040m;
    public float f40041n;
    public float f40042o;
    public float f40043p;
    public final Interpolator f40045r;
    public float f40047t;
    public final float f40048u;
    public boolean f40044q = true;
    public final boolean f40046s = true;

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
                float B = com.google.android.recaptcha.internal.a.B(A2, f40027x, f15 * f40026w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f40028y[i7] = f10 + f11;
        }
        f40028y[100] = 1.0f;
        f40029z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public wk0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f40045r = decelerateInterpolator;
        this.f40048u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z9;
        float f11 = f10 * f40029z;
        if (f11 < 1.0f) {
            z9 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z9 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z9 * A;
    }

    public final void a() {
        this.f40037j = this.d;
        this.f40038k = this.f40033e;
        this.f40044q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f40044q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f40039l);
        int i7 = this.f40040m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f40030a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f40028y;
                    float f12 = fArr[i11];
                    float z9 = com.google.android.recaptcha.internal.a.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f40031b;
                    int round = Math.round((this.d - i13) * z9) + i13;
                    this.f40037j = round;
                    int min = Math.min(round, this.f40035g);
                    this.f40037j = min;
                    this.f40037j = Math.max(min, this.f40034f);
                    int i14 = this.f40032c;
                    int round2 = Math.round(z9 * (this.f40033e - i14)) + i14;
                    this.f40038k = round2;
                    int min2 = Math.min(round2, this.f40036i);
                    this.f40038k = min2;
                    int max = Math.max(min2, this.h);
                    this.f40038k = max;
                    if (this.f40037j == this.d && max == this.f40033e) {
                        this.f40044q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f40041n;
            Interpolator interpolator = this.f40045r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f40037j = Math.round(this.f40042o * interpolation) + this.f40031b;
            this.f40038k = Math.round(interpolation * this.f40043p) + this.f40032c;
            return true;
        }
        this.f40037j = this.d;
        this.f40038k = this.f40033e;
        this.f40044q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f40030a = 0;
        this.f40044q = false;
        this.f40040m = i10;
        this.f40039l = AnimationUtils.currentAnimationTimeMillis();
        this.f40031b = 0;
        this.f40032c = 0;
        this.d = 0;
        this.f40033e = i7;
        this.f40042o = 0;
        this.f40043p = i7;
        this.f40041n = 1.0f / this.f40040m;
    }
}
