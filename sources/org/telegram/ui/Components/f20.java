package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26041c;
    public float d;
    public float e;
    public float f26042f;
    public RadialGradient f26043g;
    public final int f26044i;
    public int f26045j;
    public int f26046k;
    public int f26047l;
    public float f26039a = -1.0f;
    public float f26040b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26048m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f26049n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f26050o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f26051p = org.telegram.ui.ActionBar.h6.f20938ah;
    public final int f26052q = org.telegram.ui.ActionBar.h6.f21084ih;
    public final int f26053r = org.telegram.ui.ActionBar.h6.f21104jh;
    public final int f26054s = org.telegram.ui.ActionBar.h6.f21123kh;

    public f20(int i10) {
        this.f26044i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26044i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f26048m, false);
            this.f26045j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f26049n, false);
            this.f26046k = x03;
            this.f26043g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f26050o, false);
            this.f26045j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f26051p, false);
            this.f26046k = x05;
            this.f26043g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f26052q, false);
            this.f26045j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f26054s, false);
            this.f26047l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f26053r, false);
            this.f26046k = x08;
            this.f26043g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26044i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20958bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26045j, this.f26046k), this.f26047l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26045j, this.f26046k));
            }
        } else {
            paint.setShader(this.f26043g);
        }
    }
}
