package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j60 {
    public float f34785c;
    public float d;
    public float e;
    public float f34786f;
    public Shader f34787g;
    public final int f34788i;
    public float f34783a = -1.0f;
    public float f34784b = -1.0f;
    public final Matrix h = new Matrix();

    public j60(int i10) {
        this.f34788i = i10;
    }

    public final void a() {
        int i10 = this.f34788i;
        if (k60.p1(i10)) {
            this.f34783a = a4.a.A(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f34784b = 1.0f;
        } else if (i10 == 1) {
            this.f34783a = a4.a.A(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f34784b = a4.a.A(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f34783a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f34784b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j3, float f7) {
        if (this.f34787g == null) {
            return;
        }
        float f10 = this.e;
        if (f10 == 0.0f || this.f34786f >= f10) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f34786f = 0.0f;
            if (this.f34783a == -1.0f) {
                a();
            }
            this.f34785c = this.f34783a;
            this.d = this.f34784b;
            a();
        }
        float f11 = (float) j3;
        float f12 = 1.0f;
        float f13 = (f11 * 0.02f * f7) + (f11 * 1.0f) + this.f34786f;
        this.f34786f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f34786f = f14;
        }
        float interpolation = org.telegram.ui.Components.qr.f27384g.getInterpolation(this.f34786f / f14);
        float f15 = i12;
        float f16 = this.f34785c;
        float f17 = (((((this.f34783a - f16) * interpolation) + f16) * f15) + i11) - 200.0f;
        float f18 = this.d;
        float f19 = (((((this.f34784b - f18) * interpolation) + f18) * f15) + i10) - 200.0f;
        int i13 = this.f34788i;
        if (!k60.p1(i13)) {
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
        this.f34787g.setLocalMatrix(matrix);
    }
}
