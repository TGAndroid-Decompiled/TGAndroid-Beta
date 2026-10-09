package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v30 {
    public float f31679c;
    public float d;
    public float f31680e;
    public float f31681f;
    public RadialGradient f31682g;
    public final int f31683i;
    public int f31684j;
    public int f31685k;
    public int f31686l;
    public float f31677a = -1.0f;
    public float f31678b = -1.0f;
    public final Matrix h = new Matrix();

    public v30(int i10) {
        this.f31683i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f31683i;
        if (i10 == 0) {
            int i11 = this.f31684j;
            int i12 = org.telegram.ui.ActionBar.i6.Tg;
            if (i11 != org.telegram.ui.ActionBar.i6.x0(null, i12, false) || this.f31685k != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ug, false)) {
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
                this.f31684j = x02;
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ug, false);
                this.f31685k = x03;
                this.f31682g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f31684j;
            int i14 = org.telegram.ui.ActionBar.i6.Vg;
            if (i13 != org.telegram.ui.ActionBar.i6.x0(null, i14, false) || this.f31685k != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Wg, false)) {
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, i14, false);
                this.f31684j = x04;
                int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Wg, false);
                this.f31685k = x05;
                this.f31682g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f31684j;
            int i16 = org.telegram.ui.ActionBar.i6.f20898ih;
            if (i15 != org.telegram.ui.ActionBar.i6.x0(null, i16, false) || this.f31685k != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20916jh, false) || this.f31686l != org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20936kh, false)) {
                int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20916jh, false);
                this.f31685k = x06;
                int x07 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20936kh, false);
                this.f31686l = x07;
                int x08 = org.telegram.ui.ActionBar.i6.x0(null, i16, false);
                this.f31684j = x08;
                this.f31682g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.f31680e;
        if (f11 == 0.0f || this.f31681f >= f11) {
            this.f31680e = Utilities.random.nextInt(700) + 500;
            this.f31681f = 0.0f;
            if (this.f31677a == -1.0f) {
                b();
            }
            this.f31679c = this.f31677a;
            this.d = this.f31678b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f31681f;
        this.f31681f = f13;
        float f14 = this.f31680e;
        if (f13 > f14) {
            this.f31681f = f14;
        }
        float interpolation = hs.f27119g.getInterpolation(this.f31681f / f14);
        float f15 = dp;
        float f16 = this.f31679c;
        float f17 = ((((this.f31677a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f31678b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f31682g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f31683i;
        if (i10 == 0) {
            this.f31677a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f31678b = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f31677a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f31678b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f31677a = a1.g.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f31678b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
