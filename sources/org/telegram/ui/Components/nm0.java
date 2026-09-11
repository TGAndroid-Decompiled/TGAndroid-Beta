package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class nm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f28814w = 0.4f;
    public static final float f28815x = 1.0f - 0.4f;
    public static final float[] f28816y = new float[101];
    public static final float f28817z;
    public int f28818a;
    public int f28819b;
    public int f28820c;
    public int d;
    public int f28821e;
    public int f28822f;
    public int f28823g;
    public int h;
    public int f28824i;
    public int f28825j;
    public int f28826k;
    public long f28827l;
    public int f28828m;
    public float f28829n;
    public float f28830o;
    public float f28831p;
    public final Interpolator f28833r;
    public float f28835t;
    public final float f28836u;
    public boolean f28832q = true;
    public final boolean f28834s = true;

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
                float B = com.google.android.gms.internal.vision.e2.B(A2, f28815x, f14 * f28814w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            f28816y[i10] = f7 + f10;
        }
        f28816y[100] = 1.0f;
        f28817z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public nm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f28833r = decelerateInterpolator;
        this.f28836u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float z10;
        float f10 = f7 * f28817z;
        if (f10 < 1.0f) {
            z10 = f10 - (1.0f - ((float) Math.exp(-f10)));
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f);
        }
        return z10 * A;
    }

    public final void a() {
        this.f28825j = this.d;
        this.f28826k = this.f28821e;
        this.f28832q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f28832q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f28827l);
        int i10 = this.f28828m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f28818a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f7 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f7 * 100.0f);
                    float f10 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f28816y;
                    float f11 = fArr[i12];
                    float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f11, (f7 - f10) / ((i13 / 100.0f) - f10), f11);
                    int i14 = this.f28819b;
                    int round = Math.round((this.d - i14) * z10) + i14;
                    this.f28825j = round;
                    int min = Math.min(round, this.f28823g);
                    this.f28825j = min;
                    this.f28825j = Math.max(min, this.f28822f);
                    int i15 = this.f28820c;
                    int round2 = Math.round(z10 * (this.f28821e - i15)) + i15;
                    this.f28826k = round2;
                    int min2 = Math.min(round2, this.f28824i);
                    this.f28826k = min2;
                    int max = Math.max(min2, this.h);
                    this.f28826k = max;
                    if (this.f28825j == this.d && max == this.f28821e) {
                        this.f28832q = true;
                    }
                }
                return true;
            }
            float f12 = currentAnimationTimeMillis * this.f28829n;
            Interpolator interpolator = this.f28833r;
            if (interpolator == null) {
                interpolation = e(f12);
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            this.f28825j = Math.round(this.f28830o * interpolation) + this.f28819b;
            this.f28826k = Math.round(interpolation * this.f28831p) + this.f28820c;
            return true;
        }
        this.f28825j = this.d;
        this.f28826k = this.f28821e;
        this.f28832q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f28818a = 0;
        this.f28832q = false;
        this.f28828m = i11;
        this.f28827l = AnimationUtils.currentAnimationTimeMillis();
        this.f28819b = 0;
        this.f28820c = 0;
        this.d = 0;
        this.f28821e = i10;
        this.f28830o = 0;
        this.f28831p = i10;
        this.f28829n = 1.0f / this.f28828m;
    }
}
