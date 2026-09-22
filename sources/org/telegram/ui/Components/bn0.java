package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class bn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f23042w = 0.4f;
    public static final float f23043x = 1.0f - 0.4f;
    public static final float[] f23044y = new float[101];
    public static final float f23045z;
    public int f23046a;
    public int f23047b;
    public int f23048c;
    public int d;
    public int e;
    public int f23049f;
    public int f23050g;
    public int h;
    public int f23051i;
    public int f23052j;
    public int f23053k;
    public long f23054l;
    public int f23055m;
    public float f23056n;
    public float f23057o;
    public float f23058p;
    public final Interpolator f23060r;
    public float f23062t;
    public final float f23063u;
    public boolean f23059q = true;
    public final boolean f23061s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f23043x, f14 * f23042w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f23044y[i10] = f7 + f10;
        }
        f23044y[100] = 1.0f;
        f23045z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public bn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f23060r = decelerateInterpolator;
        this.f23063u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f23045z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f23052j = this.d;
        this.f23053k = this.e;
        this.f23059q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f23059q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f23054l);
        int i10 = this.f23055m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f23046a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f23044y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f23047b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f23052j = round;
                    int min = Math.min(round, this.f23050g);
                    this.f23052j = min;
                    this.f23052j = Math.max(min, this.f23049f);
                    int i15 = this.f23048c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f23053k = round2;
                    int min2 = Math.min(round2, this.f23051i);
                    this.f23053k = min2;
                    int max = Math.max(min2, this.h);
                    this.f23053k = max;
                    if (this.f23052j == this.d && max == this.e) {
                        this.f23059q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f23056n;
            Interpolator interpolator = this.f23060r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f23052j = Math.round(this.f23057o * interpolation) + this.f23047b;
            this.f23053k = Math.round(interpolation * this.f23058p) + this.f23048c;
            return true;
        }
        this.f23052j = this.d;
        this.f23053k = this.e;
        this.f23059q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f23046a = 0;
        this.f23059q = false;
        this.f23055m = i11;
        this.f23054l = AnimationUtils.currentAnimationTimeMillis();
        this.f23047b = 0;
        this.f23048c = 0;
        this.d = 0;
        this.e = i10;
        this.f23057o = 0;
        this.f23058p = i10;
        this.f23056n = 1.0f / this.f23055m;
    }
}
