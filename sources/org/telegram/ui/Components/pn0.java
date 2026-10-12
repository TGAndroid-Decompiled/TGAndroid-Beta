package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class pn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f28371w = 0.4f;
    public static final float f28372x = 1.0f - 0.4f;
    public static final float[] f28373y = new float[101];
    public static final float f28374z;
    public int f28375a;
    public int f28376b;
    public int f28377c;
    public int d;
    public int e;
    public int f28378f;
    public int f28379g;
    public int h;
    public int f28380i;
    public int f28381j;
    public int f28382k;
    public long f28383l;
    public int f28384m;
    public float f28385n;
    public float f28386o;
    public float f28387p;
    public final Interpolator f28389r;
    public float f28391t;
    public final float f28392u;
    public boolean f28388q = true;
    public final boolean f28390s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float z10 = com.google.android.gms.internal.play_billing.k3.z(f13, f11, 2.0f, f11);
                float f14 = 1.0f - z10;
                f7 = 3.0f * z10 * f14;
                f10 = z10 * z10 * z10;
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f28372x, f14 * f28371w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f28373y[i10] = f7 + f10;
        }
        f28373y[100] = 1.0f;
        f28374z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public pn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f28389r = decelerateInterpolator;
        this.f28392u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f28374z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f28381j = this.d;
        this.f28382k = this.e;
        this.f28388q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f28388q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f28383l);
        int i10 = this.f28384m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f28375a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f28373y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f28376b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f28381j = round;
                    int min = Math.min(round, this.f28379g);
                    this.f28381j = min;
                    this.f28381j = Math.max(min, this.f28378f);
                    int i15 = this.f28377c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f28382k = round2;
                    int min2 = Math.min(round2, this.f28380i);
                    this.f28382k = min2;
                    int max = Math.max(min2, this.h);
                    this.f28382k = max;
                    if (this.f28381j == this.d && max == this.e) {
                        this.f28388q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f28385n;
            Interpolator interpolator = this.f28389r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f28381j = Math.round(this.f28386o * interpolation) + this.f28376b;
            this.f28382k = Math.round(interpolation * this.f28387p) + this.f28377c;
            return true;
        }
        this.f28381j = this.d;
        this.f28382k = this.e;
        this.f28388q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f28375a = 0;
        this.f28388q = false;
        this.f28384m = i11;
        this.f28383l = AnimationUtils.currentAnimationTimeMillis();
        this.f28376b = 0;
        this.f28377c = 0;
        this.d = 0;
        this.e = i10;
        this.f28386o = 0;
        this.f28387p = i10;
        this.f28385n = 1.0f / this.f28384m;
    }
}
