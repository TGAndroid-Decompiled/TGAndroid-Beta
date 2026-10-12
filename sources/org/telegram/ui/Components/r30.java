package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r30 {
    public float f28726c;
    public float d;
    public float e;
    public float f28727f;
    public RadialGradient f28728g;
    public final int f28729i;
    public int f28730j;
    public int f28731k;
    public int f28732l;
    public float f28724a = -1.0f;
    public float f28725b = -1.0f;
    public final Matrix h = new Matrix();

    public r30(int i10) {
        this.f28729i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f28729i;
        if (i10 == 0) {
            int i11 = this.f28730j;
            int i12 = org.telegram.ui.ActionBar.g6.Tg;
            if (i11 != org.telegram.ui.ActionBar.g6.x0(null, i12, false) || this.f28731k != org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ug, false)) {
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
                this.f28730j = x02;
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ug, false);
                this.f28731k = x03;
                this.f28728g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f28730j;
            int i14 = org.telegram.ui.ActionBar.g6.Vg;
            if (i13 != org.telegram.ui.ActionBar.g6.x0(null, i14, false) || this.f28731k != org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Wg, false)) {
                int x04 = org.telegram.ui.ActionBar.g6.x0(null, i14, false);
                this.f28730j = x04;
                int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Wg, false);
                this.f28731k = x05;
                this.f28728g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f28730j;
            int i16 = org.telegram.ui.ActionBar.g6.f19999ih;
            if (i15 != org.telegram.ui.ActionBar.g6.x0(null, i16, false) || this.f28731k != org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20019jh, false) || this.f28732l != org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20038kh, false)) {
                int x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20019jh, false);
                this.f28731k = x06;
                int x07 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20038kh, false);
                this.f28732l = x07;
                int x08 = org.telegram.ui.ActionBar.g6.x0(null, i16, false);
                this.f28730j = x08;
                this.f28728g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f28727f >= f11) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f28727f = 0.0f;
            if (this.f28724a == -1.0f) {
                b();
            }
            this.f28726c = this.f28724a;
            this.d = this.f28725b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f28727f;
        this.f28727f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f28727f = f14;
        }
        float interpolation = es.f24772g.getInterpolation(this.f28727f / f14);
        float f15 = dp;
        float f16 = this.f28726c;
        float f17 = ((((this.f28724a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f28725b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f28728g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f28729i;
        if (i10 == 0) {
            this.f28724a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f28725b = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f28724a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f28725b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f28724a = a1.g.d(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f28725b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
