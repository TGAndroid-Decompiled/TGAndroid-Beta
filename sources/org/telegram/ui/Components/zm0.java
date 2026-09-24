package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class zm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f30922w = 0.4f;
    public static final float f30923x = 1.0f - 0.4f;
    public static final float[] f30924y = new float[101];
    public static final float f30925z;
    public int f30926a;
    public int f30927b;
    public int f30928c;
    public int d;
    public int e;
    public int f30929f;
    public int f30930g;
    public int h;
    public int f30931i;
    public int f30932j;
    public int f30933k;
    public long f30934l;
    public int f30935m;
    public float f30936n;
    public float f30937o;
    public float f30938p;
    public final Interpolator f30940r;
    public float f30942t;
    public final float f30943u;
    public boolean f30939q = true;
    public final boolean f30941s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f30923x, f14 * f30922w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f30924y[i10] = f7 + f10;
        }
        f30924y[100] = 1.0f;
        f30925z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public zm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f30940r = decelerateInterpolator;
        this.f30943u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f30925z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f30932j = this.d;
        this.f30933k = this.e;
        this.f30939q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f30939q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f30934l);
        int i10 = this.f30935m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f30926a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f30924y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f30927b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f30932j = round;
                    int min = Math.min(round, this.f30930g);
                    this.f30932j = min;
                    this.f30932j = Math.max(min, this.f30929f);
                    int i15 = this.f30928c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f30933k = round2;
                    int min2 = Math.min(round2, this.f30931i);
                    this.f30933k = min2;
                    int max = Math.max(min2, this.h);
                    this.f30933k = max;
                    if (this.f30932j == this.d && max == this.e) {
                        this.f30939q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f30936n;
            Interpolator interpolator = this.f30940r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f30932j = Math.round(this.f30937o * interpolation) + this.f30927b;
            this.f30933k = Math.round(interpolation * this.f30938p) + this.f30928c;
            return true;
        }
        this.f30932j = this.d;
        this.f30933k = this.e;
        this.f30939q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f30926a = 0;
        this.f30939q = false;
        this.f30935m = i11;
        this.f30934l = AnimationUtils.currentAnimationTimeMillis();
        this.f30927b = 0;
        this.f30928c = 0;
        this.d = 0;
        this.e = i10;
        this.f30937o = 0;
        this.f30938p = i10;
        this.f30936n = 1.0f / this.f30935m;
    }
}
