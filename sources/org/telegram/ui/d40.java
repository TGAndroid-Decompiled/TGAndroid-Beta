package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class d40 {
    public float f46947c;
    public float d;
    public float f46948e;
    public float f46949f;
    public Shader f46950g;
    public final int f46951i;
    public float f46945a = -1.0f;
    public float f46946b = -1.0f;
    public final Matrix h = new Matrix();

    public d40(int i7) {
        this.f46951i = i7;
    }

    public final void a() {
        int i7 = this.f46951i;
        if (e40.t1(i7)) {
            this.f46945a = a8.p0.f(Utilities.f22875b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f46946b = 1.0f;
        } else if (i7 == 1) {
            SecureRandom secureRandom = Utilities.f22875b;
            this.f46945a = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f46946b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f22875b;
            this.f46945a = com.google.android.gms.internal.vision.e2.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f46946b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i7, int i10, int i11, long j3, float f10) {
        float f11;
        if (this.f46950g == null) {
            return;
        }
        float f12 = this.f46948e;
        if (f12 == 0.0f || this.f46949f >= f12) {
            this.f46948e = Utilities.f22875b.nextInt(200) + 1500;
            this.f46949f = 0.0f;
            if (this.f46945a == -1.0f) {
                a();
            }
            this.f46947c = this.f46945a;
            this.d = this.f46946b;
            a();
        }
        float f13 = (float) j3;
        float f14 = 1.0f;
        float f15 = (f13 * 0.02f * f10) + (f13 * 1.0f) + this.f46949f;
        this.f46949f = f15;
        float f16 = this.f46948e;
        if (f15 > f16) {
            this.f46949f = f16;
        }
        float interpolation = org.telegram.ui.Components.kr.f36859g.getInterpolation(this.f46949f / f16);
        float f17 = i11;
        float f18 = this.f46947c;
        float f19 = (((((this.f46945a - f18) * interpolation) + f18) * f17) + i10) - 200.0f;
        float f20 = this.d;
        float f21 = (((((this.f46946b - f20) * interpolation) + f20) * f17) + i7) - 200.0f;
        int i12 = this.f46951i;
        if (!e40.t1(i12)) {
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
        this.f46950g.setLocalMatrix(matrix);
    }
}
