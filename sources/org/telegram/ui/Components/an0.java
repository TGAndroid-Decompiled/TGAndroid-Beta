package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class an0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f22661w = 0.4f;
    public static final float f22662x = 1.0f - 0.4f;
    public static final float[] f22663y = new float[101];
    public static final float f22664z;
    public int f22665a;
    public int f22666b;
    public int f22667c;
    public int d;
    public int e;
    public int f22668f;
    public int f22669g;
    public int h;
    public int f22670i;
    public int f22671j;
    public int f22672k;
    public long f22673l;
    public int f22674m;
    public float f22675n;
    public float f22676o;
    public float f22677p;
    public final Interpolator f22679r;
    public float f22681t;
    public final float f22682u;
    public boolean f22678q = true;
    public final boolean f22680s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f22662x, f14 * f22661w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f22663y[i10] = f7 + f10;
        }
        f22663y[100] = 1.0f;
        f22664z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public an0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f22679r = decelerateInterpolator;
        this.f22682u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f22664z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f22671j = this.d;
        this.f22672k = this.e;
        this.f22678q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f22678q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f22673l);
        int i10 = this.f22674m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f22665a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f22663y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f22666b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f22671j = round;
                    int min = Math.min(round, this.f22669g);
                    this.f22671j = min;
                    this.f22671j = Math.max(min, this.f22668f);
                    int i15 = this.f22667c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f22672k = round2;
                    int min2 = Math.min(round2, this.f22670i);
                    this.f22672k = min2;
                    int max = Math.max(min2, this.h);
                    this.f22672k = max;
                    if (this.f22671j == this.d && max == this.e) {
                        this.f22678q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f22675n;
            Interpolator interpolator = this.f22679r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f22671j = Math.round(this.f22676o * interpolation) + this.f22666b;
            this.f22672k = Math.round(interpolation * this.f22677p) + this.f22667c;
            return true;
        }
        this.f22671j = this.d;
        this.f22672k = this.e;
        this.f22678q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f22665a = 0;
        this.f22678q = false;
        this.f22674m = i11;
        this.f22673l = AnimationUtils.currentAnimationTimeMillis();
        this.f22666b = 0;
        this.f22667c = 0;
        this.d = 0;
        this.e = i10;
        this.f22676o = 0;
        this.f22677p = i10;
        this.f22675n = 1.0f / this.f22674m;
    }
}
