package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f60 {
    public float f37552c;
    public float d;
    public float f37553e;
    public float f37554f;
    public Shader f37555g;
    public final int f37556i;
    public float f37550a = -1.0f;
    public float f37551b = -1.0f;
    public final Matrix h = new Matrix();

    public f60(int i10) {
        this.f37556i = i10;
    }

    public final void a() {
        int i10 = this.f37556i;
        if (g60.q1(i10)) {
            this.f37550a = a1.g.B(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f37551b = 1.0f;
        } else if (i10 == 1) {
            this.f37550a = a1.g.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f37551b = a1.g.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f37550a = a1.g.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f37551b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j3, float f7) {
        float f10;
        if (this.f37555g == null) {
            return;
        }
        float f11 = this.f37553e;
        if (f11 == 0.0f || this.f37554f >= f11) {
            this.f37553e = Utilities.random.nextInt(200) + 1500;
            this.f37554f = 0.0f;
            if (this.f37550a == -1.0f) {
                a();
            }
            this.f37552c = this.f37550a;
            this.d = this.f37551b;
            a();
        }
        float f12 = (float) j3;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f7) + (f12 * 1.0f) + this.f37554f;
        this.f37554f = f14;
        float f15 = this.f37553e;
        if (f14 > f15) {
            this.f37554f = f15;
        }
        float interpolation = org.telegram.ui.Components.is.f27452g.getInterpolation(this.f37554f / f15);
        float f16 = i12;
        float f17 = this.f37552c;
        float f18 = (((((this.f37550a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f37551b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f37556i;
        if (!g60.q1(i13)) {
            if (i13 == 1) {
                f10 = 4.0f;
            } else {
                f10 = 2.5f;
            }
            f13 = f10;
        }
        float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(dp, dp, f18 + 200.0f, f20 + 200.0f);
        this.f37555g.setLocalMatrix(matrix);
    }
}
