package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class yl0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f35004w = 0.4f;
    public static final float f35005x = 1.0f - 0.4f;
    public static final float[] f35006y = new float[101];
    public static final float f35007z;
    public int f35008a;
    public int f35009b;
    public int f35010c;
    public int d;
    public int f35011e;
    public int f35012f;
    public int f35013g;
    public int h;
    public int f35014i;
    public int f35015j;
    public int f35016k;
    public long f35017l;
    public int f35018m;
    public float f35019n;
    public float f35020o;
    public float f35021p;
    public final Interpolator f35023r;
    public float f35025t;
    public final float f35026u;
    public boolean f35022q = true;
    public final boolean f35024s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i9 = 0; i9 <= 100; i9++) {
            float f13 = i9 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float A2 = e2.c.A(f14, f12, 2.0f, f12);
                float f15 = 1.0f - A2;
                f10 = 3.0f * A2 * f15;
                f11 = A2 * A2 * A2;
                float B = e2.c.B(A2, f35005x, f15 * f35004w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f35006y[i9] = f10 + f11;
        }
        f35006y[100] = 1.0f;
        f35007z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public yl0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f35023r = decelerateInterpolator;
        this.f35026u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z10;
        float f11 = f10 * f35007z;
        if (f11 < 1.0f) {
            z10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z10 = e2.c.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f35015j = this.d;
        this.f35016k = this.f35011e;
        this.f35022q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f35022q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f35017l);
        int i9 = this.f35018m;
        if (currentAnimationTimeMillis < i9) {
            int i10 = this.f35008a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i9;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f35006y;
                    float f12 = fArr[i11];
                    float z10 = e2.c.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f35009b;
                    int round = Math.round((this.d - i13) * z10) + i13;
                    this.f35015j = round;
                    int min = Math.min(round, this.f35013g);
                    this.f35015j = min;
                    this.f35015j = Math.max(min, this.f35012f);
                    int i14 = this.f35010c;
                    int round2 = Math.round(z10 * (this.f35011e - i14)) + i14;
                    this.f35016k = round2;
                    int min2 = Math.min(round2, this.f35014i);
                    this.f35016k = min2;
                    int max = Math.max(min2, this.h);
                    this.f35016k = max;
                    if (this.f35015j == this.d && max == this.f35011e) {
                        this.f35022q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f35019n;
            Interpolator interpolator = this.f35023r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f35015j = Math.round(this.f35020o * interpolation) + this.f35009b;
            this.f35016k = Math.round(interpolation * this.f35021p) + this.f35010c;
            return true;
        }
        this.f35015j = this.d;
        this.f35016k = this.f35011e;
        this.f35022q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yl0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i9, int i10) {
        this.f35008a = 0;
        this.f35022q = false;
        this.f35018m = i10;
        this.f35017l = AnimationUtils.currentAnimationTimeMillis();
        this.f35009b = 0;
        this.f35010c = 0;
        this.d = 0;
        this.f35011e = i9;
        this.f35020o = 0;
        this.f35021p = i9;
        this.f35019n = 1.0f / this.f35018m;
    }
}
