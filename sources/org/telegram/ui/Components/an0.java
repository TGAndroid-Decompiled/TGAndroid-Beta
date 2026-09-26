package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class an0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f22697w = 0.4f;
    public static final float f22698x = 1.0f - 0.4f;
    public static final float[] f22699y = new float[101];
    public static final float f22700z;
    public int f22701a;
    public int f22702b;
    public int f22703c;
    public int d;
    public int e;
    public int f22704f;
    public int f22705g;
    public int h;
    public int f22706i;
    public int f22707j;
    public int f22708k;
    public long f22709l;
    public int f22710m;
    public float f22711n;
    public float f22712o;
    public float f22713p;
    public final Interpolator f22715r;
    public float f22717t;
    public final float f22718u;
    public boolean f22714q = true;
    public final boolean f22716s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f22698x, f14 * f22697w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f22699y[i10] = f7 + f10;
        }
        f22699y[100] = 1.0f;
        f22700z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public an0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f22715r = decelerateInterpolator;
        this.f22718u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f22700z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f22707j = this.d;
        this.f22708k = this.e;
        this.f22714q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f22714q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f22709l);
        int i10 = this.f22710m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f22701a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f22699y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f22702b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f22707j = round;
                    int min = Math.min(round, this.f22705g);
                    this.f22707j = min;
                    this.f22707j = Math.max(min, this.f22704f);
                    int i15 = this.f22703c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f22708k = round2;
                    int min2 = Math.min(round2, this.f22706i);
                    this.f22708k = min2;
                    int max = Math.max(min2, this.h);
                    this.f22708k = max;
                    if (this.f22707j == this.d && max == this.e) {
                        this.f22714q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f22711n;
            Interpolator interpolator = this.f22715r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f22707j = Math.round(this.f22712o * interpolation) + this.f22702b;
            this.f22708k = Math.round(interpolation * this.f22713p) + this.f22703c;
            return true;
        }
        this.f22707j = this.d;
        this.f22708k = this.e;
        this.f22714q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f22701a = 0;
        this.f22714q = false;
        this.f22710m = i11;
        this.f22709l = AnimationUtils.currentAnimationTimeMillis();
        this.f22702b = 0;
        this.f22703c = 0;
        this.d = 0;
        this.e = i10;
        this.f22712o = 0;
        this.f22713p = i10;
        this.f22711n = 1.0f / this.f22710m;
    }
}
