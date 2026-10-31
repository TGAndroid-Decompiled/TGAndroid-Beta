package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class zl0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f33107w = 0.4f;
    public static final float f33108x = 1.0f - 0.4f;
    public static final float[] f33109y = new float[101];
    public static final float f33110z;
    public int f33111a;
    public int f33112b;
    public int f33113c;
    public int d;
    public int e;
    public int f33114f;
    public int f33115g;
    public int h;
    public int f33116i;
    public int f33117j;
    public int f33118k;
    public long f33119l;
    public int f33120m;
    public float f33121n;
    public float f33122o;
    public float f33123p;
    public final Interpolator f33125r;
    public float f33127t;
    public final float f33128u;
    public boolean f33124q = true;
    public final boolean f33126s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float B = c3.i0.B(f13, f11, 2.0f, f11);
                float f14 = 1.0f - B;
                f7 = 3.0f * B * f14;
                f10 = B * B * B;
                float C = c3.i0.C(B, f33108x, f14 * f33107w, f7) + f10;
                if (Math.abs(C - f12) < 1.0E-5d) {
                    break;
                } else if (C > f12) {
                    f13 = B;
                } else {
                    f11 = B;
                }
            }
            f33109y[i10] = f7 + f10;
        }
        f33109y[100] = 1.0f;
        f33110z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public zl0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f33125r = decelerateInterpolator;
        this.f33128u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f33110z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = c3.i0.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f33117j = this.d;
        this.f33118k = this.e;
        this.f33124q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f33124q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f33119l);
        int i10 = this.f33120m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f33111a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f33109y;
                    float f11 = fArr[i12];
                    float z10 = c3.i0.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f33112b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f33117j = round;
                    int min = Math.min(round, this.f33115g);
                    this.f33117j = min;
                    this.f33117j = Math.max(min, this.f33114f);
                    int i15 = this.f33113c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f33118k = round2;
                    int min2 = Math.min(round2, this.f33116i);
                    this.f33118k = min2;
                    int max = Math.max(min2, this.h);
                    this.f33118k = max;
                    if (this.f33117j == this.d && max == this.e) {
                        this.f33124q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f33121n;
            Interpolator interpolator = this.f33125r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f33117j = Math.round(this.f33122o * interpolation) + this.f33112b;
            this.f33118k = Math.round(interpolation * this.f33123p) + this.f33113c;
            return true;
        }
        this.f33117j = this.d;
        this.f33118k = this.e;
        this.f33124q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zl0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f33111a = 0;
        this.f33124q = false;
        this.f33120m = i11;
        this.f33119l = AnimationUtils.currentAnimationTimeMillis();
        this.f33112b = 0;
        this.f33113c = 0;
        this.d = 0;
        this.e = i10;
        this.f33122o = 0;
        this.f33123p = i10;
        this.f33121n = 1.0f / this.f33120m;
    }
}
