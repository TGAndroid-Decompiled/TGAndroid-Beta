package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class ll0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f37215w = 0.4f;
    public static final float f37216x = 1.0f - 0.4f;
    public static final float[] f37217y = new float[101];
    public static final float f37218z;
    public int f37219a;
    public int f37220b;
    public int f37221c;
    public int d;
    public int f37222e;
    public int f37223f;
    public int f37224g;
    public int h;
    public int f37225i;
    public int f37226j;
    public int f37227k;
    public long f37228l;
    public int f37229m;
    public float f37230n;
    public float f37231o;
    public float f37232p;
    public final Interpolator f37234r;
    public float f37236t;
    public final float f37237u;
    public boolean f37233q = true;
    public final boolean f37235s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f37216x, f15 * f37215w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f37217y[i7] = f10 + f11;
        }
        f37217y[100] = 1.0f;
        f37218z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public ll0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f37234r = decelerateInterpolator;
        this.f37237u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z10;
        float f11 = f10 * f37218z;
        if (f11 < 1.0f) {
            z10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f37226j = this.d;
        this.f37227k = this.f37222e;
        this.f37233q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f37233q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f37228l);
        int i7 = this.f37229m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f37219a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f37217y;
                    float f12 = fArr[i11];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f37220b;
                    int round = Math.round((this.d - i13) * z10) + i13;
                    this.f37226j = round;
                    int min = Math.min(round, this.f37224g);
                    this.f37226j = min;
                    this.f37226j = Math.max(min, this.f37223f);
                    int i14 = this.f37221c;
                    int round2 = Math.round(z10 * (this.f37222e - i14)) + i14;
                    this.f37227k = round2;
                    int min2 = Math.min(round2, this.f37225i);
                    this.f37227k = min2;
                    int max = Math.max(min2, this.h);
                    this.f37227k = max;
                    if (this.f37226j == this.d && max == this.f37222e) {
                        this.f37233q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f37230n;
            Interpolator interpolator = this.f37234r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f37226j = Math.round(this.f37231o * interpolation) + this.f37220b;
            this.f37227k = Math.round(interpolation * this.f37232p) + this.f37221c;
            return true;
        }
        this.f37226j = this.d;
        this.f37227k = this.f37222e;
        this.f37233q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ll0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f37219a = 0;
        this.f37233q = false;
        this.f37229m = i10;
        this.f37228l = AnimationUtils.currentAnimationTimeMillis();
        this.f37220b = 0;
        this.f37221c = 0;
        this.d = 0;
        this.f37222e = i7;
        this.f37231o = 0;
        this.f37232p = i7;
        this.f37230n = 1.0f / this.f37229m;
    }
}
