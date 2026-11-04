package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class al0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f31872w = 0.4f;
    public static final float f31873x = 1.0f - 0.4f;
    public static final float[] f31874y = new float[101];
    public static final float f31875z;
    public int f31876a;
    public int f31877b;
    public int f31878c;
    public int d;
    public int f31879e;
    public int f31880f;
    public int f31881g;
    public int h;
    public int f31882i;
    public int f31883j;
    public int f31884k;
    public long f31885l;
    public int f31886m;
    public float f31887n;
    public float f31888o;
    public float f31889p;
    public final Interpolator f31891r;
    public float f31893t;
    public final float f31894u;
    public boolean f31890q = true;
    public final boolean f31892s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i3 = 0; i3 <= 100; i3++) {
            float f13 = i3 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float z10 = com.google.android.recaptcha.internal.a.z(f14, f12, 2.0f, f12);
                float f15 = 1.0f - z10;
                f10 = 3.0f * z10 * f15;
                f11 = z10 * z10 * z10;
                float A2 = com.google.android.recaptcha.internal.a.A(z10, f31873x, f15 * f31872w, f10) + f11;
                if (Math.abs(A2 - f13) < 1.0E-5d) {
                    break;
                } else if (A2 > f13) {
                    f14 = z10;
                } else {
                    f12 = z10;
                }
            }
            f31874y[i3] = f10 + f11;
        }
        f31874y[100] = 1.0f;
        f31875z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public al0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f31891r = decelerateInterpolator;
        this.f31894u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float y9;
        float f11 = f10 * f31875z;
        if (f11 < 1.0f) {
            y9 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            y9 = com.google.android.recaptcha.internal.a.y(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return y9 * A;
    }

    public final void a() {
        this.f31883j = this.d;
        this.f31884k = this.f31879e;
        this.f31890q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f31890q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f31885l);
        int i3 = this.f31886m;
        if (currentAnimationTimeMillis < i3) {
            int i10 = this.f31876a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i3;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f31874y;
                    float f12 = fArr[i11];
                    float y9 = com.google.android.recaptcha.internal.a.y(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f31877b;
                    int round = Math.round((this.d - i13) * y9) + i13;
                    this.f31883j = round;
                    int min = Math.min(round, this.f31881g);
                    this.f31883j = min;
                    this.f31883j = Math.max(min, this.f31880f);
                    int i14 = this.f31878c;
                    int round2 = Math.round(y9 * (this.f31879e - i14)) + i14;
                    this.f31884k = round2;
                    int min2 = Math.min(round2, this.f31882i);
                    this.f31884k = min2;
                    int max = Math.max(min2, this.h);
                    this.f31884k = max;
                    if (this.f31883j == this.d && max == this.f31879e) {
                        this.f31890q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f31887n;
            Interpolator interpolator = this.f31891r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f31883j = Math.round(this.f31888o * interpolation) + this.f31877b;
            this.f31884k = Math.round(interpolation * this.f31889p) + this.f31878c;
            return true;
        }
        this.f31883j = this.d;
        this.f31884k = this.f31879e;
        this.f31890q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.al0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i3, int i10) {
        this.f31876a = 0;
        this.f31890q = false;
        this.f31886m = i10;
        this.f31885l = AnimationUtils.currentAnimationTimeMillis();
        this.f31877b = 0;
        this.f31878c = 0;
        this.d = 0;
        this.f31879e = i3;
        this.f31888o = 0;
        this.f31889p = i3;
        this.f31887n = 1.0f / this.f31886m;
    }
}
