package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e30 {
    public float f25562c;
    public float d;
    public float f25563e;
    public float f25564f;
    public RadialGradient f25565g;
    public final int f25566i;
    public int f25567j;
    public int f25568k;
    public int f25569l;
    public float f25560a = -1.0f;
    public float f25561b = -1.0f;
    public final Matrix h = new Matrix();

    public e30(int i10) {
        this.f25566i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f25566i;
        if (i10 == 0) {
            int i11 = this.f25567j;
            int i12 = org.telegram.ui.ActionBar.j6.Tg;
            if (i11 != org.telegram.ui.ActionBar.j6.w0(null, i12, false) || this.f25568k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
                this.f25567j = w02;
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false);
                this.f25568k = w03;
                this.f25565g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f25567j;
            int i14 = org.telegram.ui.ActionBar.j6.Vg;
            if (i13 != org.telegram.ui.ActionBar.j6.w0(null, i14, false) || this.f25568k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                this.f25567j = w04;
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false);
                this.f25568k = w05;
                this.f25565g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f25567j;
            int i16 = org.telegram.ui.ActionBar.j6.f20791ih;
            if (i15 != org.telegram.ui.ActionBar.j6.w0(null, i16, false) || this.f25568k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20810jh, false) || this.f25569l != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20830kh, false)) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20810jh, false);
                this.f25568k = w06;
                int w07 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20830kh, false);
                this.f25569l = w07;
                int w08 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                this.f25567j = w08;
                this.f25565g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.f25563e;
        if (f11 == 0.0f || this.f25564f >= f11) {
            this.f25563e = Utilities.random.nextInt(700) + 500;
            this.f25564f = 0.0f;
            if (this.f25560a == -1.0f) {
                b();
            }
            this.f25562c = this.f25560a;
            this.d = this.f25561b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f25564f;
        this.f25564f = f13;
        float f14 = this.f25563e;
        if (f13 > f14) {
            this.f25564f = f14;
        }
        float interpolation = pr.f29495g.getInterpolation(this.f25564f / f14);
        float f15 = dp;
        float f16 = this.f25562c;
        float f17 = ((((this.f25560a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f25561b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f25565g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f25566i;
        if (i10 == 0) {
            this.f25560a = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f25561b = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f25560a = a4.a.A(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f25561b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f25560a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f25561b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
