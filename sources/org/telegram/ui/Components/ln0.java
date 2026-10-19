package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class ln0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f28253w = 0.4f;
    public static final float f28254x = 1.0f - 0.4f;
    public static final float[] f28255y = new float[101];
    public static final float f28256z;
    public int f28257a;
    public int f28258b;
    public int f28259c;
    public int d;
    public int e;
    public int f28260f;
    public int f28261g;
    public int h;
    public int f28262i;
    public int f28263j;
    public int f28264k;
    public long f28265l;
    public int f28266m;
    public float f28267n;
    public float f28268o;
    public float f28269p;
    public final Interpolator f28271r;
    public float f28273t;
    public final float f28274u;
    public boolean f28270q = true;
    public final boolean f28272s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float z10 = com.google.android.gms.internal.play_billing.k3.z(f13, f11, 2.0f, f11);
                float f14 = 1.0f - z10;
                f7 = 3.0f * z10 * f14;
                f10 = z10 * z10 * z10;
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f28254x, f14 * f28253w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f28255y[i10] = f7 + f10;
        }
        f28255y[100] = 1.0f;
        f28256z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public ln0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f28271r = decelerateInterpolator;
        this.f28274u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f28256z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f28263j = this.d;
        this.f28264k = this.e;
        this.f28270q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f28270q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f28265l);
        int i10 = this.f28266m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f28257a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f28255y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f28258b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f28263j = round;
                    int min = Math.min(round, this.f28261g);
                    this.f28263j = min;
                    this.f28263j = Math.max(min, this.f28260f);
                    int i15 = this.f28259c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f28264k = round2;
                    int min2 = Math.min(round2, this.f28262i);
                    this.f28264k = min2;
                    int max = Math.max(min2, this.h);
                    this.f28264k = max;
                    if (this.f28263j == this.d && max == this.e) {
                        this.f28270q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f28267n;
            Interpolator interpolator = this.f28271r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f28263j = Math.round(this.f28268o * interpolation) + this.f28258b;
            this.f28264k = Math.round(interpolation * this.f28269p) + this.f28259c;
            return true;
        }
        this.f28263j = this.d;
        this.f28264k = this.e;
        this.f28270q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ln0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f28257a = 0;
        this.f28270q = false;
        this.f28266m = i11;
        this.f28265l = AnimationUtils.currentAnimationTimeMillis();
        this.f28258b = 0;
        this.f28259c = 0;
        this.d = 0;
        this.e = i10;
        this.f28268o = 0;
        this.f28269p = i10;
        this.f28267n = 1.0f / this.f28266m;
    }
}
