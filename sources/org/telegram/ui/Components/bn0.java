package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class bn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f23055w = 0.4f;
    public static final float f23056x = 1.0f - 0.4f;
    public static final float[] f23057y = new float[101];
    public static final float f23058z;
    public int f23059a;
    public int f23060b;
    public int f23061c;
    public int d;
    public int e;
    public int f23062f;
    public int f23063g;
    public int h;
    public int f23064i;
    public int f23065j;
    public int f23066k;
    public long f23067l;
    public int f23068m;
    public float f23069n;
    public float f23070o;
    public float f23071p;
    public final Interpolator f23073r;
    public float f23075t;
    public final float f23076u;
    public boolean f23072q = true;
    public final boolean f23074s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f23056x, f14 * f23055w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f23057y[i10] = f7 + f10;
        }
        f23057y[100] = 1.0f;
        f23058z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public bn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f23073r = decelerateInterpolator;
        this.f23076u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f23058z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f23065j = this.d;
        this.f23066k = this.e;
        this.f23072q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f23072q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f23067l);
        int i10 = this.f23068m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f23059a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f23057y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f23060b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f23065j = round;
                    int min = Math.min(round, this.f23063g);
                    this.f23065j = min;
                    this.f23065j = Math.max(min, this.f23062f);
                    int i15 = this.f23061c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f23066k = round2;
                    int min2 = Math.min(round2, this.f23064i);
                    this.f23066k = min2;
                    int max = Math.max(min2, this.h);
                    this.f23066k = max;
                    if (this.f23065j == this.d && max == this.e) {
                        this.f23072q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f23069n;
            Interpolator interpolator = this.f23073r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f23065j = Math.round(this.f23070o * interpolation) + this.f23060b;
            this.f23066k = Math.round(interpolation * this.f23071p) + this.f23061c;
            return true;
        }
        this.f23065j = this.d;
        this.f23066k = this.e;
        this.f23072q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f23059a = 0;
        this.f23072q = false;
        this.f23068m = i11;
        this.f23067l = AnimationUtils.currentAnimationTimeMillis();
        this.f23060b = 0;
        this.f23061c = 0;
        this.d = 0;
        this.e = i10;
        this.f23070o = 0;
        this.f23071p = i10;
        this.f23069n = 1.0f / this.f23068m;
    }
}
