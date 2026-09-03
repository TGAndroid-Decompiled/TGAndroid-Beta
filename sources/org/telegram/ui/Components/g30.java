package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g30 {
    public float f25031c;
    public float d;
    public float e;
    public float f25032f;
    public RadialGradient f25033g;
    public final int f25034i;
    public int f25035j;
    public int f25036k;
    public int f25037l;
    public float f25029a = -1.0f;
    public float f25030b = -1.0f;
    public final Matrix h = new Matrix();

    public g30(int i10) {
        this.f25034i = i10;
    }

    public final void a(float f10) {
        float f11;
        int i10 = this.f25034i;
        if (i10 == 0) {
            int i11 = this.f25035j;
            int i12 = org.telegram.ui.ActionBar.j6.Tg;
            if (i11 != org.telegram.ui.ActionBar.j6.w0(null, i12, false) || this.f25036k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
                this.f25035j = w02;
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false);
                this.f25036k = w03;
                this.f25033g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f25035j;
            int i14 = org.telegram.ui.ActionBar.j6.Vg;
            if (i13 != org.telegram.ui.ActionBar.j6.w0(null, i14, false) || this.f25036k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                this.f25035j = w04;
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false);
                this.f25036k = w05;
                this.f25033g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f25035j;
            int i16 = org.telegram.ui.ActionBar.j6.f19980ih;
            if (i15 != org.telegram.ui.ActionBar.j6.w0(null, i16, false) || this.f25036k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19998jh, false) || this.f25037l != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20017kh, false)) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19998jh, false);
                this.f25036k = w06;
                int w07 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20017kh, false);
                this.f25037l = w07;
                int w08 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                this.f25035j = w08;
                this.f25033g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f12 = this.e;
        if (f12 == 0.0f || this.f25032f >= f12) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f25032f = 0.0f;
            if (this.f25029a == -1.0f) {
                b();
            }
            this.f25031c = this.f25029a;
            this.d = this.f25030b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f25032f;
        this.f25032f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f25032f = f15;
        }
        float interpolation = mr.f27123g.getInterpolation(this.f25032f / f15);
        float f16 = dp;
        float f17 = this.f25031c;
        float f18 = ((((this.f25029a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f25030b - f19) * interpolation) + f19) * f16) - 200.0f;
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
        this.f25033g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f25034i;
        if (i10 == 0) {
            this.f25029a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f25030b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f25029a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f25030b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f25029a = vh.w2.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f25030b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
