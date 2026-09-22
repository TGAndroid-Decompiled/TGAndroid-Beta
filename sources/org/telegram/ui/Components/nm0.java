package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class nm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f26518w = 0.4f;
    public static final float f26519x = 1.0f - 0.4f;
    public static final float[] f26520y = new float[101];
    public static final float f26521z;
    public int f26522a;
    public int f26523b;
    public int f26524c;
    public int d;
    public int e;
    public int f26525f;
    public int f26526g;
    public int h;
    public int f26527i;
    public int f26528j;
    public int f26529k;
    public long f26530l;
    public int f26531m;
    public float f26532n;
    public float f26533o;
    public float f26534p;
    public final Interpolator f26536r;
    public float f26538t;
    public final float f26539u;
    public boolean f26535q = true;
    public final boolean f26537s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f26519x, f14 * f26518w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f26520y[i10] = f7 + f10;
        }
        f26520y[100] = 1.0f;
        f26521z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public nm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f26536r = decelerateInterpolator;
        this.f26539u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f26521z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f26528j = this.d;
        this.f26529k = this.e;
        this.f26535q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f26535q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f26530l);
        int i10 = this.f26531m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f26522a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f26520y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f26523b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f26528j = round;
                    int min = Math.min(round, this.f26526g);
                    this.f26528j = min;
                    this.f26528j = Math.max(min, this.f26525f);
                    int i15 = this.f26524c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f26529k = round2;
                    int min2 = Math.min(round2, this.f26527i);
                    this.f26529k = min2;
                    int max = Math.max(min2, this.h);
                    this.f26529k = max;
                    if (this.f26528j == this.d && max == this.e) {
                        this.f26535q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f26532n;
            Interpolator interpolator = this.f26536r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f26528j = Math.round(this.f26533o * interpolation) + this.f26523b;
            this.f26529k = Math.round(interpolation * this.f26534p) + this.f26524c;
            return true;
        }
        this.f26528j = this.d;
        this.f26529k = this.e;
        this.f26535q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f26522a = 0;
        this.f26535q = false;
        this.f26531m = i11;
        this.f26530l = AnimationUtils.currentAnimationTimeMillis();
        this.f26523b = 0;
        this.f26524c = 0;
        this.d = 0;
        this.e = i10;
        this.f26533o = 0;
        this.f26534p = i10;
        this.f26532n = 1.0f / this.f26531m;
    }
}
