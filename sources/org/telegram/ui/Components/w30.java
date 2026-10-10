package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w30 {
    public float f32581c;
    public float d;
    public float f32582e;
    public float f32583f;
    public RadialGradient f32584g;
    public final int f32585i;
    public int f32586j;
    public int f32587k;
    public int f32588l;
    public float f32579a = -1.0f;
    public float f32580b = -1.0f;
    public final Matrix h = new Matrix();

    public w30(int i10) {
        this.f32585i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f32585i;
        if (i10 == 0) {
            int i11 = this.f32586j;
            int i12 = org.telegram.ui.ActionBar.i6.Tg;
            if (i11 != org.telegram.ui.ActionBar.i6.x0(null, i12, false) || this.f32587k != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ug, false)) {
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
                this.f32586j = x02;
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ug, false);
                this.f32587k = x03;
                this.f32584g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f32586j;
            int i14 = org.telegram.ui.ActionBar.i6.Vg;
            if (i13 != org.telegram.ui.ActionBar.i6.x0(null, i14, false) || this.f32587k != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Wg, false)) {
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, i14, false);
                this.f32586j = x04;
                int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Wg, false);
                this.f32587k = x05;
                this.f32584g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f32586j;
            int i16 = org.telegram.ui.ActionBar.i6.f20902ih;
            if (i15 != org.telegram.ui.ActionBar.i6.x0(null, i16, false) || this.f32587k != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20920jh, false) || this.f32588l != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20940kh, false)) {
                int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20920jh, false);
                this.f32587k = x06;
                int x07 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20940kh, false);
                this.f32588l = x07;
                int x08 = org.telegram.ui.ActionBar.i6.x0(null, i16, false);
                this.f32586j = x08;
                this.f32584g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.f32582e;
        if (f11 == 0.0f || this.f32583f >= f11) {
            this.f32582e = Utilities.random.nextInt(700) + 500;
            this.f32583f = 0.0f;
            if (this.f32579a == -1.0f) {
                b();
            }
            this.f32581c = this.f32579a;
            this.d = this.f32580b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f32583f;
        this.f32583f = f13;
        float f14 = this.f32582e;
        if (f13 > f14) {
            this.f32583f = f14;
        }
        float interpolation = is.f27444g.getInterpolation(this.f32583f / f14);
        float f15 = dp;
        float f16 = this.f32581c;
        float f17 = ((((this.f32579a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f32580b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f32584g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f32585i;
        if (i10 == 0) {
            this.f32579a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f32580b = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f32579a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f32580b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f32579a = a1.g.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f32580b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
