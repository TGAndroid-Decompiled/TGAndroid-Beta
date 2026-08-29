package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class lm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f30377w = 0.4f;
    public static final float f30378x = 1.0f - 0.4f;
    public static final float[] f30379y = new float[101];
    public static final float f30380z;
    public int f30381a;
    public int f30382b;
    public int f30383c;
    public int d;
    public int f30384e;
    public int f30385f;
    public int f30386g;
    public int h;
    public int f30387i;
    public int f30388j;
    public int f30389k;
    public long f30390l;
    public int f30391m;
    public float f30392n;
    public float f30393o;
    public float f30394p;
    public final Interpolator f30396r;
    public float f30398t;
    public final float f30399u;
    public boolean f30395q = true;
    public final boolean f30397s = true;

    static {
        float f9;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float A2 = com.google.android.recaptcha.internal.a.A(f13, f11, 2.0f, f11);
                float f14 = 1.0f - A2;
                f9 = 3.0f * A2 * f14;
                f10 = A2 * A2 * A2;
                float B = com.google.android.recaptcha.internal.a.B(A2, f30378x, f14 * f30377w, f9) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f30379y[i10] = f9 + f10;
        }
        f30379y[100] = 1.0f;
        f30380z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public lm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f30396r = decelerateInterpolator;
        this.f30399u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f9) {
        float z10;
        float f10 = f9 * f30380z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f30388j = this.d;
        this.f30389k = this.f30384e;
        this.f30395q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f30395q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f30390l);
        int i10 = this.f30391m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f30381a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f9 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f9 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f30379y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.recaptcha.internal.a.z(fArr[i13], f11, (f9 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f30382b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f30388j = round;
                    int min = Math.min(round, this.f30386g);
                    this.f30388j = min;
                    this.f30388j = Math.max(min, this.f30385f);
                    int i15 = this.f30383c;
                    int round2 = Math.round(z10 * (this.f30384e - i15)) + i15;
                    this.f30389k = round2;
                    int min2 = Math.min(round2, this.f30387i);
                    this.f30389k = min2;
                    int max = Math.max(min2, this.h);
                    this.f30389k = max;
                    if (this.f30388j == this.d && max == this.f30384e) {
                        this.f30395q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f30392n;
            Interpolator interpolator = this.f30396r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f30388j = Math.round(this.f30393o * interpolation) + this.f30382b;
            this.f30389k = Math.round(interpolation * this.f30394p) + this.f30383c;
            return true;
        }
        this.f30388j = this.d;
        this.f30389k = this.f30384e;
        this.f30395q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f30381a = 0;
        this.f30395q = false;
        this.f30391m = i11;
        this.f30390l = AnimationUtils.currentAnimationTimeMillis();
        this.f30382b = 0;
        this.f30383c = 0;
        this.d = 0;
        this.f30384e = i10;
        this.f30393o = 0;
        this.f30394p = i10;
        this.f30392n = 1.0f / this.f30391m;
    }
}
