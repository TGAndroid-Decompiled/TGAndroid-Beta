package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n50 {
    public float f40594c;
    public float d;
    public float f40595e;
    public float f40596f;
    public Shader f40597g;
    public final int f40598i;
    public float f40592a = -1.0f;
    public float f40593b = -1.0f;
    public final Matrix h = new Matrix();

    public n50(int i9) {
        this.f40598i = i9;
    }

    public final void a() {
        int i9 = this.f40598i;
        if (o50.p1(i9)) {
            this.f40592a = aa.d.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f40593b = 1.0f;
        } else if (i9 == 1) {
            this.f40592a = aa.d.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f40593b = aa.d.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f40592a = org.telegram.ui.Cells.j2.b(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f40593b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i9, int i10, int i11, long j10, float f10) {
        if (this.f40597g == null) {
            return;
        }
        float f11 = this.f40595e;
        if (f11 == 0.0f || this.f40596f >= f11) {
            this.f40595e = Utilities.random.nextInt(200) + 1500;
            this.f40596f = 0.0f;
            if (this.f40592a == -1.0f) {
                a();
            }
            this.f40594c = this.f40592a;
            this.d = this.f40593b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f40596f;
        this.f40596f = f14;
        float f15 = this.f40595e;
        if (f14 > f15) {
            this.f40596f = f15;
        }
        float interpolation = org.telegram.ui.Components.gr.f28845g.getInterpolation(this.f40596f / f15);
        float f16 = i11;
        float f17 = this.f40594c;
        float f18 = (((((this.f40592a - f17) * interpolation) + f17) * f16) + i10) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f40593b - f19) * interpolation) + f19) * f16) + i9) - 200.0f;
        int i12 = this.f40598i;
        if (!o50.p1(i12)) {
            if (i12 == 1) {
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
        this.f40597g.setLocalMatrix(matrix);
    }
}
