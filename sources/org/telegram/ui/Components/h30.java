package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h30 {
    public float f27361c;
    public float d;
    public float f27362e;
    public float f27363f;
    public RadialGradient f27364g;
    public final int f27365i;
    public int f27366j;
    public int f27367k;
    public int f27368l;
    public float f27359a = -1.0f;
    public float f27360b = -1.0f;
    public final Matrix h = new Matrix();

    public h30(int i10) {
        this.f27365i = i10;
    }

    public final void a(float f10) {
        float f11;
        int i10 = this.f27365i;
        if (i10 == 0) {
            int i11 = this.f27366j;
            int i12 = org.telegram.ui.ActionBar.k6.Tg;
            if (i11 != org.telegram.ui.ActionBar.k6.w0(null, i12, false) || this.f27367k != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
                this.f27366j = w02;
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ug, false);
                this.f27367k = w03;
                this.f27364g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f27366j;
            int i14 = org.telegram.ui.ActionBar.k6.Vg;
            if (i13 != org.telegram.ui.ActionBar.k6.w0(null, i14, false) || this.f27367k != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(null, i14, false);
                this.f27366j = w04;
                int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Wg, false);
                this.f27367k = w05;
                this.f27364g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f27366j;
            int i16 = org.telegram.ui.ActionBar.k6.f21759ih;
            if (i15 != org.telegram.ui.ActionBar.k6.w0(null, i16, false) || this.f27367k != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21777jh, false) || this.f27368l != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21796kh, false)) {
                int w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21777jh, false);
                this.f27367k = w06;
                int w07 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21796kh, false);
                this.f27368l = w07;
                int w08 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
                this.f27366j = w08;
                this.f27364g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f12 = this.f27362e;
        if (f12 == 0.0f || this.f27363f >= f12) {
            this.f27362e = Utilities.random.nextInt(700) + 500;
            this.f27363f = 0.0f;
            if (this.f27359a == -1.0f) {
                b();
            }
            this.f27361c = this.f27359a;
            this.d = this.f27360b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f27363f;
        this.f27363f = f14;
        float f15 = this.f27362e;
        if (f14 > f15) {
            this.f27363f = f15;
        }
        float interpolation = pr.f30184g.getInterpolation(this.f27363f / f15);
        float f16 = dp;
        float f17 = this.f27361c;
        float f18 = ((((this.f27359a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f27360b - f19) * interpolation) + f19) * f16) - 200.0f;
        if (i10 == 3) {
            f11 = 2.0f;
        } else {
            f11 = 1.5f;
        }
        float f21 = (f16 / 400.0f) * f11;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(f21, f21, f18 + 200.0f, f20 + 200.0f);
        this.f27364g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f27365i;
        if (i10 == 0) {
            this.f27359a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f27360b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f27359a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f27360b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f27359a = w.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f27360b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
