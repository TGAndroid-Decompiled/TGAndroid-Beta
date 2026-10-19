package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26074c;
    public float d;
    public float e;
    public float f26075f;
    public RadialGradient f26076g;
    public final int f26077i;
    public int f26078j;
    public int f26079k;
    public int f26080l;
    public float f26072a = -1.0f;
    public float f26073b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26081m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f26082n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f26083o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f26084p = org.telegram.ui.ActionBar.h6.f20939ah;
    public final int f26085q = org.telegram.ui.ActionBar.h6.f21085ih;
    public final int f26086r = org.telegram.ui.ActionBar.h6.f21105jh;
    public final int f26087s = org.telegram.ui.ActionBar.h6.f21124kh;

    public f20(int i10) {
        this.f26077i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26077i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f26081m, false);
            this.f26078j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f26082n, false);
            this.f26079k = x03;
            this.f26076g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f26083o, false);
            this.f26078j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f26084p, false);
            this.f26079k = x05;
            this.f26076g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f26085q, false);
            this.f26078j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f26087s, false);
            this.f26080l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f26086r, false);
            this.f26079k = x08;
            this.f26076g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26077i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20959bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26078j, this.f26079k), this.f26080l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26078j, this.f26079k));
            }
        } else {
            paint.setShader(this.f26076g);
        }
    }
}
