package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n30 {
    public float f28676c;
    public float d;
    public float e;
    public float f28677f;
    public RadialGradient f28678g;
    public final int f28679i;
    public int f28680j;
    public int f28681k;
    public int f28682l;
    public float f28674a = -1.0f;
    public float f28675b = -1.0f;
    public final Matrix h = new Matrix();

    public n30(int i10) {
        this.f28679i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f28679i;
        if (i10 == 0) {
            int i11 = this.f28680j;
            int i12 = org.telegram.ui.ActionBar.h6.Tg;
            if (i11 != org.telegram.ui.ActionBar.h6.x0(null, i12, false) || this.f28681k != org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ug, false)) {
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
                this.f28680j = x02;
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ug, false);
                this.f28681k = x03;
                this.f28678g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f28680j;
            int i14 = org.telegram.ui.ActionBar.h6.Vg;
            if (i13 != org.telegram.ui.ActionBar.h6.x0(null, i14, false) || this.f28681k != org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wg, false)) {
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
                this.f28680j = x04;
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wg, false);
                this.f28681k = x05;
                this.f28678g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f28680j;
            int i16 = org.telegram.ui.ActionBar.h6.f21092ih;
            if (i15 != org.telegram.ui.ActionBar.h6.x0(null, i16, false) || this.f28681k != org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21112jh, false) || this.f28682l != org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21131kh, false)) {
                int x06 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21112jh, false);
                this.f28681k = x06;
                int x07 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21131kh, false);
                this.f28682l = x07;
                int x08 = org.telegram.ui.ActionBar.h6.x0(null, i16, false);
                this.f28680j = x08;
                this.f28678g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f28677f >= f11) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f28677f = 0.0f;
            if (this.f28674a == -1.0f) {
                b();
            }
            this.f28676c = this.f28674a;
            this.d = this.f28675b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f28677f;
        this.f28677f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f28677f = f14;
        }
        float interpolation = bs.f25026g.getInterpolation(this.f28677f / f14);
        float f15 = dp;
        float f16 = this.f28676c;
        float f17 = ((((this.f28674a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f28675b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f28678g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f28679i;
        if (i10 == 0) {
            this.f28674a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f28675b = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f28674a = a1.g.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f28675b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f28674a = a1.g.d(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f28675b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
