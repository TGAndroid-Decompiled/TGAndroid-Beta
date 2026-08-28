package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o20 {
    public float f31267c;
    public float d;
    public float f31268e;
    public float f31269f;
    public RadialGradient f31270g;
    public final int f31271i;
    public int f31272j;
    public int f31273k;
    public int f31274l;
    public float f31265a = -1.0f;
    public float f31266b = -1.0f;
    public final Matrix h = new Matrix();

    public o20(int i9) {
        this.f31271i = i9;
    }

    public final void a(float f10) {
        float f11;
        int i9 = this.f31271i;
        if (i9 == 0) {
            int i10 = this.f31272j;
            int i11 = org.telegram.ui.ActionBar.f6.Tg;
            if (i10 != org.telegram.ui.ActionBar.f6.w0(null, i11, false) || this.f31273k != org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
                this.f31272j = w02;
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ug, false);
                this.f31273k = w03;
                this.f31270g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i9 == 1) {
            int i12 = this.f31272j;
            int i13 = org.telegram.ui.ActionBar.f6.Vg;
            if (i12 != org.telegram.ui.ActionBar.f6.w0(null, i13, false) || this.f31273k != org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.f6.w0(null, i13, false);
                this.f31272j = w04;
                int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Wg, false);
                this.f31273k = w05;
                this.f31270g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i9 == 3) {
            int i14 = this.f31272j;
            int i15 = org.telegram.ui.ActionBar.f6.f23101ih;
            if (i14 != org.telegram.ui.ActionBar.f6.w0(null, i15, false) || this.f31273k != org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23119jh, false) || this.f31274l != org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23137kh, false)) {
                int w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23119jh, false);
                this.f31273k = w06;
                int w07 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23137kh, false);
                this.f31274l = w07;
                int w08 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
                this.f31272j = w08;
                this.f31270g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f12 = this.f31268e;
        if (f12 == 0.0f || this.f31269f >= f12) {
            this.f31268e = Utilities.random.nextInt(700) + 500;
            this.f31269f = 0.0f;
            if (this.f31265a == -1.0f) {
                b();
            }
            this.f31267c = this.f31265a;
            this.d = this.f31266b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f31269f;
        this.f31269f = f14;
        float f15 = this.f31268e;
        if (f14 > f15) {
            this.f31269f = f15;
        }
        float interpolation = gr.f28845g.getInterpolation(this.f31269f / f15);
        float f16 = dp;
        float f17 = this.f31267c;
        float f18 = ((((this.f31265a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f31266b - f19) * interpolation) + f19) * f16) - 200.0f;
        if (i9 == 3) {
            f11 = 2.0f;
        } else {
            f11 = 1.5f;
        }
        float f21 = (f16 / 400.0f) * f11;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(f21, f21, f18 + 200.0f, f20 + 200.0f);
        this.f31270g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i9 = this.f31271i;
        if (i9 == 0) {
            this.f31265a = aa.d.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f31266b = aa.d.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i9 == 3) {
            this.f31265a = aa.d.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f31266b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f31265a = org.telegram.ui.Cells.j2.b(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f31266b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
