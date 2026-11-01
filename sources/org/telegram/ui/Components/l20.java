package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class l20 {
    public float f28028c;
    public float d;
    public float e;
    public float f28029f;
    public RadialGradient f28030g;
    public final int f28031i;
    public int f28032j;
    public int f28033k;
    public int f28034l;
    public float f28026a = -1.0f;
    public float f28027b = -1.0f;
    public final Matrix h = new Matrix();

    public l20(int i10) {
        this.f28031i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f28031i;
        if (i10 == 0) {
            int i11 = this.f28032j;
            int i12 = org.telegram.ui.ActionBar.t6.Hh;
            if (i11 != org.telegram.ui.ActionBar.t6.x0(null, i12, false) || this.f28033k != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ih, false)) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
                this.f28032j = x02;
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ih, false);
                this.f28033k = x03;
                this.f28030g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f28032j;
            int i14 = org.telegram.ui.ActionBar.t6.Jh;
            if (i13 != org.telegram.ui.ActionBar.t6.x0(null, i14, false) || this.f28033k != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Kh, false)) {
                int x04 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                this.f28032j = x04;
                int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Kh, false);
                this.f28033k = x05;
                this.f28030g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f28032j;
            int i16 = org.telegram.ui.ActionBar.t6.Wh;
            if (i15 != org.telegram.ui.ActionBar.t6.x0(null, i16, false) || this.f28033k != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xh, false) || this.f28034l != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false)) {
                int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xh, false);
                this.f28033k = x06;
                int x07 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false);
                this.f28034l = x07;
                int x08 = org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                this.f28032j = x08;
                this.f28030g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.i0.L(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f28029f >= f11) {
            this.e = Utilities.f14520b.nextInt(700) + 500;
            this.f28029f = 0.0f;
            if (this.f28026a == -1.0f) {
                b();
            }
            this.f28028c = this.f28026a;
            this.d = this.f28027b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f28029f;
        this.f28029f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f28029f = f14;
        }
        float interpolation = gr.f26524g.getInterpolation(this.f28029f / f14);
        float f15 = L;
        float f16 = this.f28028c;
        float f17 = ((((this.f28026a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f28027b - f18) * interpolation) + f18) * f15) - 200.0f;
        if (i10 == 3) {
            f10 = 2.0f;
        } else {
            f10 = 1.5f;
        }
        float f20 = (f15 / 400.0f) * f10;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f17, f19);
        matrix.postScale(f20, f20, f17 + 200.0f, f19 + 200.0f);
        this.f28030g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f28031i;
        if (i10 == 0) {
            SecureRandom secureRandom = Utilities.f14520b;
            this.f28026a = a1.g.A(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f28027b = a1.g.A(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            SecureRandom secureRandom2 = Utilities.f14520b;
            this.f28026a = a1.g.A(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f28027b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f14520b;
            this.f28026a = a1.g.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f28027b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
