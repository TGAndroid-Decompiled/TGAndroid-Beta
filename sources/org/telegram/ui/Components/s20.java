package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class s20 {

    public float f32314c;
    public float d;

    public float f32315e;

    public float f32316f;

    public RadialGradient f32317g;

    public final int f32318i;

    public int f32319j;

    public int f32320k;

    public int f32321l;

    public float f32312a = -1.0f;

    public float f32313b = -1.0f;
    public final Matrix h = new Matrix();

    public s20(int i10) {
        this.f32318i = i10;
    }

    public final void a(float f10) {
        int i10 = this.f32318i;
        if (i10 == 0) {
            int i11 = this.f32319j;
            int i12 = org.telegram.ui.ActionBar.g6.Tg;
            if (i11 != org.telegram.ui.ActionBar.g6.w0(null, i12, false) || this.f32320k != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ug, false)) {
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
                this.f32319j = iW0;
                int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ug, false);
                this.f32320k = iW1;
                this.f32317g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{iW0, iW1}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f32319j;
            int i14 = org.telegram.ui.ActionBar.g6.Vg;
            if (i13 != org.telegram.ui.ActionBar.g6.w0(null, i14, false) || this.f32320k != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wg, false)) {
                int iW2 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
                this.f32319j = iW2;
                int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wg, false);
                this.f32320k = iW3;
                this.f32317g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{iW2, iW3}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            if (i10 != 3) {
                return;
            }
            int i15 = this.f32319j;
            int i16 = org.telegram.ui.ActionBar.g6.f23154ih;
            if (i15 != org.telegram.ui.ActionBar.g6.w0(null, i16, false) || this.f32320k != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23173jh, false) || this.f32321l != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false)) {
                int iW4 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23173jh, false);
                this.f32320k = iW4;
                int iW5 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false);
                this.f32321l = iW5;
                int iW6 = org.telegram.ui.ActionBar.g6.w0(null, i16, false);
                this.f32319j = iW6;
                this.f32317g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{iW4, iW5, iW6}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        int iDp = AndroidUtilities.dp(130.0f);
        float f11 = this.f32315e;
        if (f11 == 0.0f || this.f32316f >= f11) {
            this.f32315e = Utilities.random.nextInt(700) + 500;
            this.f32316f = 0.0f;
            if (this.f32312a == -1.0f) {
                b();
            }
            this.f32314c = this.f32312a;
            this.d = this.f32313b;
            b();
        }
        float f12 = 16L;
        float f13 = (f12 * 0.02f * f10) + (1.0f * f12) + this.f32316f;
        this.f32316f = f13;
        float f14 = this.f32315e;
        if (f13 > f14) {
            this.f32316f = f14;
        }
        float interpolation = er.f28123g.getInterpolation(this.f32316f / f14);
        float f15 = iDp;
        float f16 = this.f32314c;
        float f17 = ((((this.f32312a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f32313b - f18) * interpolation) + f18) * f15) - 200.0f;
        float f20 = (f15 / 400.0f) * (i10 == 3 ? 2.0f : 1.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f17, f19);
        matrix.postScale(f20, f20, f17 + 200.0f, f19 + 200.0f);
        this.f32317g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f32318i;
        if (i10 == 0) {
            this.f32312a = a9.p.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f32313b = a9.p.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f32312a = a9.p.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f32313b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f32312a = s3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f32313b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
