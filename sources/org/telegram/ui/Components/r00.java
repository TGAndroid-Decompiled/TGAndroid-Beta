package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class r00 {
    public float f38800c;
    public float d;
    public float f38801e;
    public float f38802f;
    public RadialGradient f38803g;
    public final int f38804i;
    public int f38805j;
    public int f38806k;
    public int f38807l;
    public float f38798a = -1.0f;
    public float f38799b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f38808m = org.telegram.ui.ActionBar.j6.Oh;
    public final int f38809n = org.telegram.ui.ActionBar.j6.Ph;
    public final int f38810o = org.telegram.ui.ActionBar.j6.Qh;
    public final int f38811p = org.telegram.ui.ActionBar.j6.Rh;
    public final int f38812q = org.telegram.ui.ActionBar.j6.Zh;
    public final int f38813r = org.telegram.ui.ActionBar.j6.f28803ai;
    public final int f38814s = org.telegram.ui.ActionBar.j6.f28823bi;

    public r00(int i7) {
        this.f38804i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f38804i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, this.f38808m, false);
            this.f38805j = x02;
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, this.f38809n, false);
            this.f38806k = x03;
            this.f38803g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.j6.x0(null, this.f38810o, false);
            this.f38805j = x04;
            int x05 = org.telegram.ui.ActionBar.j6.x0(null, this.f38811p, false);
            this.f38806k = x05;
            this.f38803g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.j6.x0(null, this.f38812q, false);
            this.f38805j = x06;
            int x07 = org.telegram.ui.ActionBar.j6.x0(null, this.f38814s, false);
            this.f38807l = x07;
            int x08 = org.telegram.ui.ActionBar.j6.x0(null, this.f38813r, false);
            this.f38806k = x08;
            this.f38803g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f38804i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        } else if (!org.telegram.messenger.qc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f38805j, this.f38806k), this.f38807l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f38805j, this.f38806k));
            }
        } else {
            paint.setShader(this.f38803g);
        }
    }
}
