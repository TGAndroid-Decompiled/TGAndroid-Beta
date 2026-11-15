package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class x10 {
    public float f41506c;
    public float d;
    public float f41507e;
    public float f41508f;
    public RadialGradient f41509g;
    public final int f41510i;
    public int f41511j;
    public int f41512k;
    public int f41513l;
    public float f41504a = -1.0f;
    public float f41505b = -1.0f;
    public final Matrix h = new Matrix();

    public x10(int i7) {
        this.f41510i = i7;
    }

    public final void a(float f10) {
        float f11;
        int i7 = this.f41510i;
        if (i7 == 0) {
            int i10 = this.f41511j;
            int i11 = org.telegram.ui.ActionBar.j6.Kh;
            if (i10 != org.telegram.ui.ActionBar.j6.x0(null, i11, false) || this.f41512k != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Lh, false)) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
                this.f41511j = x02;
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Lh, false);
                this.f41512k = x03;
                this.f41509g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 1) {
            int i12 = this.f41511j;
            int i13 = org.telegram.ui.ActionBar.j6.Mh;
            if (i12 != org.telegram.ui.ActionBar.j6.x0(null, i13, false) || this.f41512k != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Nh, false)) {
                int x04 = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
                this.f41511j = x04;
                int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Nh, false);
                this.f41512k = x05;
                this.f41509g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 3) {
            int i14 = this.f41511j;
            int i15 = org.telegram.ui.ActionBar.j6.Zh;
            if (i14 != org.telegram.ui.ActionBar.j6.x0(null, i15, false) || this.f41512k != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28803ai, false) || this.f41513l != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28823bi, false)) {
                int x06 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28803ai, false);
                this.f41512k = x06;
                int x07 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28823bi, false);
                this.f41513l = x07;
                int x08 = org.telegram.ui.ActionBar.j6.x0(null, i15, false);
                this.f41511j = x08;
                this.f41509g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f12 = this.f41507e;
        if (f12 == 0.0f || this.f41508f >= f12) {
            this.f41507e = Utilities.f22414b.nextInt(700) + 500;
            this.f41508f = 0.0f;
            if (this.f41504a == -1.0f) {
                b();
            }
            this.f41506c = this.f41504a;
            this.d = this.f41505b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f41508f;
        this.f41508f = f14;
        float f15 = this.f41507e;
        if (f14 > f15) {
            this.f41508f = f15;
        }
        float interpolation = er.f34420g.getInterpolation(this.f41508f / f15);
        float f16 = L;
        float f17 = this.f41506c;
        float f18 = ((((this.f41504a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f41505b - f19) * interpolation) + f19) * f16) - 200.0f;
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
        this.f41509g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i7 = this.f41510i;
        if (i7 == 0) {
            SecureRandom secureRandom = Utilities.f22414b;
            this.f41504a = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f41505b = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i7 == 3) {
            SecureRandom secureRandom2 = Utilities.f22414b;
            this.f41504a = a8.p0.f(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f41505b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f22414b;
            this.f41504a = com.google.android.gms.internal.vision.e2.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f41505b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
