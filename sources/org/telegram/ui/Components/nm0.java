package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class nm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f26519w = 0.4f;
    public static final float f26520x = 1.0f - 0.4f;
    public static final float[] f26521y = new float[101];
    public static final float f26522z;
    public int f26523a;
    public int f26524b;
    public int f26525c;
    public int d;
    public int e;
    public int f26526f;
    public int f26527g;
    public int h;
    public int f26528i;
    public int f26529j;
    public int f26530k;
    public long f26531l;
    public int f26532m;
    public float f26533n;
    public float f26534o;
    public float f26535p;
    public final Interpolator f26537r;
    public float f26539t;
    public final float f26540u;
    public boolean f26536q = true;
    public final boolean f26538s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f26520x, f14 * f26519w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f26521y[i10] = f7 + f10;
        }
        f26521y[100] = 1.0f;
        f26522z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public nm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f26537r = decelerateInterpolator;
        this.f26540u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f26522z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f26529j = this.d;
        this.f26530k = this.e;
        this.f26536q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f26536q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f26531l);
        int i10 = this.f26532m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f26523a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f26521y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f26524b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f26529j = round;
                    int min = Math.min(round, this.f26527g);
                    this.f26529j = min;
                    this.f26529j = Math.max(min, this.f26526f);
                    int i15 = this.f26525c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f26530k = round2;
                    int min2 = Math.min(round2, this.f26528i);
                    this.f26530k = min2;
                    int max = Math.max(min2, this.h);
                    this.f26530k = max;
                    if (this.f26529j == this.d && max == this.e) {
                        this.f26536q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f26533n;
            Interpolator interpolator = this.f26537r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f26529j = Math.round(this.f26534o * interpolation) + this.f26524b;
            this.f26530k = Math.round(interpolation * this.f26535p) + this.f26525c;
            return true;
        }
        this.f26529j = this.d;
        this.f26530k = this.e;
        this.f26536q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f26523a = 0;
        this.f26536q = false;
        this.f26532m = i11;
        this.f26531l = AnimationUtils.currentAnimationTimeMillis();
        this.f26524b = 0;
        this.f26525c = 0;
        this.d = 0;
        this.e = i10;
        this.f26534o = 0;
        this.f26535p = i10;
        this.f26533n = 1.0f / this.f26532m;
    }
}
