package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class zm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f30927w = 0.4f;
    public static final float f30928x = 1.0f - 0.4f;
    public static final float[] f30929y = new float[101];
    public static final float f30930z;
    public int f30931a;
    public int f30932b;
    public int f30933c;
    public int d;
    public int e;
    public int f30934f;
    public int f30935g;
    public int h;
    public int f30936i;
    public int f30937j;
    public int f30938k;
    public long f30939l;
    public int f30940m;
    public float f30941n;
    public float f30942o;
    public float f30943p;
    public final Interpolator f30945r;
    public float f30947t;
    public final float f30948u;
    public boolean f30944q = true;
    public final boolean f30946s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f30928x, f14 * f30927w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f30929y[i10] = f7 + f10;
        }
        f30929y[100] = 1.0f;
        f30930z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public zm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f30945r = decelerateInterpolator;
        this.f30948u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f30930z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f30937j = this.d;
        this.f30938k = this.e;
        this.f30944q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f30944q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f30939l);
        int i10 = this.f30940m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f30931a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f30929y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f30932b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f30937j = round;
                    int min = Math.min(round, this.f30935g);
                    this.f30937j = min;
                    this.f30937j = Math.max(min, this.f30934f);
                    int i15 = this.f30933c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f30938k = round2;
                    int min2 = Math.min(round2, this.f30936i);
                    this.f30938k = min2;
                    int max = Math.max(min2, this.h);
                    this.f30938k = max;
                    if (this.f30937j == this.d && max == this.e) {
                        this.f30944q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f30941n;
            Interpolator interpolator = this.f30945r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f30937j = Math.round(this.f30942o * interpolation) + this.f30932b;
            this.f30938k = Math.round(interpolation * this.f30943p) + this.f30933c;
            return true;
        }
        this.f30937j = this.d;
        this.f30938k = this.e;
        this.f30944q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f30931a = 0;
        this.f30944q = false;
        this.f30940m = i11;
        this.f30939l = AnimationUtils.currentAnimationTimeMillis();
        this.f30932b = 0;
        this.f30933c = 0;
        this.d = 0;
        this.e = i10;
        this.f30942o = 0;
        this.f30943p = i10;
        this.f30941n = 1.0f / this.f30940m;
    }
}
