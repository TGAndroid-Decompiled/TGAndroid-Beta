package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i30 {
    public float f27294c;
    public float d;
    public float f27295e;
    public float f27296f;
    public RadialGradient f27297g;
    public final int f27298i;
    public int f27299j;
    public int f27300k;
    public int f27301l;
    public float f27292a = -1.0f;
    public float f27293b = -1.0f;
    public final Matrix h = new Matrix();

    public i30(int i10) {
        this.f27298i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f27298i;
        if (i10 == 0) {
            int i11 = this.f27299j;
            int i12 = org.telegram.ui.ActionBar.i6.Tg;
            if (i11 != org.telegram.ui.ActionBar.i6.w0(null, i12, false) || this.f27300k != org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
                this.f27299j = w02;
                int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ug, false);
                this.f27300k = w03;
                this.f27297g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f27299j;
            int i14 = org.telegram.ui.ActionBar.i6.Vg;
            if (i13 != org.telegram.ui.ActionBar.i6.w0(null, i14, false) || this.f27300k != org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, i14, false);
                this.f27299j = w04;
                int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Wg, false);
                this.f27300k = w05;
                this.f27297g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f27299j;
            int i16 = org.telegram.ui.ActionBar.i6.f20918ih;
            if (i15 != org.telegram.ui.ActionBar.i6.w0(null, i16, false) || this.f27300k != org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20937jh, false) || this.f27301l != org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20957kh, false)) {
                int w06 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20937jh, false);
                this.f27300k = w06;
                int w07 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20957kh, false);
                this.f27301l = w07;
                int w08 = org.telegram.ui.ActionBar.i6.w0(null, i16, false);
                this.f27299j = w08;
                this.f27297g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.f27295e;
        if (f11 == 0.0f || this.f27296f >= f11) {
            this.f27295e = Utilities.random.nextInt(700) + 500;
            this.f27296f = 0.0f;
            if (this.f27292a == -1.0f) {
                b();
            }
            this.f27294c = this.f27292a;
            this.d = this.f27293b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f27296f;
        this.f27296f = f13;
        float f14 = this.f27295e;
        if (f13 > f14) {
            this.f27296f = f14;
        }
        float interpolation = tr.f31141g.getInterpolation(this.f27296f / f14);
        float f15 = dp;
        float f16 = this.f27294c;
        float f17 = ((((this.f27292a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f27293b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f27297g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f27298i;
        if (i10 == 0) {
            this.f27292a = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f27293b = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f27292a = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f27293b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f27292a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f27293b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
