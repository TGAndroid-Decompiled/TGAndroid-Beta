package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class b40 {
    public float f45573c;
    public float d;
    public float f45574e;
    public float f45575f;
    public Shader f45576g;
    public final int f45577i;
    public float f45571a = -1.0f;
    public float f45572b = -1.0f;
    public final Matrix h = new Matrix();

    public b40(int i7) {
        this.f45577i = i7;
    }

    public final void a() {
        int i7 = this.f45577i;
        if (c40.s1(i7)) {
            this.f45571a = a8.p0.f(Utilities.f22414b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f45572b = 1.0f;
        } else if (i7 == 1) {
            SecureRandom secureRandom = Utilities.f22414b;
            this.f45571a = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f45572b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f22414b;
            this.f45571a = com.google.android.gms.internal.vision.e2.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f45572b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i7, int i10, int i11, long j3, float f10) {
        float f11;
        if (this.f45576g == null) {
            return;
        }
        float f12 = this.f45574e;
        if (f12 == 0.0f || this.f45575f >= f12) {
            this.f45574e = Utilities.f22414b.nextInt(200) + 1500;
            this.f45575f = 0.0f;
            if (this.f45571a == -1.0f) {
                a();
            }
            this.f45573c = this.f45571a;
            this.d = this.f45572b;
            a();
        }
        float f13 = (float) j3;
        float f14 = 1.0f;
        float f15 = (f13 * 0.02f * f10) + (f13 * 1.0f) + this.f45575f;
        this.f45575f = f15;
        float f16 = this.f45574e;
        if (f15 > f16) {
            this.f45575f = f16;
        }
        float interpolation = org.telegram.ui.Components.er.f34420g.getInterpolation(this.f45575f / f16);
        float f17 = i11;
        float f18 = this.f45573c;
        float f19 = (((((this.f45571a - f18) * interpolation) + f18) * f17) + i10) - 200.0f;
        float f20 = this.d;
        float f21 = (((((this.f45572b - f20) * interpolation) + f20) * f17) + i7) - 200.0f;
        int i12 = this.f45577i;
        if (!c40.s1(i12)) {
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
        this.f45576g.setLocalMatrix(matrix);
    }
}
