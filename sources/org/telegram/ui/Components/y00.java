package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class y00 {
    public float f42226c;
    public float d;
    public float f42227e;
    public float f42228f;
    public RadialGradient f42229g;
    public final int f42230i;
    public int f42231j;
    public int f42232k;
    public int f42233l;
    public float f42224a = -1.0f;
    public float f42225b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f42234m = org.telegram.ui.ActionBar.n6.Oh;
    public final int f42235n = org.telegram.ui.ActionBar.n6.Ph;
    public final int f42236o = org.telegram.ui.ActionBar.n6.Qh;
    public final int f42237p = org.telegram.ui.ActionBar.n6.Rh;
    public final int f42238q = org.telegram.ui.ActionBar.n6.Zh;
    public final int f42239r = org.telegram.ui.ActionBar.n6.f29350ai;
    public final int f42240s = org.telegram.ui.ActionBar.n6.f29370bi;

    public y00(int i7) {
        this.f42230i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f42230i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, this.f42234m, false);
            this.f42231j = x02;
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, this.f42235n, false);
            this.f42232k = x03;
            this.f42229g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.n6.x0(null, this.f42236o, false);
            this.f42231j = x04;
            int x05 = org.telegram.ui.ActionBar.n6.x0(null, this.f42237p, false);
            this.f42232k = x05;
            this.f42229g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.n6.x0(null, this.f42238q, false);
            this.f42231j = x06;
            int x07 = org.telegram.ui.ActionBar.n6.x0(null, this.f42240s, false);
            this.f42233l = x07;
            int x08 = org.telegram.ui.ActionBar.n6.x0(null, this.f42239r, false);
            this.f42232k = x08;
            this.f42229g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f42230i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Sh, false));
        } else if (!org.telegram.messenger.pc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f42231j, this.f42232k), this.f42233l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f42231j, this.f42232k));
            }
        } else {
            paint.setShader(this.f42229g);
        }
    }
}
