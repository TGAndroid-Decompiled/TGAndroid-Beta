package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class xm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f29085w = 0.4f;
    public static final float f29086x = 1.0f - 0.4f;
    public static final float[] f29087y = new float[101];
    public static final float f29088z;
    public int f29089a;
    public int f29090b;
    public int f29091c;
    public int d;
    public int e;
    public int f29092f;
    public int f29093g;
    public int h;
    public int f29094i;
    public int f29095j;
    public int f29096k;
    public long f29097l;
    public int f29098m;
    public float f29099n;
    public float f29100o;
    public float f29101p;
    public final Interpolator f29103r;
    public float f29105t;
    public final float f29106u;
    public boolean f29102q = true;
    public final boolean f29104s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f29086x, f14 * f29085w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f29087y[i10] = f7 + f10;
        }
        f29087y[100] = 1.0f;
        f29088z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public xm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f29103r = decelerateInterpolator;
        this.f29106u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f29088z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f29095j = this.d;
        this.f29096k = this.e;
        this.f29102q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f29102q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f29097l);
        int i10 = this.f29098m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f29089a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f29087y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f29090b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f29095j = round;
                    int min = Math.min(round, this.f29093g);
                    this.f29095j = min;
                    this.f29095j = Math.max(min, this.f29092f);
                    int i15 = this.f29091c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f29096k = round2;
                    int min2 = Math.min(round2, this.f29094i);
                    this.f29096k = min2;
                    int max = Math.max(min2, this.h);
                    this.f29096k = max;
                    if (this.f29095j == this.d && max == this.e) {
                        this.f29102q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f29099n;
            Interpolator interpolator = this.f29103r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f29095j = Math.round(this.f29100o * interpolation) + this.f29090b;
            this.f29096k = Math.round(interpolation * this.f29101p) + this.f29091c;
            return true;
        }
        this.f29095j = this.d;
        this.f29096k = this.e;
        this.f29102q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f29089a = 0;
        this.f29102q = false;
        this.f29098m = i11;
        this.f29097l = AnimationUtils.currentAnimationTimeMillis();
        this.f29090b = 0;
        this.f29091c = 0;
        this.d = 0;
        this.e = i10;
        this.f29100o = 0;
        this.f29101p = i10;
        this.f29099n = 1.0f / this.f29098m;
    }
}
