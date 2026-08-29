package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b30 {
    public float f26962c;
    public float d;
    public float f26963e;
    public float f26964f;
    public RadialGradient f26965g;
    public final int f26966i;
    public int f26967j;
    public int f26968k;
    public int f26969l;
    public float f26960a = -1.0f;
    public float f26961b = -1.0f;
    public final Matrix h = new Matrix();

    public b30(int i10) {
        this.f26966i = i10;
    }

    public final void a(float f9) {
        float f10;
        int i10 = this.f26966i;
        if (i10 == 0) {
            int i11 = this.f26967j;
            int i12 = org.telegram.ui.ActionBar.g6.Tg;
            if (i11 != org.telegram.ui.ActionBar.g6.w0(null, i12, false) || this.f26968k != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
                this.f26967j = w02;
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ug, false);
                this.f26968k = w03;
                this.f26965g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f26967j;
            int i14 = org.telegram.ui.ActionBar.g6.Vg;
            if (i13 != org.telegram.ui.ActionBar.g6.w0(null, i14, false) || this.f26968k != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
                this.f26967j = w04;
                int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wg, false);
                this.f26968k = w05;
                this.f26965g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f26967j;
            int i16 = org.telegram.ui.ActionBar.g6.f23162ih;
            if (i15 != org.telegram.ui.ActionBar.g6.w0(null, i16, false) || this.f26968k != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181jh, false) || this.f26969l != org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23199kh, false)) {
                int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181jh, false);
                this.f26968k = w06;
                int w07 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23199kh, false);
                this.f26969l = w07;
                int w08 = org.telegram.ui.ActionBar.g6.w0(null, i16, false);
                this.f26967j = w08;
                this.f26965g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.f26963e;
        if (f11 == 0.0f || this.f26964f >= f11) {
            this.f26963e = Utilities.random.nextInt(700) + 500;
            this.f26964f = 0.0f;
            if (this.f26960a == -1.0f) {
                b();
            }
            this.f26962c = this.f26960a;
            this.d = this.f26961b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f9) + (1.0f * f12) + this.f26964f;
        this.f26964f = f13;
        float f14 = this.f26963e;
        if (f13 > f14) {
            this.f26964f = f14;
        }
        float interpolation = jr.f29801g.getInterpolation(this.f26964f / f14);
        float f15 = dp;
        float f16 = this.f26962c;
        float f17 = ((((this.f26960a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f26961b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f26965g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f26966i;
        if (i10 == 0) {
            this.f26960a = a4.w.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f26961b = a4.w.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f26960a = a4.w.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f26961b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f26960a = u3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f26961b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
