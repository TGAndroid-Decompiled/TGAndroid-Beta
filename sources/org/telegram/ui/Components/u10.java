package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class u10 {
    public float f38468c;
    public float d;
    public float f38469e;
    public float f38470f;
    public RadialGradient f38471g;
    public final int f38472i;
    public int f38473j;
    public int f38474k;
    public int f38475l;
    public float f38466a = -1.0f;
    public float f38467b = -1.0f;
    public final Matrix h = new Matrix();

    public u10(int i7) {
        this.f38472i = i7;
    }

    public final void a(float f10) {
        float f11;
        int i7 = this.f38472i;
        if (i7 == 0) {
            int i10 = this.f38473j;
            int i11 = org.telegram.ui.ActionBar.k6.Hh;
            if (i10 != org.telegram.ui.ActionBar.k6.x0(null, i11, false) || this.f38474k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ih, false)) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                this.f38473j = x02;
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ih, false);
                this.f38474k = x03;
                this.f38471g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 1) {
            int i12 = this.f38473j;
            int i13 = org.telegram.ui.ActionBar.k6.Jh;
            if (i12 != org.telegram.ui.ActionBar.k6.x0(null, i13, false) || this.f38474k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Kh, false)) {
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                this.f38473j = x04;
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Kh, false);
                this.f38474k = x05;
                this.f38471g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 3) {
            int i14 = this.f38473j;
            int i15 = org.telegram.ui.ActionBar.k6.Wh;
            if (i14 != org.telegram.ui.ActionBar.k6.x0(null, i15, false) || this.f38474k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false) || this.f38475l != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false)) {
                int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false);
                this.f38474k = x06;
                int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
                this.f38475l = x07;
                int x08 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                this.f38473j = x08;
                this.f38471g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f12 = this.f38469e;
        if (f12 == 0.0f || this.f38470f >= f12) {
            this.f38469e = Utilities.f21331b.nextInt(700) + 500;
            this.f38470f = 0.0f;
            if (this.f38466a == -1.0f) {
                b();
            }
            this.f38468c = this.f38466a;
            this.d = this.f38467b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f38470f;
        this.f38470f = f14;
        float f15 = this.f38469e;
        if (f14 > f15) {
            this.f38470f = f15;
        }
        float interpolation = xq.f40330g.getInterpolation(this.f38470f / f15);
        float f16 = L;
        float f17 = this.f38468c;
        float f18 = ((((this.f38466a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f38467b - f19) * interpolation) + f19) * f16) - 200.0f;
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
        this.f38471g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i7 = this.f38472i;
        if (i7 == 0) {
            SecureRandom secureRandom = Utilities.f21331b;
            this.f38466a = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f38467b = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i7 == 3) {
            SecureRandom secureRandom2 = Utilities.f21331b;
            this.f38466a = a8.p0.f(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f38467b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f21331b;
            this.f38466a = com.google.android.recaptcha.internal.a.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f38467b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
