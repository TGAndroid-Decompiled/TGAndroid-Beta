package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class f20 {
    public float f34978c;
    public float d;
    public float f34979e;
    public float f34980f;
    public RadialGradient f34981g;
    public final int f34982i;
    public int f34983j;
    public int f34984k;
    public int f34985l;
    public float f34976a = -1.0f;
    public float f34977b = -1.0f;
    public final Matrix h = new Matrix();

    public f20(int i7) {
        this.f34982i = i7;
    }

    public final void a(float f10) {
        float f11;
        int i7 = this.f34982i;
        if (i7 == 0) {
            int i10 = this.f34983j;
            int i11 = org.telegram.ui.ActionBar.n6.Kh;
            if (i10 != org.telegram.ui.ActionBar.n6.x0(null, i11, false) || this.f34984k != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Lh, false)) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
                this.f34983j = x02;
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Lh, false);
                this.f34984k = x03;
                this.f34981g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 1) {
            int i12 = this.f34983j;
            int i13 = org.telegram.ui.ActionBar.n6.Mh;
            if (i12 != org.telegram.ui.ActionBar.n6.x0(null, i13, false) || this.f34984k != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Nh, false)) {
                int x04 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                this.f34983j = x04;
                int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Nh, false);
                this.f34984k = x05;
                this.f34981g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 3) {
            int i14 = this.f34983j;
            int i15 = org.telegram.ui.ActionBar.n6.Zh;
            if (i14 != org.telegram.ui.ActionBar.n6.x0(null, i15, false) || this.f34984k != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29405ai, false) || this.f34985l != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425bi, false)) {
                int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29405ai, false);
                this.f34984k = x06;
                int x07 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425bi, false);
                this.f34985l = x07;
                int x08 = org.telegram.ui.ActionBar.n6.x0(null, i15, false);
                this.f34983j = x08;
                this.f34981g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f12 = this.f34979e;
        if (f12 == 0.0f || this.f34980f >= f12) {
            this.f34979e = Utilities.f22875b.nextInt(700) + 500;
            this.f34980f = 0.0f;
            if (this.f34976a == -1.0f) {
                b();
            }
            this.f34978c = this.f34976a;
            this.d = this.f34977b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f34980f;
        this.f34980f = f14;
        float f15 = this.f34979e;
        if (f14 > f15) {
            this.f34980f = f15;
        }
        float interpolation = kr.f36859g.getInterpolation(this.f34980f / f15);
        float f16 = L;
        float f17 = this.f34978c;
        float f18 = ((((this.f34976a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f34977b - f19) * interpolation) + f19) * f16) - 200.0f;
        if (i7 == 3) {
            f11 = 2.0f;
        } else {
            f11 = 1.5f;
        }
        float f21 = (f16 / 400.0f) * f11;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(f21, f21, f18 + 200.0f, f20 + 200.0f);
        this.f34981g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i7 = this.f34982i;
        if (i7 == 0) {
            SecureRandom secureRandom = Utilities.f22875b;
            this.f34976a = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f34977b = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i7 == 3) {
            SecureRandom secureRandom2 = Utilities.f22875b;
            this.f34976a = a8.p0.f(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f34977b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f22875b;
            this.f34976a = com.google.android.gms.internal.vision.e2.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f34977b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
