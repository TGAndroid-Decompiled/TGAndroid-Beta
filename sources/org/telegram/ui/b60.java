package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b60 {
    public float f32800c;
    public float d;
    public float e;
    public float f32801f;
    public Shader f32802g;
    public final int f32803i;
    public float f32798a = -1.0f;
    public float f32799b = -1.0f;
    public final Matrix h = new Matrix();

    public b60(int i10) {
        this.f32803i = i10;
    }

    public final void a() {
        int i10 = this.f32803i;
        if (c60.p1(i10)) {
            this.f32798a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f32799b = 1.0f;
        } else if (i10 == 1) {
            this.f32798a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f32799b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f32798a = vh.v2.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f32799b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f10) {
        if (this.f32802g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f32801f >= f11) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f32801f = 0.0f;
            if (this.f32798a == -1.0f) {
                a();
            }
            this.f32800c = this.f32798a;
            this.d = this.f32799b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f32801f;
        this.f32801f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f32801f = f15;
        }
        float interpolation = org.telegram.ui.Components.nr.f27347g.getInterpolation(this.f32801f / f15);
        float f16 = i12;
        float f17 = this.f32800c;
        float f18 = (((((this.f32798a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f32799b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f32803i;
        if (!c60.p1(i13)) {
            if (i13 == 1) {
                f13 = 4.0f;
            } else {
                f13 = 2.5f;
            }
        }
        float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(dp, dp, f18 + 200.0f, f20 + 200.0f);
        this.f32802g.setLocalMatrix(matrix);
    }
}
