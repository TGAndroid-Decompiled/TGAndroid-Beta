package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class r00 {
    public float f38802c;
    public float d;
    public float f38803e;
    public float f38804f;
    public RadialGradient f38805g;
    public final int f38806i;
    public int f38807j;
    public int f38808k;
    public int f38809l;
    public float f38800a = -1.0f;
    public float f38801b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f38810m = org.telegram.ui.ActionBar.j6.Oh;
    public final int f38811n = org.telegram.ui.ActionBar.j6.Ph;
    public final int f38812o = org.telegram.ui.ActionBar.j6.Qh;
    public final int f38813p = org.telegram.ui.ActionBar.j6.Rh;
    public final int f38814q = org.telegram.ui.ActionBar.j6.Zh;
    public final int f38815r = org.telegram.ui.ActionBar.j6.f28803ai;
    public final int f38816s = org.telegram.ui.ActionBar.j6.f28823bi;

    public r00(int i7) {
        this.f38806i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f38806i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, this.f38810m, false);
            this.f38807j = x02;
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, this.f38811n, false);
            this.f38808k = x03;
            this.f38805g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.j6.x0(null, this.f38812o, false);
            this.f38807j = x04;
            int x05 = org.telegram.ui.ActionBar.j6.x0(null, this.f38813p, false);
            this.f38808k = x05;
            this.f38805g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.j6.x0(null, this.f38814q, false);
            this.f38807j = x06;
            int x07 = org.telegram.ui.ActionBar.j6.x0(null, this.f38816s, false);
            this.f38809l = x07;
            int x08 = org.telegram.ui.ActionBar.j6.x0(null, this.f38815r, false);
            this.f38808k = x08;
            this.f38805g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f38806i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        } else if (!org.telegram.messenger.qc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f38807j, this.f38808k), this.f38809l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f38807j, this.f38808k));
            }
        } else {
            paint.setShader(this.f38805g);
        }
    }
}
