package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class on0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f29329w = 0.4f;
    public static final float f29330x = 1.0f - 0.4f;
    public static final float[] f29331y = new float[101];
    public static final float f29332z;
    public int f29333a;
    public int f29334b;
    public int f29335c;
    public int d;
    public int e;
    public int f29336f;
    public int f29337g;
    public int h;
    public int f29338i;
    public int f29339j;
    public int f29340k;
    public long f29341l;
    public int f29342m;
    public float f29343n;
    public float f29344o;
    public float f29345p;
    public final Interpolator f29347r;
    public float f29349t;
    public final float f29350u;
    public boolean f29346q = true;
    public final boolean f29348s = true;

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
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f29330x, f14 * f29329w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f29331y[i10] = f7 + f10;
        }
        f29331y[100] = 1.0f;
        f29332z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public on0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f29347r = decelerateInterpolator;
        this.f29350u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f29332z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f29339j = this.d;
        this.f29340k = this.e;
        this.f29346q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f29346q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f29341l);
        int i10 = this.f29342m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f29333a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f29331y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f29334b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f29339j = round;
                    int min = Math.min(round, this.f29337g);
                    this.f29339j = min;
                    this.f29339j = Math.max(min, this.f29336f);
                    int i15 = this.f29335c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f29340k = round2;
                    int min2 = Math.min(round2, this.f29338i);
                    this.f29340k = min2;
                    int max = Math.max(min2, this.h);
                    this.f29340k = max;
                    if (this.f29339j == this.d && max == this.e) {
                        this.f29346q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f29343n;
            Interpolator interpolator = this.f29347r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f29339j = Math.round(this.f29344o * interpolation) + this.f29334b;
            this.f29340k = Math.round(interpolation * this.f29345p) + this.f29335c;
            return true;
        }
        this.f29339j = this.d;
        this.f29340k = this.e;
        this.f29346q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.on0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f29333a = 0;
        this.f29346q = false;
        this.f29342m = i11;
        this.f29341l = AnimationUtils.currentAnimationTimeMillis();
        this.f29334b = 0;
        this.f29335c = 0;
        this.d = 0;
        this.e = i10;
        this.f29344o = 0;
        this.f29345p = i10;
        this.f29343n = 1.0f / this.f29342m;
    }
}
