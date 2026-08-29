package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q50 {
    public float f41536c;
    public float d;
    public float f41537e;
    public float f41538f;
    public Shader f41539g;
    public final int f41540i;
    public float f41534a = -1.0f;
    public float f41535b = -1.0f;
    public final Matrix h = new Matrix();

    public q50(int i10) {
        this.f41540i = i10;
    }

    public final void a() {
        int i10 = this.f41540i;
        if (r50.p1(i10)) {
            this.f41534a = a4.w.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f41535b = 1.0f;
        } else if (i10 == 1) {
            this.f41534a = a4.w.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f41535b = a4.w.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f41534a = u3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f41535b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f9) {
        if (this.f41539g == null) {
            return;
        }
        float f10 = this.f41537e;
        if (f10 == 0.0f || this.f41538f >= f10) {
            this.f41537e = Utilities.random.nextInt(200) + 1500;
            this.f41538f = 0.0f;
            if (this.f41534a == -1.0f) {
                a();
            }
            this.f41536c = this.f41534a;
            this.d = this.f41535b;
            a();
        }
        float f11 = (float) j10;
        float f12 = 1.0f;
        float f13 = (f11 * 0.02f * f9) + (f11 * 1.0f) + this.f41538f;
        this.f41538f = f13;
        float f14 = this.f41537e;
        if (f13 > f14) {
            this.f41538f = f14;
        }
        float interpolation = org.telegram.ui.Components.jr.f29801g.getInterpolation(this.f41538f / f14);
        float f15 = i12;
        float f16 = this.f41536c;
        float f17 = (((((this.f41534a - f16) * interpolation) + f16) * f15) + i11) - 200.0f;
        float f18 = this.d;
        float f19 = (((((this.f41535b - f18) * interpolation) + f18) * f15) + i10) - 200.0f;
        int i13 = this.f41540i;
        if (!r50.p1(i13)) {
            if (i13 == 1) {
                f12 = 4.0f;
            } else {
                f12 = 2.5f;
            }
        }
        float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * f12;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f17, f19);
        matrix.postScale(dp, dp, f17 + 200.0f, f19 + 200.0f);
        this.f41539g.setLocalMatrix(matrix);
    }
}
