package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class fn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f26527w = 0.4f;
    public static final float f26528x = 1.0f - 0.4f;
    public static final float[] f26529y = new float[101];
    public static final float f26530z;
    public int f26531a;
    public int f26532b;
    public int f26533c;
    public int d;
    public int f26534e;
    public int f26535f;
    public int f26536g;
    public int h;
    public int f26537i;
    public int f26538j;
    public int f26539k;
    public long f26540l;
    public int f26541m;
    public float f26542n;
    public float f26543o;
    public float f26544p;
    public final Interpolator f26546r;
    public float f26548t;
    public final float f26549u;
    public boolean f26545q = true;
    public final boolean f26547s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f26528x, f14 * f26527w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f26529y[i10] = f7 + f10;
        }
        f26529y[100] = 1.0f;
        f26530z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public fn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f26546r = decelerateInterpolator;
        this.f26549u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f26530z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f26538j = this.d;
        this.f26539k = this.f26534e;
        this.f26545q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f26545q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f26540l);
        int i10 = this.f26541m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f26531a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f26529y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f26532b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f26538j = round;
                    int min = Math.min(round, this.f26536g);
                    this.f26538j = min;
                    this.f26538j = Math.max(min, this.f26535f);
                    int i15 = this.f26533c;
                    int round2 = Math.round(z10 * (this.f26534e - i15)) + i15;
                    this.f26539k = round2;
                    int min2 = Math.min(round2, this.f26537i);
                    this.f26539k = min2;
                    int max = Math.max(min2, this.h);
                    this.f26539k = max;
                    if (this.f26538j == this.d && max == this.f26534e) {
                        this.f26545q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f26542n;
            Interpolator interpolator = this.f26546r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f26538j = Math.round(this.f26543o * interpolation) + this.f26532b;
            this.f26539k = Math.round(interpolation * this.f26544p) + this.f26533c;
            return true;
        }
        this.f26538j = this.d;
        this.f26539k = this.f26534e;
        this.f26545q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f26531a = 0;
        this.f26545q = false;
        this.f26541m = i11;
        this.f26540l = AnimationUtils.currentAnimationTimeMillis();
        this.f26532b = 0;
        this.f26533c = 0;
        this.d = 0;
        this.f26534e = i10;
        this.f26543o = 0;
        this.f26544p = i10;
        this.f26542n = 1.0f / this.f26541m;
    }
}
