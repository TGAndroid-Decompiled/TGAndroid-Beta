package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class ln0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f28275w = 0.4f;
    public static final float f28276x = 1.0f - 0.4f;
    public static final float[] f28277y = new float[101];
    public static final float f28278z;
    public int f28279a;
    public int f28280b;
    public int f28281c;
    public int d;
    public int e;
    public int f28282f;
    public int f28283g;
    public int h;
    public int f28284i;
    public int f28285j;
    public int f28286k;
    public long f28287l;
    public int f28288m;
    public float f28289n;
    public float f28290o;
    public float f28291p;
    public final Interpolator f28293r;
    public float f28295t;
    public final float f28296u;
    public boolean f28292q = true;
    public final boolean f28294s = true;

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
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f28276x, f14 * f28275w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f28277y[i10] = f7 + f10;
        }
        f28277y[100] = 1.0f;
        f28278z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public ln0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f28293r = decelerateInterpolator;
        this.f28296u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f28278z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f28285j = this.d;
        this.f28286k = this.e;
        this.f28292q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f28292q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f28287l);
        int i10 = this.f28288m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f28279a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f28277y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f28280b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f28285j = round;
                    int min = Math.min(round, this.f28283g);
                    this.f28285j = min;
                    this.f28285j = Math.max(min, this.f28282f);
                    int i15 = this.f28281c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f28286k = round2;
                    int min2 = Math.min(round2, this.f28284i);
                    this.f28286k = min2;
                    int max = Math.max(min2, this.h);
                    this.f28286k = max;
                    if (this.f28285j == this.d && max == this.e) {
                        this.f28292q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f28289n;
            Interpolator interpolator = this.f28293r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f28285j = Math.round(this.f28290o * interpolation) + this.f28280b;
            this.f28286k = Math.round(interpolation * this.f28291p) + this.f28281c;
            return true;
        }
        this.f28285j = this.d;
        this.f28286k = this.e;
        this.f28292q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ln0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f28279a = 0;
        this.f28292q = false;
        this.f28288m = i11;
        this.f28287l = AnimationUtils.currentAnimationTimeMillis();
        this.f28280b = 0;
        this.f28281c = 0;
        this.d = 0;
        this.e = i10;
        this.f28290o = 0;
        this.f28291p = i10;
        this.f28289n = 1.0f / this.f28288m;
    }
}
