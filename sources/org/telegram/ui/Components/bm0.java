package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public final class bm0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));

    public static final float f27160w = 0.4f;

    public static final float f27161x = 1.0f - 0.4f;

    public static final float[] f27162y = new float[101];

    public static final float f27163z;

    public int f27164a;

    public int f27165b;

    public int f27166c;
    public int d;

    public int f27167e;

    public int f27168f;

    public int f27169g;
    public int h;

    public int f27170i;

    public int f27171j;

    public int f27172k;

    public long f27173l;

    public int f27174m;

    public float f27175n;

    public float f27176o;

    public float f27177p;

    public final Interpolator f27179r;

    public float f27181t;

    public final float f27182u;

    public boolean f27178q = true;

    public final boolean f27180s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f13 = i10 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float fA = com.google.android.recaptcha.internal.a.A(f14, f12, 2.0f, f12);
                float f15 = 1.0f - fA;
                f10 = 3.0f * fA * f15;
                f11 = fA * fA * fA;
                float fB = com.google.android.recaptcha.internal.a.B(fA, f27161x, f15 * f27160w, f10) + f11;
                if (Math.abs(fB - f13) < 1.0E-5d) {
                    break;
                } else if (fB > f13) {
                    f14 = fA;
                } else {
                    f12 = fA;
                }
            }
            f27162y[i10] = f10 + f11;
        }
        f27162y[100] = 1.0f;
        f27163z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public bm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.f27179r = decelerateInterpolator;
        this.f27182u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float f11 = f10 * f27163z;
        return (f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f)) * A;
    }

    public final void a() {
        this.f27171j = this.d;
        this.f27172k = this.f27167e;
        this.f27178q = true;
    }

    public final boolean b() {
        if (this.f27178q) {
            return false;
        }
        int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f27173l);
        int i10 = this.f27174m;
        if (iCurrentAnimationTimeMillis >= i10) {
            this.f27171j = this.d;
            this.f27172k = this.f27167e;
            this.f27178q = true;
            return true;
        }
        int i11 = this.f27164a;
        if (i11 == 0) {
            float f10 = iCurrentAnimationTimeMillis * this.f27175n;
            Interpolator interpolator = this.f27179r;
            float fE = interpolator == null ? e(f10) : interpolator.getInterpolation(f10);
            this.f27171j = Math.round(this.f27176o * fE) + this.f27165b;
            this.f27172k = Math.round(fE * this.f27177p) + this.f27166c;
            return true;
        }
        if (i11 == 1) {
            float f11 = iCurrentAnimationTimeMillis / i10;
            int i12 = (int) (f11 * 100.0f);
            float f12 = i12 / 100.0f;
            int i13 = i12 + 1;
            float[] fArr = f27162y;
            float f13 = fArr[i12];
            float fZ = com.google.android.recaptcha.internal.a.z(fArr[i13], f13, (f11 - f12) / ((i13 / 100.0f) - f12), f13);
            int i14 = this.f27165b;
            int iRound = Math.round((this.d - i14) * fZ) + i14;
            this.f27171j = iRound;
            int iMin = Math.min(iRound, this.f27169g);
            this.f27171j = iMin;
            this.f27171j = Math.max(iMin, this.f27168f);
            int i15 = this.f27166c;
            int iRound2 = Math.round(fZ * (this.f27167e - i15)) + i15;
            this.f27172k = iRound2;
            int iMin2 = Math.min(iRound2, this.f27170i);
            this.f27172k = iMin2;
            int iMax = Math.max(iMin2, this.h);
            this.f27172k = iMax;
            if (this.f27171j == this.d && iMax == this.f27167e) {
                this.f27178q = true;
            }
        }
        return true;
    }

    public final void c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        float fSqrt;
        float f10;
        if (this.f27180s && !this.f27178q) {
            float fCurrentAnimationTimeMillis = this.f27181t - ((this.f27182u * ((int) (AnimationUtils.currentAnimationTimeMillis() - this.f27173l))) / 2000.0f);
            float f11 = this.d - this.f27165b;
            float f12 = this.f27167e - this.f27166c;
            float fSqrt2 = (float) Math.sqrt((f12 * f12) + (f11 * f11));
            float f13 = (f11 / fSqrt2) * fCurrentAnimationTimeMillis;
            float f14 = (f12 / fSqrt2) * fCurrentAnimationTimeMillis;
            i18 = i12;
            float f15 = i18;
            if (Math.signum(f15) == Math.signum(f13)) {
                i19 = i13;
                float f16 = i19;
                if (Math.signum(f16) == Math.signum(f14)) {
                    i18 = (int) (f15 + f13);
                    i19 = (int) (f16 + f14);
                }
            }
            this.f27164a = 1;
            this.f27178q = false;
            fSqrt = (float) Math.sqrt((i19 * i19) + (i18 * i18));
            this.f27181t = fSqrt;
            double dLog = Math.log((f27160w * fSqrt) / 800.0f);
            double d = v;
            double d10 = d - 1.0d;
            this.f27174m = (int) (Math.exp(dLog / d10) * 1000.0d);
            this.f27173l = AnimationUtils.currentAnimationTimeMillis();
            this.f27165b = i10;
            this.f27166c = i11;
            if (fSqrt == 0.0f) {
                f10 = 1.0f;
            } else {
                f10 = i18 / fSqrt;
            }
            float f17 = fSqrt != 0.0f ? i19 / fSqrt : 1.0f;
            double dExp = Math.exp((d / d10) * dLog);
            this.f27168f = i14;
            this.f27169g = i15;
            this.h = i16;
            this.f27170i = i17;
            float f18 = (int) (dExp * ((double) 800.0f));
            int iRound = Math.round(f10 * f18) + i10;
            this.d = iRound;
            int iMin = Math.min(iRound, this.f27169g);
            this.d = iMin;
            this.d = Math.max(iMin, this.f27168f);
            int iRound2 = Math.round(f18 * f17) + i11;
            this.f27167e = iRound2;
            int iMin2 = Math.min(iRound2, this.f27170i);
            this.f27167e = iMin2;
            this.f27167e = Math.max(iMin2, this.h);
        }
        i18 = i12;
        i19 = i13;
        this.f27164a = 1;
        this.f27178q = false;
        fSqrt = (float) Math.sqrt((i19 * i19) + (i18 * i18));
        this.f27181t = fSqrt;
        double dLog2 = Math.log((f27160w * fSqrt) / 800.0f);
        double d11 = v;
        double d12 = d11 - 1.0d;
        this.f27174m = (int) (Math.exp(dLog2 / d12) * 1000.0d);
        this.f27173l = AnimationUtils.currentAnimationTimeMillis();
        this.f27165b = i10;
        this.f27166c = i11;
        if (fSqrt == 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = i18 / fSqrt;
        }
        if (fSqrt != 0.0f) {
        }
        double dExp2 = Math.exp((d11 / d12) * dLog2);
        this.f27168f = i14;
        this.f27169g = i15;
        this.h = i16;
        this.f27170i = i17;
        float f19 = (int) (dExp2 * ((double) 800.0f));
        int iRound3 = Math.round(f10 * f19) + i10;
        this.d = iRound3;
        int iMin3 = Math.min(iRound3, this.f27169g);
        this.d = iMin3;
        this.d = Math.max(iMin3, this.f27168f);
        int iRound4 = Math.round(f19 * f17) + i11;
        this.f27167e = iRound4;
        int iMin4 = Math.min(iRound4, this.f27170i);
        this.f27167e = iMin4;
        this.f27167e = Math.max(iMin4, this.h);
    }

    public final void d(int i10, int i11) {
        this.f27164a = 0;
        this.f27178q = false;
        this.f27174m = i11;
        this.f27173l = AnimationUtils.currentAnimationTimeMillis();
        this.f27165b = 0;
        this.f27166c = 0;
        this.d = 0;
        this.f27167e = i10;
        this.f27176o = 0;
        this.f27177p = i10;
        this.f27175n = 1.0f / this.f27174m;
    }
}
