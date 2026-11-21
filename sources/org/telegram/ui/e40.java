package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class e40 {
    public float f47132c;
    public float d;
    public float f47133e;
    public float f47134f;
    public Shader f47135g;
    public final int f47136i;
    public float f47130a = -1.0f;
    public float f47131b = -1.0f;
    public final Matrix h = new Matrix();

    public e40(int i7) {
        this.f47136i = i7;
    }

    public final void a() {
        int i7 = this.f47136i;
        if (f40.t1(i7)) {
            this.f47130a = a8.p0.f(Utilities.f22805b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f47131b = 1.0f;
        } else if (i7 == 1) {
            SecureRandom secureRandom = Utilities.f22805b;
            this.f47130a = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f47131b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f22805b;
            this.f47130a = com.google.android.gms.internal.vision.e2.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f47131b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i7, int i10, int i11, long j3, float f10) {
        float f11;
        if (this.f47135g == null) {
            return;
        }
        float f12 = this.f47133e;
        if (f12 == 0.0f || this.f47134f >= f12) {
            this.f47133e = Utilities.f22805b.nextInt(200) + 1500;
            this.f47134f = 0.0f;
            if (this.f47130a == -1.0f) {
                a();
            }
            this.f47132c = this.f47130a;
            this.d = this.f47131b;
            a();
        }
        float f13 = (float) j3;
        float f14 = 1.0f;
        float f15 = (f13 * 0.02f * f10) + (f13 * 1.0f) + this.f47134f;
        this.f47134f = f15;
        float f16 = this.f47133e;
        if (f15 > f16) {
            this.f47134f = f16;
        }
        float interpolation = org.telegram.ui.Components.nr.f37957g.getInterpolation(this.f47134f / f16);
        float f17 = i11;
        float f18 = this.f47132c;
        float f19 = (((((this.f47130a - f18) * interpolation) + f18) * f17) + i10) - 200.0f;
        float f20 = this.d;
        float f21 = (((((this.f47131b - f20) * interpolation) + f20) * f17) + i7) - 200.0f;
        int i12 = this.f47136i;
        if (!f40.t1(i12)) {
            if (i12 == 1) {
                f11 = 4.0f;
            } else {
                f11 = 2.5f;
            }
            f14 = f11;
        }
        float L = (org.telegram.messenger.g0.L(122.0f) / 400.0f) * f14;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f19, f21);
        matrix.postScale(L, L, f19 + 200.0f, f21 + 200.0f);
        this.f47135g.setLocalMatrix(matrix);
    }
}
