package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class pn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f29602w = 0.4f;
    public static final float f29603x = 1.0f - 0.4f;
    public static final float[] f29604y = new float[101];
    public static final float f29605z;
    public int f29606a;
    public int f29607b;
    public int f29608c;
    public int d;
    public int e;
    public int f29609f;
    public int f29610g;
    public int h;
    public int f29611i;
    public int f29612j;
    public int f29613k;
    public long f29614l;
    public int f29615m;
    public float f29616n;
    public float f29617o;
    public float f29618p;
    public final Interpolator f29620r;
    public float f29622t;
    public final float f29623u;
    public boolean f29619q = true;
    public final boolean f29621s = true;

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
                float A2 = com.google.android.gms.internal.play_billing.k3.A(z10, f29603x, f14 * f29602w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f29604y[i10] = f7 + f10;
        }
        f29604y[100] = 1.0f;
        f29605z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public pn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f29620r = decelerateInterpolator;
        this.f29623u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f29605z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f29612j = this.d;
        this.f29613k = this.e;
        this.f29619q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f29619q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f29614l);
        int i10 = this.f29615m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f29606a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f29604y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f29607b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f29612j = round;
                    int min = Math.min(round, this.f29610g);
                    this.f29612j = min;
                    this.f29612j = Math.max(min, this.f29609f);
                    int i15 = this.f29608c;
                    int round2 = Math.round(y3 * (this.e - i15)) + i15;
                    this.f29613k = round2;
                    int min2 = Math.min(round2, this.f29611i);
                    this.f29613k = min2;
                    int max = Math.max(min2, this.h);
                    this.f29613k = max;
                    if (this.f29612j == this.d && max == this.e) {
                        this.f29619q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f29616n;
            Interpolator interpolator = this.f29620r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f29612j = Math.round(this.f29617o * interpolation) + this.f29607b;
            this.f29613k = Math.round(interpolation * this.f29618p) + this.f29608c;
            return true;
        }
        this.f29612j = this.d;
        this.f29613k = this.e;
        this.f29619q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f29606a = 0;
        this.f29619q = false;
        this.f29615m = i11;
        this.f29614l = AnimationUtils.currentAnimationTimeMillis();
        this.f29607b = 0;
        this.f29608c = 0;
        this.d = 0;
        this.e = i10;
        this.f29617o = 0;
        this.f29618p = i10;
        this.f29616n = 1.0f / this.f29615m;
    }
}
