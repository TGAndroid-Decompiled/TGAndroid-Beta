package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class un0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f31563w = 0.4f;
    public static final float f31564x = 1.0f - 0.4f;
    public static final float[] f31565y = new float[101];
    public static final float f31566z;
    public int f31567a;
    public int f31568b;
    public int f31569c;
    public int d;
    public int f31570e;
    public int f31571f;
    public int f31572g;
    public int h;
    public int f31573i;
    public int f31574j;
    public int f31575k;
    public long f31576l;
    public int f31577m;
    public float f31578n;
    public float f31579o;
    public float f31580p;
    public final Interpolator f31582r;
    public float f31584t;
    public final float f31585u;
    public boolean f31581q = true;
    public final boolean f31583s = true;

    static {
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float z10 = com.google.android.gms.internal.vision.e2.z(f13, f11, 2.0f, f11);
                float f14 = 1.0f - z10;
                f7 = 3.0f * z10 * f14;
                f10 = z10 * z10 * z10;
                float A2 = com.google.android.gms.internal.vision.e2.A(z10, f31564x, f14 * f31563w, f7) + f10;
                if (Math.abs(A2 - f12) < 1.0E-5d) {
                    break;
                } else if (A2 > f12) {
                    f13 = z10;
                } else {
                    f11 = z10;
                }
            }
            f31565y[i10] = f7 + f10;
        }
        f31565y[100] = 1.0f;
        f31566z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public un0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f31582r = decelerateInterpolator;
        this.f31585u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float y3;
        float f10 = f7 * f31566z;
        if (f10 < 1.0f) {
            y3 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return y3 * A;
    }

    public final void a() {
        this.f31574j = this.d;
        this.f31575k = this.f31570e;
        this.f31581q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f31581q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f31576l);
        int i10 = this.f31577m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f31567a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f31565y;
                    float f11 = fArr[i12];
                    float y3 = com.google.android.gms.internal.vision.e2.y(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f31568b;
                    int round = Math.round((this.d - i14) * y3) + i14;
                    this.f31574j = round;
                    int min = Math.min(round, this.f31572g);
                    this.f31574j = min;
                    this.f31574j = Math.max(min, this.f31571f);
                    int i15 = this.f31569c;
                    int round2 = Math.round(y3 * (this.f31570e - i15)) + i15;
                    this.f31575k = round2;
                    int min2 = Math.min(round2, this.f31573i);
                    this.f31575k = min2;
                    int max = Math.max(min2, this.h);
                    this.f31575k = max;
                    if (this.f31574j == this.d && max == this.f31570e) {
                        this.f31581q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f31578n;
            Interpolator interpolator = this.f31582r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f31574j = Math.round(this.f31579o * interpolation) + this.f31568b;
            this.f31575k = Math.round(interpolation * this.f31580p) + this.f31569c;
            return true;
        }
        this.f31574j = this.d;
        this.f31575k = this.f31570e;
        this.f31581q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.un0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f31567a = 0;
        this.f31581q = false;
        this.f31577m = i11;
        this.f31576l = AnimationUtils.currentAnimationTimeMillis();
        this.f31568b = 0;
        this.f31569c = 0;
        this.d = 0;
        this.f31570e = i10;
        this.f31579o = 0;
        this.f31580p = i10;
        this.f31578n = 1.0f / this.f31577m;
    }
}
