package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class bn0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f23024w = 0.4f;
    public static final float f23025x = 1.0f - 0.4f;
    public static final float[] f23026y = new float[101];
    public static final float f23027z;
    public int f23028a;
    public int f23029b;
    public int f23030c;
    public int d;
    public int e;
    public int f23031f;
    public int f23032g;
    public int h;
    public int f23033i;
    public int f23034j;
    public int f23035k;
    public long f23036l;
    public int f23037m;
    public float f23038n;
    public float f23039o;
    public float f23040p;
    public final Interpolator f23042r;
    public float f23044t;
    public final float f23045u;
    public boolean f23041q = true;
    public final boolean f23043s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f23025x, f14 * f23024w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f23026y[i10] = f7 + f10;
        }
        f23026y[100] = 1.0f;
        f23027z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public bn0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f23042r = decelerateInterpolator;
        this.f23045u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f23027z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f23034j = this.d;
        this.f23035k = this.e;
        this.f23041q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f23041q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f23036l);
        int i10 = this.f23037m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f23028a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f23026y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f23029b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f23034j = round;
                    int min = Math.min(round, this.f23032g);
                    this.f23034j = min;
                    this.f23034j = Math.max(min, this.f23031f);
                    int i15 = this.f23030c;
                    int round2 = Math.round(z10 * (this.e - i15)) + i15;
                    this.f23035k = round2;
                    int min2 = Math.min(round2, this.f23033i);
                    this.f23035k = min2;
                    int max = Math.max(min2, this.h);
                    this.f23035k = max;
                    if (this.f23034j == this.d && max == this.e) {
                        this.f23041q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f23038n;
            Interpolator interpolator = this.f23042r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f23034j = Math.round(this.f23039o * interpolation) + this.f23029b;
            this.f23035k = Math.round(interpolation * this.f23040p) + this.f23030c;
            return true;
        }
        this.f23034j = this.d;
        this.f23035k = this.e;
        this.f23041q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f23028a = 0;
        this.f23041q = false;
        this.f23037m = i11;
        this.f23036l = AnimationUtils.currentAnimationTimeMillis();
        this.f23029b = 0;
        this.f23030c = 0;
        this.d = 0;
        this.e = i10;
        this.f23039o = 0;
        this.f23040p = i10;
        this.f23038n = 1.0f / this.f23037m;
    }
}
