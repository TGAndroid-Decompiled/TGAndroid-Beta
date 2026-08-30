package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f30 {
    public float f24763c;
    public float d;
    public float e;
    public float f24764f;
    public RadialGradient f24765g;
    public final int f24766i;
    public int f24767j;
    public int f24768k;
    public int f24769l;
    public float f24761a = -1.0f;
    public float f24762b = -1.0f;
    public final Matrix h = new Matrix();

    public f30(int i10) {
        this.f24766i = i10;
    }

    public final void a(float f10) {
        float f11;
        int i10 = this.f24766i;
        if (i10 == 0) {
            int i11 = this.f24767j;
            int i12 = org.telegram.ui.ActionBar.j6.Tg;
            if (i11 != org.telegram.ui.ActionBar.j6.w0(null, i12, false) || this.f24768k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
                this.f24767j = w02;
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false);
                this.f24768k = w03;
                this.f24765g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f24767j;
            int i14 = org.telegram.ui.ActionBar.j6.Vg;
            if (i13 != org.telegram.ui.ActionBar.j6.w0(null, i14, false) || this.f24768k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                this.f24767j = w04;
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false);
                this.f24768k = w05;
                this.f24765g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f24767j;
            int i16 = org.telegram.ui.ActionBar.j6.f20005ih;
            if (i15 != org.telegram.ui.ActionBar.j6.w0(null, i16, false) || this.f24768k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20023jh, false) || this.f24769l != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20042kh, false)) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20023jh, false);
                this.f24768k = w06;
                int w07 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20042kh, false);
                this.f24769l = w07;
                int w08 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                this.f24767j = w08;
                this.f24765g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f12 = this.e;
        if (f12 == 0.0f || this.f24764f >= f12) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f24764f = 0.0f;
            if (this.f24761a == -1.0f) {
                b();
            }
            this.f24763c = this.f24761a;
            this.d = this.f24762b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f24764f;
        this.f24764f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f24764f = f15;
        }
        float interpolation = nr.f27347g.getInterpolation(this.f24764f / f15);
        float f16 = dp;
        float f17 = this.f24763c;
        float f18 = ((((this.f24761a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f24762b - f19) * interpolation) + f19) * f16) - 200.0f;
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
        this.f24765g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f24766i;
        if (i10 == 0) {
            this.f24761a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f24762b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f24761a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f24762b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f24761a = vh.v2.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f24762b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
