package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class q10 {
    public float f37312c;
    public float d;
    public float f37313e;
    public float f37314f;
    public RadialGradient f37315g;
    public final int f37316i;
    public int f37317j;
    public int f37318k;
    public int f37319l;
    public float f37310a = -1.0f;
    public float f37311b = -1.0f;
    public final Matrix h = new Matrix();

    public q10(int i3) {
        this.f37316i = i3;
    }

    public final void a(float f10) {
        float f11;
        int i3 = this.f37316i;
        if (i3 == 0) {
            int i10 = this.f37317j;
            int i11 = org.telegram.ui.ActionBar.k6.Hh;
            if (i10 != org.telegram.ui.ActionBar.k6.x0(null, i11, false) || this.f37318k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ih, false)) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                this.f37317j = x02;
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ih, false);
                this.f37318k = x03;
                this.f37315g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i3 == 1) {
            int i12 = this.f37317j;
            int i13 = org.telegram.ui.ActionBar.k6.Jh;
            if (i12 != org.telegram.ui.ActionBar.k6.x0(null, i13, false) || this.f37318k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Kh, false)) {
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                this.f37317j = x04;
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Kh, false);
                this.f37318k = x05;
                this.f37315g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i3 == 3) {
            int i14 = this.f37317j;
            int i15 = org.telegram.ui.ActionBar.k6.Wh;
            if (i14 != org.telegram.ui.ActionBar.k6.x0(null, i15, false) || this.f37318k != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false) || this.f37319l != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false)) {
                int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false);
                this.f37318k = x06;
                int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
                this.f37319l = x07;
                int x08 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                this.f37317j = x08;
                this.f37315g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f12 = this.f37313e;
        if (f12 == 0.0f || this.f37314f >= f12) {
            this.f37313e = Utilities.f21385b.nextInt(700) + 500;
            this.f37314f = 0.0f;
            if (this.f37310a == -1.0f) {
                b();
            }
            this.f37312c = this.f37310a;
            this.d = this.f37311b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f37314f;
        this.f37314f = f14;
        float f15 = this.f37313e;
        if (f14 > f15) {
            this.f37314f = f15;
        }
        float interpolation = xq.f40453g.getInterpolation(this.f37314f / f15);
        float f16 = L;
        float f17 = this.f37312c;
        float f18 = ((((this.f37310a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f37311b - f19) * interpolation) + f19) * f16) - 200.0f;
        if (i3 == 3) {
            f11 = 2.0f;
        } else {
            f11 = 1.5f;
        }
        float f21 = (f16 / 400.0f) * f11;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(f21, f21, f18 + 200.0f, f20 + 200.0f);
        this.f37315g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i3 = this.f37316i;
        if (i3 == 0) {
            SecureRandom secureRandom = Utilities.f21385b;
            this.f37310a = a1.g.e(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f37311b = a1.g.e(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i3 == 3) {
            SecureRandom secureRandom2 = Utilities.f21385b;
            this.f37310a = a1.g.e(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f37311b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f21385b;
            this.f37310a = a1.g.A(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f37311b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
