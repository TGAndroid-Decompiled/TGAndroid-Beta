package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m60 {
    public float f37918c;
    public float d;
    public float e;
    public float f37919f;
    public Shader f37920g;
    public final int f37921i;
    public float f37916a = -1.0f;
    public float f37917b = -1.0f;
    public final Matrix h = new Matrix();

    public m60(int i10) {
        this.f37921i = i10;
    }

    public final void a() {
        int i10 = this.f37921i;
        if (n60.q1(i10)) {
            this.f37916a = a1.g.B(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f37917b = 1.0f;
        } else if (i10 == 1) {
            this.f37916a = a1.g.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f37917b = a1.g.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f37916a = a1.g.d(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f37917b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f7) {
        float f10;
        if (this.f37920g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f37919f >= f11) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f37919f = 0.0f;
            if (this.f37916a == -1.0f) {
                a();
            }
            this.f37918c = this.f37916a;
            this.d = this.f37917b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f7) + (f12 * 1.0f) + this.f37919f;
        this.f37919f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f37919f = f15;
        }
        float interpolation = org.telegram.ui.Components.es.f24466g.getInterpolation(this.f37919f / f15);
        float f16 = i12;
        float f17 = this.f37918c;
        float f18 = (((((this.f37916a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f37917b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f37921i;
        if (!n60.q1(i13)) {
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
        this.f37920g.setLocalMatrix(matrix);
    }
}
