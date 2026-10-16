package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class pn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f28060w = 0.4f;
    public static final float f28061x = 1.0f - 0.4f;
    public static final float[] f28062y = new float[101];
    public static final float f28063z;
    public int f28064a;
    public int f28065b;
    public int f28066c;
    public int d;
    public int e;
    public int f28067f;
    public int f28068g;
    public int h;
    public int f28069i;
    public int f28070j;
    public int f28071k;
    public long f28072l;
    public int f28073m;
    public float f28074n;
    public float f28075o;
    public float f28076p;
    public final Interpolator f28078r;
    public float f28080t;
    public final float f28081u;
    public boolean f28077q = true;
    public final boolean f28079s = true;

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
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f28061x, f14 * f28060w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f28062y[i10] = f7 + f10;
        }
        f28062y[100] = 1.0f;
        f28063z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public pn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f28078r = decelerateInterpolator;
        this.f28081u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f28063z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f28070j = this.d;
        this.f28071k = this.e;
        this.f28077q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f28077q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f28072l);
        int i10 = this.f28073m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f28064a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f28062y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f28065b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f28070j = round;
                    int min = Math.min(round, this.f28068g);
                    this.f28070j = min;
                    this.f28070j = Math.max(min, this.f28067f);
                    int i15 = this.f28066c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f28071k = round2;
                    int min2 = Math.min(round2, this.f28069i);
                    this.f28071k = min2;
                    int max = Math.max(min2, this.h);
                    this.f28071k = max;
                    if (this.f28070j == this.d && max == this.e) {
                        this.f28077q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f28074n;
            Interpolator interpolator = this.f28078r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f28070j = Math.round(this.f28075o * interpolation) + this.f28065b;
            this.f28071k = Math.round(interpolation * this.f28076p) + this.f28066c;
            return true;
        }
        this.f28070j = this.d;
        this.f28071k = this.e;
        this.f28077q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f28064a = 0;
        this.f28077q = false;
        this.f28073m = i11;
        this.f28072l = AnimationUtils.currentAnimationTimeMillis();
        this.f28065b = 0;
        this.f28066c = 0;
        this.d = 0;
        this.e = i10;
        this.f28075o = 0;
        this.f28076p = i10;
        this.f28074n = 1.0f / this.f28073m;
    }
}
