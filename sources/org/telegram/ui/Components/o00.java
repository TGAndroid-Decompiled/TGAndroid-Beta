package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class o00 {
    public float f36578c;
    public float d;
    public float f36579e;
    public float f36580f;
    public RadialGradient f36581g;
    public final int f36582i;
    public int f36583j;
    public int f36584k;
    public int f36585l;
    public float f36576a = -1.0f;
    public float f36577b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f36586m = org.telegram.ui.ActionBar.l6.Lh;
    public final int f36587n = org.telegram.ui.ActionBar.l6.Mh;
    public final int f36588o = org.telegram.ui.ActionBar.l6.Nh;
    public final int f36589p = org.telegram.ui.ActionBar.l6.Oh;
    public final int f36590q = org.telegram.ui.ActionBar.l6.Wh;
    public final int f36591r = org.telegram.ui.ActionBar.l6.Xh;
    public final int f36592s = org.telegram.ui.ActionBar.l6.Yh;

    public o00(int i7) {
        this.f36582i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f36582i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, this.f36586m, false);
            this.f36583j = x02;
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, this.f36587n, false);
            this.f36584k = x03;
            this.f36581g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.l6.x0(null, this.f36588o, false);
            this.f36583j = x04;
            int x05 = org.telegram.ui.ActionBar.l6.x0(null, this.f36589p, false);
            this.f36584k = x05;
            this.f36581g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.l6.x0(null, this.f36590q, false);
            this.f36583j = x06;
            int x07 = org.telegram.ui.ActionBar.l6.x0(null, this.f36592s, false);
            this.f36585l = x07;
            int x08 = org.telegram.ui.ActionBar.l6.x0(null, this.f36591r, false);
            this.f36584k = x08;
            this.f36581g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f36582i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ph, false));
        } else if (!org.telegram.messenger.sc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f36583j, this.f36584k), this.f36585l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f36583j, this.f36584k));
            }
        } else {
            paint.setShader(this.f36581g);
        }
    }
}
