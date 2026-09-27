package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class bn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f23076w = 0.4f;
    public static final float f23077x = 1.0f - 0.4f;
    public static final float[] f23078y = new float[101];
    public static final float f23079z;
    public int f23080a;
    public int f23081b;
    public int f23082c;
    public int d;
    public int e;
    public int f23083f;
    public int f23084g;
    public int h;
    public int f23085i;
    public int f23086j;
    public int f23087k;
    public long f23088l;
    public int f23089m;
    public float f23090n;
    public float f23091o;
    public float f23092p;
    public final Interpolator f23094r;
    public float f23096t;
    public final float f23097u;
    public boolean f23093q = true;
    public final boolean f23095s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float A2 = com.google.android.gms.internal.vision.e2.A(f13, f11, 2.0f, f11);
                float f14 = 1.0f - A2;
                f7 = 3.0f * A2 * f14;
                f10 = A2 * A2 * A2;
                float B = com.google.android.gms.internal.vision.e2.B(A2, f23077x, f14 * f23076w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f23078y[i10] = f7 + f10;
        }
        f23078y[100] = 1.0f;
        f23079z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public bn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f23094r = decelerateInterpolator;
        this.f23097u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f23079z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f23086j = this.d;
        this.f23087k = this.e;
        this.f23093q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f23093q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f23088l);
        int i10 = this.f23089m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f23080a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f23078y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f23081b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f23086j = round;
                    int min = Math.min(round, this.f23084g);
                    this.f23086j = min;
                    this.f23086j = Math.max(min, this.f23083f);
                    int i15 = this.f23082c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f23087k = round2;
                    int min2 = Math.min(round2, this.f23085i);
                    this.f23087k = min2;
                    int max = Math.max(min2, this.h);
                    this.f23087k = max;
                    if (this.f23086j == this.d && max == this.e) {
                        this.f23093q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f23090n;
            Interpolator interpolator = this.f23094r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f23086j = Math.round(this.f23091o * interpolation) + this.f23081b;
            this.f23087k = Math.round(interpolation * this.f23092p) + this.f23082c;
            return true;
        }
        this.f23086j = this.d;
        this.f23087k = this.e;
        this.f23093q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f23080a = 0;
        this.f23093q = false;
        this.f23089m = i11;
        this.f23088l = AnimationUtils.currentAnimationTimeMillis();
        this.f23081b = 0;
        this.f23082c = 0;
        this.d = 0;
        this.e = i10;
        this.f23091o = 0;
        this.f23092p = i10;
        this.f23090n = 1.0f / this.f23089m;
    }
}
