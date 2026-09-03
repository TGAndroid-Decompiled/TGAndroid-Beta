package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c60 {
    public float f35700c;
    public float d;
    public float f35701e;
    public float f35702f;
    public Shader f35703g;
    public final int f35704i;
    public float f35698a = -1.0f;
    public float f35699b = -1.0f;
    public final Matrix h = new Matrix();

    public c60(int i10) {
        this.f35704i = i10;
    }

    public final void a() {
        int i10 = this.f35704i;
        if (d60.p1(i10)) {
            this.f35698a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f35699b = 1.0f;
        } else if (i10 == 1) {
            this.f35698a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f35699b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f35698a = w.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f35699b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f10) {
        if (this.f35703g == null) {
            return;
        }
        float f11 = this.f35701e;
        if (f11 == 0.0f || this.f35702f >= f11) {
            this.f35701e = Utilities.random.nextInt(200) + 1500;
            this.f35702f = 0.0f;
            if (this.f35698a == -1.0f) {
                a();
            }
            this.f35700c = this.f35698a;
            this.d = this.f35699b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f35702f;
        this.f35702f = f14;
        float f15 = this.f35701e;
        if (f14 > f15) {
            this.f35702f = f15;
        }
        float interpolation = org.telegram.ui.Components.pr.f30169g.getInterpolation(this.f35702f / f15);
        float f16 = i12;
        float f17 = this.f35700c;
        float f18 = (((((this.f35698a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f35699b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f35704i;
        if (!d60.p1(i13)) {
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
        this.f35703g.setLocalMatrix(matrix);
    }
}
