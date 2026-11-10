package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class e40 {
    public float f45128c;
    public float d;
    public float f45129e;
    public float f45130f;
    public Shader f45131g;
    public final int f45132i;
    public float f45126a = -1.0f;
    public float f45127b = -1.0f;
    public final Matrix h = new Matrix();

    public e40(int i7) {
        this.f45132i = i7;
    }

    public final void a() {
        int i7 = this.f45132i;
        if (f40.s1(i7)) {
            this.f45126a = a8.p0.f(Utilities.f21339b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f45127b = 1.0f;
        } else if (i7 == 1) {
            SecureRandom secureRandom = Utilities.f21339b;
            this.f45126a = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f45127b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f21339b;
            this.f45126a = com.google.android.recaptcha.internal.a.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f45127b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i7, int i10, int i11, long j3, float f10) {
        float f11;
        if (this.f45131g == null) {
            return;
        }
        float f12 = this.f45129e;
        if (f12 == 0.0f || this.f45130f >= f12) {
            this.f45129e = Utilities.f21339b.nextInt(200) + 1500;
            this.f45130f = 0.0f;
            if (this.f45126a == -1.0f) {
                a();
            }
            this.f45128c = this.f45126a;
            this.d = this.f45127b;
            a();
        }
        float f13 = (float) j3;
        float f14 = 1.0f;
        float f15 = (f13 * 0.02f * f10) + (f13 * 1.0f) + this.f45130f;
        this.f45130f = f15;
        float f16 = this.f45129e;
        if (f15 > f16) {
            this.f45130f = f16;
        }
        float interpolation = org.telegram.ui.Components.wq.f40047g.getInterpolation(this.f45130f / f16);
        float f17 = i11;
        float f18 = this.f45128c;
        float f19 = (((((this.f45126a - f18) * interpolation) + f18) * f17) + i10) - 200.0f;
        float f20 = this.d;
        float f21 = (((((this.f45127b - f20) * interpolation) + f20) * f17) + i7) - 200.0f;
        int i12 = this.f45132i;
        if (!f40.s1(i12)) {
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
        this.f45131g.setLocalMatrix(matrix);
    }
}
