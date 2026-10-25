package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p30 {
    public float f31429c;
    public float d;
    public float e;
    public float f31430f;
    public RadialGradient f31431g;
    public final int f31432i;
    public int f31433j;
    public int f31434k;
    public int f31435l;
    public float f31427a = -1.0f;
    public float f31428b = -1.0f;
    public final Matrix h = new Matrix();

    public p30(int i10) {
        this.f31432i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f31432i;
        if (i10 == 0) {
            int i11 = this.f31433j;
            int i12 = org.telegram.ui.ActionBar.y6.Tg;
            if (i11 != org.telegram.ui.ActionBar.y6.x0(null, i12, false) || this.f31434k != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ug, false)) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
                this.f31433j = x02;
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ug, false);
                this.f31434k = x03;
                this.f31431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f31433j;
            int i14 = org.telegram.ui.ActionBar.y6.Vg;
            if (i13 != org.telegram.ui.ActionBar.y6.x0(null, i14, false) || this.f31434k != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Wg, false)) {
                int x04 = org.telegram.ui.ActionBar.y6.x0(null, i14, false);
                this.f31433j = x04;
                int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Wg, false);
                this.f31434k = x05;
                this.f31431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f31433j;
            int i16 = org.telegram.ui.ActionBar.y6.f23454ih;
            if (i15 != org.telegram.ui.ActionBar.y6.x0(null, i16, false) || this.f31434k != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23473jh, false) || this.f31435l != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23493kh, false)) {
                int x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23473jh, false);
                this.f31434k = x06;
                int x07 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23493kh, false);
                this.f31435l = x07;
                int x08 = org.telegram.ui.ActionBar.y6.x0(null, i16, false);
                this.f31433j = x08;
                this.f31431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f31430f >= f11) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f31430f = 0.0f;
            if (this.f31427a == -1.0f) {
                b();
            }
            this.f31429c = this.f31427a;
            this.d = this.f31428b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f31430f;
        this.f31430f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f31430f = f14;
        }
        float interpolation = ds.f27585g.getInterpolation(this.f31430f / f14);
        float f15 = dp;
        float f16 = this.f31429c;
        float f17 = ((((this.f31427a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f31428b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f31431g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f31432i;
        if (i10 == 0) {
            this.f31427a = a1.g.C(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f31428b = a1.g.C(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f31427a = a1.g.C(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f31428b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f31427a = a1.g.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f31428b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
