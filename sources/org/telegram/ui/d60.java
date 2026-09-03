package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class d60 {
    public float f33336c;
    public float d;
    public float e;
    public float f33337f;
    public Shader f33338g;
    public final int f33339i;
    public float f33334a = -1.0f;
    public float f33335b = -1.0f;
    public final Matrix h = new Matrix();

    public d60(int i10) {
        this.f33339i = i10;
    }

    public final void a() {
        int i10 = this.f33339i;
        if (e60.p1(i10)) {
            this.f33334a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f33335b = 1.0f;
        } else if (i10 == 1) {
            this.f33334a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f33335b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f33334a = vh.w2.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f33335b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f10) {
        if (this.f33338g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f33337f >= f11) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f33337f = 0.0f;
            if (this.f33334a == -1.0f) {
                a();
            }
            this.f33336c = this.f33334a;
            this.d = this.f33335b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f33337f;
        this.f33337f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f33337f = f15;
        }
        float interpolation = org.telegram.ui.Components.mr.f27123g.getInterpolation(this.f33337f / f15);
        float f16 = i12;
        float f17 = this.f33336c;
        float f18 = (((((this.f33334a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f33335b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f33339i;
        if (!e60.p1(i13)) {
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
        this.f33338g.setLocalMatrix(matrix);
    }
}
