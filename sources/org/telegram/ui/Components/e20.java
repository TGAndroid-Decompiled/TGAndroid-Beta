package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class e20 {
    public float f34577c;
    public float d;
    public float f34578e;
    public float f34579f;
    public RadialGradient f34580g;
    public final int f34581i;
    public int f34582j;
    public int f34583k;
    public int f34584l;
    public float f34575a = -1.0f;
    public float f34576b = -1.0f;
    public final Matrix h = new Matrix();

    public e20(int i7) {
        this.f34581i = i7;
    }

    public final void a(float f10) {
        float f11;
        int i7 = this.f34581i;
        if (i7 == 0) {
            int i10 = this.f34582j;
            int i11 = org.telegram.ui.ActionBar.n6.Kh;
            if (i10 != org.telegram.ui.ActionBar.n6.x0(null, i11, false) || this.f34583k != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Lh, false)) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
                this.f34582j = x02;
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Lh, false);
                this.f34583k = x03;
                this.f34580g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 1) {
            int i12 = this.f34582j;
            int i13 = org.telegram.ui.ActionBar.n6.Mh;
            if (i12 != org.telegram.ui.ActionBar.n6.x0(null, i13, false) || this.f34583k != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Nh, false)) {
                int x04 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                this.f34582j = x04;
                int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Nh, false);
                this.f34583k = x05;
                this.f34580g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i7 == 3) {
            int i14 = this.f34582j;
            int i15 = org.telegram.ui.ActionBar.n6.Zh;
            if (i14 != org.telegram.ui.ActionBar.n6.x0(null, i15, false) || this.f34583k != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29348ai, false) || this.f34584l != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29368bi, false)) {
                int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29348ai, false);
                this.f34583k = x06;
                int x07 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29368bi, false);
                this.f34584l = x07;
                int x08 = org.telegram.ui.ActionBar.n6.x0(null, i15, false);
                this.f34582j = x08;
                this.f34580g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = org.telegram.messenger.g0.L(130.0f);
        float f12 = this.f34578e;
        if (f12 == 0.0f || this.f34579f >= f12) {
            this.f34578e = Utilities.f22777b.nextInt(700) + 500;
            this.f34579f = 0.0f;
            if (this.f34575a == -1.0f) {
                b();
            }
            this.f34577c = this.f34575a;
            this.d = this.f34576b;
            b();
        }
        float f13 = (float) 16;
        float f14 = (f13 * 0.02f * f10) + (1.0f * f13) + this.f34579f;
        this.f34579f = f14;
        float f15 = this.f34578e;
        if (f14 > f15) {
            this.f34579f = f15;
        }
        float interpolation = lr.f37209g.getInterpolation(this.f34579f / f15);
        float f16 = L;
        float f17 = this.f34577c;
        float f18 = ((((this.f34575a - f17) * interpolation) + f17) * f16) - 200.0f;
        float f19 = this.d;
        float f20 = ((((this.f34576b - f19) * interpolation) + f19) * f16) - 200.0f;
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
        this.f34580g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i7 = this.f34581i;
        if (i7 == 0) {
            SecureRandom secureRandom = Utilities.f22777b;
            this.f34575a = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.f34576b = a8.p0.f(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i7 == 3) {
            SecureRandom secureRandom2 = Utilities.f22777b;
            this.f34575a = a8.p0.f(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.f34576b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.f22777b;
            this.f34575a = com.google.android.gms.internal.vision.e2.c(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f34576b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
