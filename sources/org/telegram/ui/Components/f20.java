package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26044c;
    public float d;
    public float e;
    public float f26045f;
    public RadialGradient f26046g;
    public final int f26047i;
    public int f26048j;
    public int f26049k;
    public int f26050l;
    public float f26042a = -1.0f;
    public float f26043b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26051m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f26052n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f26053o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f26054p = org.telegram.ui.ActionBar.h6.f20942ah;
    public final int f26055q = org.telegram.ui.ActionBar.h6.f21088ih;
    public final int f26056r = org.telegram.ui.ActionBar.h6.f21108jh;
    public final int f26057s = org.telegram.ui.ActionBar.h6.f21127kh;

    public f20(int i10) {
        this.f26047i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26047i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f26051m, false);
            this.f26048j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f26052n, false);
            this.f26049k = x03;
            this.f26046g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f26053o, false);
            this.f26048j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f26054p, false);
            this.f26049k = x05;
            this.f26046g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f26055q, false);
            this.f26048j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f26057s, false);
            this.f26050l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f26056r, false);
            this.f26049k = x08;
            this.f26046g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26047i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20962bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26048j, this.f26049k), this.f26050l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26048j, this.f26049k));
            }
        } else {
            paint.setShader(this.f26046g);
        }
    }
}
