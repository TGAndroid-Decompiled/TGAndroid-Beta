package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class zm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f30864w = 0.4f;
    public static final float f30865x = 1.0f - 0.4f;
    public static final float[] f30866y = new float[101];
    public static final float f30867z;
    public int f30868a;
    public int f30869b;
    public int f30870c;
    public int d;
    public int e;
    public int f30871f;
    public int f30872g;
    public int h;
    public int f30873i;
    public int f30874j;
    public int f30875k;
    public long f30876l;
    public int f30877m;
    public float f30878n;
    public float f30879o;
    public float f30880p;
    public final Interpolator f30882r;
    public float f30884t;
    public final float f30885u;
    public boolean f30881q = true;
    public final boolean f30883s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f30865x, f14 * f30864w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f30866y[i10] = f7 + f10;
        }
        f30866y[100] = 1.0f;
        f30867z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public zm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f30882r = decelerateInterpolator;
        this.f30885u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f30867z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f30874j = this.d;
        this.f30875k = this.e;
        this.f30881q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f30881q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f30876l);
        int i10 = this.f30877m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f30868a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f30866y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f30869b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f30874j = round;
                    int min = Math.min(round, this.f30872g);
                    this.f30874j = min;
                    this.f30874j = Math.max(min, this.f30871f);
                    int i15 = this.f30870c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f30875k = round2;
                    int min2 = Math.min(round2, this.f30873i);
                    this.f30875k = min2;
                    int max = Math.max(min2, this.h);
                    this.f30875k = max;
                    if (this.f30874j == this.d && max == this.e) {
                        this.f30881q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f30878n;
            Interpolator interpolator = this.f30882r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f30874j = Math.round(this.f30879o * interpolation) + this.f30869b;
            this.f30875k = Math.round(interpolation * this.f30880p) + this.f30870c;
            return true;
        }
        this.f30874j = this.d;
        this.f30875k = this.e;
        this.f30881q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f30868a = 0;
        this.f30881q = false;
        this.f30877m = i11;
        this.f30876l = AnimationUtils.currentAnimationTimeMillis();
        this.f30869b = 0;
        this.f30870c = 0;
        this.d = 0;
        this.e = i10;
        this.f30879o = 0;
        this.f30880p = i10;
        this.f30878n = 1.0f / this.f30877m;
    }
}
