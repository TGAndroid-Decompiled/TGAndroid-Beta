package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26047c;
    public float d;
    public float e;
    public float f26048f;
    public RadialGradient f26049g;
    public final int f26050i;
    public int f26051j;
    public int f26052k;
    public int f26053l;
    public float f26045a = -1.0f;
    public float f26046b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26054m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f26055n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f26056o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f26057p = org.telegram.ui.ActionBar.h6.f20945ah;
    public final int f26058q = org.telegram.ui.ActionBar.h6.f21091ih;
    public final int f26059r = org.telegram.ui.ActionBar.h6.f21111jh;
    public final int f26060s = org.telegram.ui.ActionBar.h6.f21130kh;

    public f20(int i10) {
        this.f26050i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26050i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f26054m, false);
            this.f26051j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f26055n, false);
            this.f26052k = x03;
            this.f26049g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f26056o, false);
            this.f26051j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f26057p, false);
            this.f26052k = x05;
            this.f26049g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f26058q, false);
            this.f26051j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f26060s, false);
            this.f26053l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f26059r, false);
            this.f26052k = x08;
            this.f26049g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26050i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20965bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26051j, this.f26052k), this.f26053l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26051j, this.f26052k));
            }
        } else {
            paint.setShader(this.f26049g);
        }
    }
}
