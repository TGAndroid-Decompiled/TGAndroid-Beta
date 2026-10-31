package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class a50 {
    public float f35564c;
    public float d;
    public float e;
    public float f35565f;
    public Shader f35566g;
    public final int f35567i;
    public float f35562a = -1.0f;
    public float f35563b = -1.0f;
    public final Matrix h = new Matrix();

    public a50(int i10) {
        this.f35567i = i10;
    }

    public final void a() {
        int i10 = this.f35567i;
        if (b50.r1(i10)) {
            this.f35562a = a1.g.A(Utilities.f14519b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f35563b = 1.0f;
        } else if (i10 == 1) {
            SecureRandom secureRandom = Utilities.f14519b;
            this.f35562a = a1.g.A(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f35563b = a1.g.A(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f14519b;
            this.f35562a = a1.g.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f35563b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f7) {
        float f10;
        if (this.f35566g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f35565f >= f11) {
            this.e = Utilities.f14519b.nextInt(200) + 1500;
            this.f35565f = 0.0f;
            if (this.f35562a == -1.0f) {
                a();
            }
            this.f35564c = this.f35562a;
            this.d = this.f35563b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f7) + (f12 * 1.0f) + this.f35565f;
        this.f35565f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f35565f = f15;
        }
        float interpolation = org.telegram.ui.Components.gr.f26496g.getInterpolation(this.f35565f / f15);
        float f16 = i12;
        float f17 = this.f35564c;
        float f18 = (((((this.f35562a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f35563b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f35567i;
        if (!b50.r1(i13)) {
            if (i13 == 1) {
                f10 = 4.0f;
            } else {
                f10 = 2.5f;
            }
            f13 = f10;
        }
        float L = (org.telegram.messenger.i0.L(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(L, L, f18 + 200.0f, f20 + 200.0f);
        this.f35566g.setLocalMatrix(matrix);
    }
}
