package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class n00 {
    public float f36108c;
    public float d;
    public float f36109e;
    public float f36110f;
    public RadialGradient f36111g;
    public final int f36112i;
    public int f36113j;
    public int f36114k;
    public int f36115l;
    public float f36106a = -1.0f;
    public float f36107b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f36116m = org.telegram.ui.ActionBar.k6.Lh;
    public final int f36117n = org.telegram.ui.ActionBar.k6.Mh;
    public final int f36118o = org.telegram.ui.ActionBar.k6.Nh;
    public final int f36119p = org.telegram.ui.ActionBar.k6.Oh;
    public final int f36120q = org.telegram.ui.ActionBar.k6.Wh;
    public final int f36121r = org.telegram.ui.ActionBar.k6.Xh;
    public final int f36122s = org.telegram.ui.ActionBar.k6.Yh;

    public n00(int i7) {
        this.f36112i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f36112i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f36116m, false);
            this.f36113j = x02;
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, this.f36117n, false);
            this.f36114k = x03;
            this.f36111g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, this.f36118o, false);
            this.f36113j = x04;
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, this.f36119p, false);
            this.f36114k = x05;
            this.f36111g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.k6.x0(null, this.f36120q, false);
            this.f36113j = x06;
            int x07 = org.telegram.ui.ActionBar.k6.x0(null, this.f36122s, false);
            this.f36115l = x07;
            int x08 = org.telegram.ui.ActionBar.k6.x0(null, this.f36121r, false);
            this.f36114k = x08;
            this.f36111g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f36112i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ph, false));
        } else if (!org.telegram.messenger.rc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f36113j, this.f36114k), this.f36115l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f36113j, this.f36114k));
            }
        } else {
            paint.setShader(this.f36111g);
        }
    }
}
