package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class wm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float f32798w = 0.4f;
    public static final float f32799x = 1.0f - 0.4f;
    public static final float[] f32800y = new float[101];
    public static final float f32801z;
    public int f32802a;
    public int f32803b;
    public int f32804c;
    public int d;
    public int f32805e;
    public int f32806f;
    public int f32807g;
    public int h;
    public int f32808i;
    public int f32809j;
    public int f32810k;
    public long f32811l;
    public int f32812m;
    public float f32813n;
    public float f32814o;
    public float f32815p;
    public final Interpolator f32817r;
    public float f32819t;
    public final float f32820u;
    public boolean f32816q = true;
    public final boolean f32818s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f13 = i10 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float x10 = e2.c.x(f14, f12, 2.0f, f12);
                float f15 = 1.0f - x10;
                f10 = 3.0f * x10 * f15;
                f11 = x10 * x10 * x10;
                float y10 = e2.c.y(x10, f32799x, f15 * f32798w, f10) + f11;
                if (Math.abs(y10 - f13) < 1.0E-5d) {
                    break;
                } else if (y10 > f13) {
                    f14 = x10;
                } else {
                    f12 = x10;
                }
            }
            f32800y[i10] = f10 + f11;
        }
        f32800y[100] = 1.0f;
        f32801z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public wm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f32817r = decelerateInterpolator;
        this.f32820u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float w10;
        float f11 = f10 * f32801z;
        if (f11 < 1.0f) {
            w10 = f11 - (1.0f - ((float) Math.exp(-f11)));
        } else {
            w10 = e2.c.w(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
        }
        return w10 * A;
    }

    public final void a() {
        this.f32809j = this.d;
        this.f32810k = this.f32805e;
        this.f32816q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.f32816q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f32811l);
        int i10 = this.f32812m;
        if (currentAnimationTimeMillis < i10) {
            int i11 = this.f32802a;
            if (i11 != 0) {
                if (i11 == 1) {
                    float f10 = currentAnimationTimeMillis / i10;
                    int i12 = (int) (f10 * 100.0f);
                    float f11 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = f32800y;
                    float f12 = fArr[i12];
                    float w10 = e2.c.w(fArr[i13], f12, (f10 - f11) / ((i13 / 100.0f) - f11), f12);
                    int i14 = this.f32803b;
                    int round = Math.round((this.d - i14) * w10) + i14;
                    this.f32809j = round;
                    int min = Math.min(round, this.f32807g);
                    this.f32809j = min;
                    this.f32809j = Math.max(min, this.f32806f);
                    int i15 = this.f32804c;
                    int round2 = Math.round(w10 * (this.f32805e - i15)) + i15;
                    this.f32810k = round2;
                    int min2 = Math.min(round2, this.f32808i);
                    this.f32810k = min2;
                    int max = Math.max(min2, this.h);
                    this.f32810k = max;
                    if (this.f32809j == this.d && max == this.f32805e) {
                        this.f32816q = true;
                    }
                }
                return true;
            }
            float f13 = currentAnimationTimeMillis * this.f32813n;
            Interpolator interpolator = this.f32817r;
            if (interpolator == null) {
                interpolation = e(f13);
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            this.f32809j = Math.round(this.f32814o * interpolation) + this.f32803b;
            this.f32810k = Math.round(interpolation * this.f32815p) + this.f32804c;
            return true;
        }
        this.f32809j = this.d;
        this.f32810k = this.f32805e;
        this.f32816q = true;
        return true;
    }

    public final void c(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wm0.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i10, int i11) {
        this.f32802a = 0;
        this.f32816q = false;
        this.f32812m = i11;
        this.f32811l = AnimationUtils.currentAnimationTimeMillis();
        this.f32803b = 0;
        this.f32804c = 0;
        this.d = 0;
        this.f32805e = i10;
        this.f32814o = 0;
        this.f32815p = i10;
        this.f32813n = 1.0f / this.f32812m;
    }
}
