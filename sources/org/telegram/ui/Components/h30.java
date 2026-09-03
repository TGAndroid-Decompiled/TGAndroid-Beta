package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h30 {
    public float f27343c;
    public float d;
    public float f27344e;
    public float f27345f;
    public RadialGradient f27346g;
    public final int f27347i;
    public int f27348j;
    public int f27349k;
    public int f27350l;
    public float f27341a = -1.0f;
    public float f27342b = -1.0f;
    public final Matrix h = new Matrix();

    public h30(int i10) {
        this.f27347i = i10;
    }

    public final void a(float f10) {
        float f11;
        int i10 = this.f27347i;
        if (i10 == 0) {
            int i11 = this.f27348j;
            int i12 = org.telegram.ui.ActionBar.k6.Tg;
            if (i11 != org.telegram.ui.ActionBar.k6.w0(null, i12, false) || this.f27349k != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
                this.f27348j = w02;
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ug, false);
                this.f27349k = w03;
                this.f27346g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f27348j;
            int i14 = org.telegram.ui.ActionBar.k6.Vg;
            if (i13 != org.telegram.ui.ActionBar.k6.w0(null, i14, false) || this.f27349k != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(null, i14, false);
                this.f27348j = w04;
                int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Wg, false);
                this.f27349k = w05;
                this.f27346g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f27348j;
            int i16 = org.telegram.ui.ActionBar.k6.f21761ih;
            if (i15 != org.telegram.ui.ActionBar.k6.w0(null, i16, false) || this.f27349k != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21779jh, false) || this.f27350l != org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21798kh, false)) {
                int w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21779jh, false);
                this.f27349k = w06;
                int w07 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21798kh, false);
                this.f27350l = w07;
                int w08 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
                this.f27348j = w08;
                this.f27346g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f12 = this.f27344e;
        if (f12 == 0.0f || this.f27345f >= f12) {
            this.f27344e = Utilities.random.nextInt(700) + 500;
            this.f27345f = 0.0f;
            if (this.f27341a == -1.0f) {
                b();
            }
            this.f27343c = this.f27341a;
            this.d = this.f27342b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f27345f;
        this.f27345f = f14;
        float f15 = this.f27344e;
        if (f14 > f15) {
            this.f27345f = f15;
        }
        float interpolation = pr.f30169g.getInterpolation(this.f27345f / f15);
        float f16 = dp;
        float f17 = this.f27343c;
        float f18 = ((((this.f27341a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f27342b - f19) * interpolation) + f19) * f16) - 200.0f;
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
        this.f27346g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f27347i;
        if (i10 == 0) {
            this.f27341a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f27342b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f27341a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f27342b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f27341a = w.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f27342b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
