package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class c10 {
    public float f24934c;
    public float d;
    public float e;
    public float f24935f;
    public RadialGradient f24936g;
    public final int f24937i;
    public int f24938j;
    public int f24939k;
    public int f24940l;
    public float f24932a = -1.0f;
    public float f24933b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f24941m = org.telegram.ui.ActionBar.t6.Lh;
    public final int f24942n = org.telegram.ui.ActionBar.t6.Mh;
    public final int f24943o = org.telegram.ui.ActionBar.t6.Nh;
    public final int f24944p = org.telegram.ui.ActionBar.t6.Oh;
    public final int f24945q = org.telegram.ui.ActionBar.t6.Wh;
    public final int f24946r = org.telegram.ui.ActionBar.t6.Xh;
    public final int f24947s = org.telegram.ui.ActionBar.t6.Yh;

    public c10(int i10) {
        this.f24937i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f24937i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.f24941m, false);
            this.f24938j = x02;
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, this.f24942n, false);
            this.f24939k = x03;
            this.f24936g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.t6.x0(null, this.f24943o, false);
            this.f24938j = x04;
            int x05 = org.telegram.ui.ActionBar.t6.x0(null, this.f24944p, false);
            this.f24939k = x05;
            this.f24936g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.t6.x0(null, this.f24945q, false);
            this.f24938j = x06;
            int x07 = org.telegram.ui.ActionBar.t6.x0(null, this.f24947s, false);
            this.f24940l = x07;
            int x08 = org.telegram.ui.ActionBar.t6.x0(null, this.f24946r, false);
            this.f24939k = x08;
            this.f24936g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f24937i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ph, false));
        } else if (!org.telegram.messenger.sc.e(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.b.f(0.5f, i0.b.f(0.5f, this.f24938j, this.f24939k), this.f24940l));
            } else {
                paint.setColor(i0.b.f(0.5f, this.f24938j, this.f24939k));
            }
        } else {
            paint.setShader(this.f24936g);
        }
    }
}
