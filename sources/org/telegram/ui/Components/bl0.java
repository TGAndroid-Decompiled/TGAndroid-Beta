package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class bl0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f33300w = 0.4f;
    public static final float f33301x = 1.0f - 0.4f;
    public static final float[] f33302y = new float[101];
    public static final float f33303z;
    public int f33304a;
    public int f33305b;
    public int f33306c;
    public int d;
    public int f33307e;
    public int f33308f;
    public int f33309g;
    public int h;
    public int f33310i;
    public int f33311j;
    public int f33312k;
    public long f33313l;
    public int f33314m;
    public float f33315n;
    public float f33316o;
    public float f33317p;
    public final Interpolator f33319r;
    public float f33321t;
    public final float f33322u;
    public boolean f33318q = true;
    public final boolean f33320s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f33301x, f15 * f33300w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f33302y[i7] = f10 + f11;
        }
        f33302y[100] = 1.0f;
        f33303z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public bl0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f33319r = decelerateInterpolator;
        this.f33322u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z10;
        float f11 = f10 * f33303z;
        if (f11 < 1.0f) {
            z10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f33311j = this.d;
        this.f33312k = this.f33307e;
        this.f33318q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f33318q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f33313l);
        int i7 = this.f33314m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f33304a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f33302y;
                    float f12 = fArr[i11];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f33305b;
                    int round = Math.round((this.d - i13) * z10) + i13;
                    this.f33311j = round;
                    int min = Math.min(round, this.f33309g);
                    this.f33311j = min;
                    this.f33311j = Math.max(min, this.f33308f);
                    int i14 = this.f33306c;
                    int round2 = Math.round(z10 * (this.f33307e - i14)) + i14;
                    this.f33312k = round2;
                    int min2 = Math.min(round2, this.f33310i);
                    this.f33312k = min2;
                    int max = Math.max(min2, this.h);
                    this.f33312k = max;
                    if (this.f33311j == this.d && max == this.f33307e) {
                        this.f33318q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f33315n;
            Interpolator interpolator = this.f33319r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f33311j = Math.round(this.f33316o * interpolation) + this.f33305b;
            this.f33312k = Math.round(interpolation * this.f33317p) + this.f33306c;
            return true;
        }
        this.f33311j = this.d;
        this.f33312k = this.f33307e;
        this.f33318q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bl0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f33304a = 0;
        this.f33318q = false;
        this.f33314m = i10;
        this.f33313l = AnimationUtils.currentAnimationTimeMillis();
        this.f33305b = 0;
        this.f33306c = 0;
        this.d = 0;
        this.f33307e = i7;
        this.f33316o = 0;
        this.f33317p = i7;
        this.f33315n = 1.0f / this.f33314m;
    }
}
