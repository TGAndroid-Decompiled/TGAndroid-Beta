package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class mn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f28558w = 0.4f;
    public static final float f28559x = 1.0f - 0.4f;
    public static final float[] f28560y = new float[101];
    public static final float f28561z;
    public int f28562a;
    public int f28563b;
    public int f28564c;
    public int d;
    public int e;
    public int f28565f;
    public int f28566g;
    public int h;
    public int f28567i;
    public int f28568j;
    public int f28569k;
    public long f28570l;
    public int f28571m;
    public float f28572n;
    public float f28573o;
    public float f28574p;
    public final Interpolator f28576r;
    public float f28578t;
    public final float f28579u;
    public boolean f28575q = true;
    public final boolean f28577s = true;

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
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f28559x, f14 * f28558w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f28560y[i10] = f7 + f10;
        }
        f28560y[100] = 1.0f;
        f28561z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public mn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f28576r = decelerateInterpolator;
        this.f28579u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f28561z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f28568j = this.d;
        this.f28569k = this.e;
        this.f28575q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f28575q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f28570l);
        int i10 = this.f28571m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f28562a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f28560y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f28563b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f28568j = round;
                    int min = Math.min(round, this.f28566g);
                    this.f28568j = min;
                    this.f28568j = Math.max(min, this.f28565f);
                    int i15 = this.f28564c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f28569k = round2;
                    int min2 = Math.min(round2, this.f28567i);
                    this.f28569k = min2;
                    int max = Math.max(min2, this.h);
                    this.f28569k = max;
                    if (this.f28568j == this.d && max == this.e) {
                        this.f28575q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f28572n;
            Interpolator interpolator = this.f28576r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f28568j = Math.round(this.f28573o * interpolation) + this.f28563b;
            this.f28569k = Math.round(interpolation * this.f28574p) + this.f28564c;
            return true;
        }
        this.f28568j = this.d;
        this.f28569k = this.e;
        this.f28575q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f28562a = 0;
        this.f28575q = false;
        this.f28571m = i11;
        this.f28570l = AnimationUtils.currentAnimationTimeMillis();
        this.f28563b = 0;
        this.f28564c = 0;
        this.d = 0;
        this.e = i10;
        this.f28573o = 0;
        this.f28574p = i10;
        this.f28572n = 1.0f / this.f28571m;
    }
}
