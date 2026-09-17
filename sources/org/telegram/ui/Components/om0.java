package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class om0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f26801w = 0.4f;
    public static final float f26802x = 1.0f - 0.4f;
    public static final float[] f26803y = new float[101];
    public static final float f26804z;
    public int f26805a;
    public int f26806b;
    public int f26807c;
    public int d;
    public int e;
    public int f26808f;
    public int f26809g;
    public int h;
    public int f26810i;
    public int f26811j;
    public int f26812k;
    public long f26813l;
    public int f26814m;
    public float f26815n;
    public float f26816o;
    public float f26817p;
    public final Interpolator f26819r;
    public float f26821t;
    public final float f26822u;
    public boolean f26818q = true;
    public final boolean f26820s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f26802x, f14 * f26801w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f26803y[i10] = f7 + f10;
        }
        f26803y[100] = 1.0f;
        f26804z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public om0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f26819r = decelerateInterpolator;
        this.f26822u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f26804z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f26811j = this.d;
        this.f26812k = this.e;
        this.f26818q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f26818q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f26813l);
        int i10 = this.f26814m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f26805a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f26803y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f26806b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f26811j = round;
                    int min = Math.min(round, this.f26809g);
                    this.f26811j = min;
                    this.f26811j = Math.max(min, this.f26808f);
                    int i15 = this.f26807c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f26812k = round2;
                    int min2 = Math.min(round2, this.f26810i);
                    this.f26812k = min2;
                    int max = Math.max(min2, this.h);
                    this.f26812k = max;
                    if (this.f26811j == this.d && max == this.e) {
                        this.f26818q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f26815n;
            Interpolator interpolator = this.f26819r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f26811j = Math.round(this.f26816o * interpolation) + this.f26806b;
            this.f26812k = Math.round(interpolation * this.f26817p) + this.f26807c;
            return true;
        }
        this.f26811j = this.d;
        this.f26812k = this.e;
        this.f26818q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f26805a = 0;
        this.f26818q = false;
        this.f26814m = i11;
        this.f26813l = AnimationUtils.currentAnimationTimeMillis();
        this.f26806b = 0;
        this.f26807c = 0;
        this.d = 0;
        this.e = i10;
        this.f26816o = 0;
        this.f26817p = i10;
        this.f26815n = 1.0f / this.f26814m;
    }
}
