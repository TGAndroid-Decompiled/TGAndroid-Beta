package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f30 {
    public float f24059c;
    public float d;
    public float e;
    public float f24060f;
    public RadialGradient f24061g;
    public final int f24062i;
    public int f24063j;
    public int f24064k;
    public int f24065l;
    public float f24057a = -1.0f;
    public float f24058b = -1.0f;
    public final Matrix h = new Matrix();

    public f30(int i10) {
        this.f24062i = i10;
    }

    public final void a(float f7) {
        float f10;
        int i10 = this.f24062i;
        if (i10 == 0) {
            int i11 = this.f24063j;
            int i12 = org.telegram.ui.ActionBar.h6.Tg;
            if (i11 != org.telegram.ui.ActionBar.h6.w0(null, i12, false) || this.f24064k != org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
                this.f24063j = w02;
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ug, false);
                this.f24064k = w03;
                this.f24061g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.f24063j;
            int i14 = org.telegram.ui.ActionBar.h6.Vg;
            if (i13 != org.telegram.ui.ActionBar.h6.w0(null, i14, false) || this.f24064k != org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.h6.w0(null, i14, false);
                this.f24063j = w04;
                int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wg, false);
                this.f24064k = w05;
                this.f24061g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 3) {
            int i15 = this.f24063j;
            int i16 = org.telegram.ui.ActionBar.h6.f19159ih;
            if (i15 != org.telegram.ui.ActionBar.h6.w0(null, i16, false) || this.f24064k != org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19178jh, false) || this.f24065l != org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19198kh, false)) {
                int w06 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19178jh, false);
                this.f24064k = w06;
                int w07 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19198kh, false);
                this.f24065l = w07;
                int w08 = org.telegram.ui.ActionBar.h6.w0(null, i16, false);
                this.f24063j = w08;
                this.f24061g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f24060f >= f11) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f24060f = 0.0f;
            if (this.f24057a == -1.0f) {
                b();
            }
            this.f24059c = this.f24057a;
            this.d = this.f24058b;
            b();
        }
        float f12 = (float) 16;
        float f13 = (f12 * 0.02f * f7) + (1.0f * f12) + this.f24060f;
        this.f24060f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f24060f = f14;
        }
        float interpolation = rr.f28032g.getInterpolation(this.f24060f / f14);
        float f15 = dp;
        float f16 = this.f24059c;
        float f17 = ((((this.f24057a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.f24058b - f18) * interpolation) + f18) * f15) - 200.0f;
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
        this.f24061g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.f24062i;
        if (i10 == 0) {
            this.f24057a = a4.a.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f24058b = a4.a.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.f24057a = a4.a.B(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f24058b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.f24057a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f24058b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
