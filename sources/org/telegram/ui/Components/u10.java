package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class u10 {
    public float f38476c;
    public float d;
    public float f38477e;
    public float f38478f;
    public RadialGradient f38479g;
    public final int f38480i;
    public int f38481j;
    public int f38482k;
    public int f38483l;
    public float f38474a = -1.0f;
    public float f38475b = -1.0f;
    public final Matrix h = new Matrix();

    public u10(int i7) {
        this.f38480i = i7;
    }

    public final void a(float f10) {
        float f11;
        int i7 = this.f38480i;
        if (i7 == 0) {
            int i10 = this.f38481j;
            int i11 = org.telegram.ui.ActionBar.m6.Hh;
            if (i10 != org.telegram.ui.ActionBar.m6.x0(null, i11, false) || this.f38482k != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ih, false)) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
                this.f38481j = x02;
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ih, false);
                this.f38482k = x03;
                this.f38479g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 1) {
            int i12 = this.f38481j;
            int i13 = org.telegram.ui.ActionBar.m6.Jh;
            if (i12 != org.telegram.ui.ActionBar.m6.x0(null, i13, false) || this.f38482k != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Kh, false)) {
                int x04 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                this.f38481j = x04;
                int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Kh, false);
                this.f38482k = x05;
                this.f38479g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 3) {
            int i14 = this.f38481j;
            int i15 = org.telegram.ui.ActionBar.m6.Wh;
            if (i14 != org.telegram.ui.ActionBar.m6.x0(null, i15, false) || this.f38482k != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xh, false) || this.f38483l != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false)) {
                int x06 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xh, false);
                this.f38482k = x06;
                int x07 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false);
                this.f38483l = x07;
                int x08 = org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                this.f38481j = x08;
                this.f38479g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f12 = this.f38477e;
        if (f12 == 0.0f || this.f38478f >= f12) {
            this.f38477e = Utilities.f21339b.nextInt(700) + 500;
            this.f38478f = 0.0f;
            if (this.f38474a == -1.0f) {
                b();
            }
            this.f38476c = this.f38474a;
            this.d = this.f38475b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f38478f;
        this.f38478f = f14;
        float f15 = this.f38477e;
        if (f14 > f15) {
            this.f38478f = f15;
        }
        float interpolation = wq.f40047g.getInterpolation(this.f38478f / f15);
        float f16 = L;
        float f17 = this.f38476c;
        float f18 = ((((this.f38474a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f38475b - f19) * interpolation) + f19) * f16) - 200.0f;
        if (i7 == 3) {
            f11 = 2.0f;
        } else {
            f11 = 1.5f;
        }
        float f21 = (f16 / 400.0f) * f11;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(f21, f21, f18 + 200.0f, f20 + 200.0f);
        this.f38479g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i7 = this.f38480i;
        if (i7 == 0) {
            SecureRandom secureRandom = Utilities.f21339b;
            this.f38474a = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f38475b = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i7 == 3) {
            SecureRandom secureRandom2 = Utilities.f21339b;
            this.f38474a = a8.p0.f(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f38475b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f21339b;
            this.f38474a = com.google.android.recaptcha.internal.a.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f38475b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
