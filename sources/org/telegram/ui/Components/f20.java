package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26076c;
    public float d;
    public float e;
    public float f26077f;
    public RadialGradient f26078g;
    public final int f26079i;
    public int f26080j;
    public int f26081k;
    public int f26082l;
    public float f26074a = -1.0f;
    public float f26075b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26083m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f26084n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f26085o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f26086p = org.telegram.ui.ActionBar.h6.f20941ah;
    public final int f26087q = org.telegram.ui.ActionBar.h6.f21087ih;
    public final int f26088r = org.telegram.ui.ActionBar.h6.f21107jh;
    public final int f26089s = org.telegram.ui.ActionBar.h6.f21126kh;

    public f20(int i10) {
        this.f26079i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26079i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f26083m, false);
            this.f26080j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f26084n, false);
            this.f26081k = x03;
            this.f26078g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f26085o, false);
            this.f26080j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f26086p, false);
            this.f26081k = x05;
            this.f26078g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f26087q, false);
            this.f26080j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f26089s, false);
            this.f26082l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f26088r, false);
            this.f26081k = x08;
            this.f26078g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26079i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20961bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26080j, this.f26081k), this.f26082l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26080j, this.f26081k));
            }
        } else {
            paint.setShader(this.f26078g);
        }
    }
}
