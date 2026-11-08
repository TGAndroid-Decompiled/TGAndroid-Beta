package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class o00 {
    public float f36495c;
    public float d;
    public float f36496e;
    public float f36497f;
    public RadialGradient f36498g;
    public final int f36499i;
    public int f36500j;
    public int f36501k;
    public int f36502l;
    public float f36493a = -1.0f;
    public float f36494b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f36503m = org.telegram.ui.ActionBar.k6.Lh;
    public final int f36504n = org.telegram.ui.ActionBar.k6.Mh;
    public final int f36505o = org.telegram.ui.ActionBar.k6.Nh;
    public final int f36506p = org.telegram.ui.ActionBar.k6.Oh;
    public final int f36507q = org.telegram.ui.ActionBar.k6.Wh;
    public final int f36508r = org.telegram.ui.ActionBar.k6.Xh;
    public final int f36509s = org.telegram.ui.ActionBar.k6.Yh;

    public o00(int i7) {
        this.f36499i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f36499i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f36503m, false);
            this.f36500j = x02;
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, this.f36504n, false);
            this.f36501k = x03;
            this.f36498g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, this.f36505o, false);
            this.f36500j = x04;
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, this.f36506p, false);
            this.f36501k = x05;
            this.f36498g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.k6.x0(null, this.f36507q, false);
            this.f36500j = x06;
            int x07 = org.telegram.ui.ActionBar.k6.x0(null, this.f36509s, false);
            this.f36502l = x07;
            int x08 = org.telegram.ui.ActionBar.k6.x0(null, this.f36508r, false);
            this.f36501k = x08;
            this.f36498g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f36499i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ph, false));
        } else if (!org.telegram.messenger.sc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f36500j, this.f36501k), this.f36502l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f36500j, this.f36501k));
            }
        } else {
            paint.setShader(this.f36498g);
        }
    }
}
