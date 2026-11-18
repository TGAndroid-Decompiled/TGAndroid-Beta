package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class jl0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f36463w = 0.4f;
    public static final float f36464x = 1.0f - 0.4f;
    public static final float[] f36465y = new float[101];
    public static final float f36466z;
    public int f36467a;
    public int f36468b;
    public int f36469c;
    public int d;
    public int f36470e;
    public int f36471f;
    public int f36472g;
    public int h;
    public int f36473i;
    public int f36474j;
    public int f36475k;
    public long f36476l;
    public int f36477m;
    public float f36478n;
    public float f36479o;
    public float f36480p;
    public final Interpolator f36482r;
    public float f36484t;
    public final float f36485u;
    public boolean f36481q = true;
    public final boolean f36483s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f36464x, f15 * f36463w, f10) + f11;
                if (Math.abs(B - f13) < 1.0E-5d) {
                    break;
                } else if (B > f13) {
                    f14 = A2;
                } else {
                    f12 = A2;
                }
            }
            f36465y[i7] = f10 + f11;
        }
        f36465y[100] = 1.0f;
        f36466z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public jl0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f36482r = decelerateInterpolator;
        this.f36485u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float z10;
        float f11 = f10 * f36466z;
        if (f11 < 1.0f) {
            z10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f36474j = this.d;
        this.f36475k = this.f36470e;
        this.f36481q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f36481q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f36476l);
        int i7 = this.f36477m;
        if (currentAnimationTimeMillis < i7) {
            int i10 = this.f36467a;
            if (i10 != 0) {
                if (i10 == 1) {
                    float f10 = currentAnimationTimeMillis / i7;
                    int i11 = (int) (f10 * 100.0f);
                    float f11 = i11 / 100.0f;
                    int i12 = i11 + 1;
                    float[] fArr = f36465y;
                    float f12 = fArr[i11];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i12], f12, (f10 - f11) / ((i12 / 100.0f) - f11), f12);
                    int i13 = this.f36468b;
                    int round = Math.round((this.d - i13) * z10) + i13;
                    this.f36474j = round;
                    int min = Math.min(round, this.f36472g);
                    this.f36474j = min;
                    this.f36474j = Math.max(min, this.f36471f);
                    int i14 = this.f36469c;
                    int round2 = Math.round(z10 * (this.f36470e - i14)) + i14;
                    this.f36475k = round2;
                    int min2 = Math.min(round2, this.f36473i);
                    this.f36475k = min2;
                    int max = Math.max(min2, this.h);
                    this.f36475k = max;
                    if (this.f36474j == this.d && max == this.f36470e) {
                        this.f36481q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f36478n;
            Interpolator interpolator = this.f36482r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f36474j = Math.round(this.f36479o * interpolation) + this.f36468b;
            this.f36475k = Math.round(interpolation * this.f36480p) + this.f36469c;
            return true;
        }
        this.f36474j = this.d;
        this.f36475k = this.f36470e;
        this.f36481q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jl0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i7, int i10) {
        this.f36467a = 0;
        this.f36481q = false;
        this.f36477m = i10;
        this.f36476l = AnimationUtils.currentAnimationTimeMillis();
        this.f36468b = 0;
        this.f36469c = 0;
        this.d = 0;
        this.f36470e = i7;
        this.f36479o = 0;
        this.f36480p = i7;
        this.f36478n = 1.0f / this.f36477m;
    }
}
