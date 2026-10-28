package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class vn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f33780w = 0.4f;
    public static final float f33781x = 1.0f - 0.4f;
    public static final float[] f33782y = new float[101];
    public static final float f33783z;
    public int f33784a;
    public int f33785b;
    public int f33786c;
    public int d;
    public int e;
    public int f33787f;
    public int f33788g;
    public int h;
    public int f33789i;
    public int f33790j;
    public int f33791k;
    public long f33792l;
    public int f33793m;
    public float f33794n;
    public float f33795o;
    public float f33796p;
    public final Interpolator f33798r;
    public float f33800t;
    public final float f33801u;
    public boolean f33797q = true;
    public final boolean f33799s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float B = c3.h0.B(f13, f11, 2.0f, f11);
                float f14 = 1.0f - B;
                f7 = 3.0f * B * f14;
                f10 = B * B * B;
                float C = c3.h0.C(B, f33781x, f14 * f33780w, f7) + f10;
                if (Math.abs(C - f12) < 1.0E-5d) {
                    break;
                } else if (C > f12) {
                    f13 = B;
                } else {
                    f11 = B;
                }
            }
            f33782y[i10] = f7 + f10;
        }
        f33782y[100] = 1.0f;
        f33783z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public vn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f33798r = decelerateInterpolator;
        this.f33801u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f33783z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = c3.h0.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f33790j = this.d;
        this.f33791k = this.e;
        this.f33797q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f33797q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f33792l);
        int i10 = this.f33793m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f33784a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f33782y;
                    float f11 = fArr[i12];
                    float z10 = c3.h0.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f33785b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f33790j = round;
                    int min = Math.min(round, this.f33788g);
                    this.f33790j = min;
                    this.f33790j = Math.max(min, this.f33787f);
                    int i15 = this.f33786c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f33791k = round2;
                    int min2 = Math.min(round2, this.f33789i);
                    this.f33791k = min2;
                    int max = Math.max(min2, this.h);
                    this.f33791k = max;
                    if (this.f33790j == this.d && max == this.e) {
                        this.f33797q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f33794n;
            Interpolator interpolator = this.f33798r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f33790j = Math.round(this.f33795o * interpolation) + this.f33785b;
            this.f33791k = Math.round(interpolation * this.f33796p) + this.f33786c;
            return true;
        }
        this.f33790j = this.d;
        this.f33791k = this.e;
        this.f33797q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f33784a = 0;
        this.f33797q = false;
        this.f33793m = i11;
        this.f33792l = AnimationUtils.currentAnimationTimeMillis();
        this.f33785b = 0;
        this.f33786c = 0;
        this.d = 0;
        this.e = i10;
        this.f33795o = 0;
        this.f33796p = i10;
        this.f33794n = 1.0f / this.f33793m;
    }
}
