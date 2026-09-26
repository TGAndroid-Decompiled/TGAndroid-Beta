package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class zm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f30926w = 0.4f;
    public static final float f30927x = 1.0f - 0.4f;
    public static final float[] f30928y = new float[101];
    public static final float f30929z;
    public int f30930a;
    public int f30931b;
    public int f30932c;
    public int d;
    public int e;
    public int f30933f;
    public int f30934g;
    public int h;
    public int f30935i;
    public int f30936j;
    public int f30937k;
    public long f30938l;
    public int f30939m;
    public float f30940n;
    public float f30941o;
    public float f30942p;
    public final Interpolator f30944r;
    public float f30946t;
    public final float f30947u;
    public boolean f30943q = true;
    public final boolean f30945s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f30927x, f14 * f30926w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f30928y[i10] = f7 + f10;
        }
        f30928y[100] = 1.0f;
        f30929z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public zm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f30944r = decelerateInterpolator;
        this.f30947u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f30929z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f30936j = this.d;
        this.f30937k = this.e;
        this.f30943q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f30943q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f30938l);
        int i10 = this.f30939m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f30930a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f30928y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f30931b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f30936j = round;
                    int min = Math.min(round, this.f30934g);
                    this.f30936j = min;
                    this.f30936j = Math.max(min, this.f30933f);
                    int i15 = this.f30932c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f30937k = round2;
                    int min2 = Math.min(round2, this.f30935i);
                    this.f30937k = min2;
                    int max = Math.max(min2, this.h);
                    this.f30937k = max;
                    if (this.f30936j == this.d && max == this.e) {
                        this.f30943q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f30940n;
            Interpolator interpolator = this.f30944r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f30936j = Math.round(this.f30941o * interpolation) + this.f30931b;
            this.f30937k = Math.round(interpolation * this.f30942p) + this.f30932c;
            return true;
        }
        this.f30936j = this.d;
        this.f30937k = this.e;
        this.f30943q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f30930a = 0;
        this.f30943q = false;
        this.f30939m = i11;
        this.f30938l = AnimationUtils.currentAnimationTimeMillis();
        this.f30931b = 0;
        this.f30932c = 0;
        this.d = 0;
        this.e = i10;
        this.f30941o = 0;
        this.f30942p = i10;
        this.f30940n = 1.0f / this.f30939m;
    }
}
