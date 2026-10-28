package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class h20 {
    public float f28820c;
    public float d;
    public float e;
    public float f28821f;
    public RadialGradient f28822g;
    public final int f28823i;
    public int f28824j;
    public int f28825k;
    public int f28826l;
    public float f28818a = -1.0f;
    public float f28819b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f28827m = org.telegram.ui.ActionBar.y6.Xg;
    public final int f28828n = org.telegram.ui.ActionBar.y6.Yg;
    public final int f28829o = org.telegram.ui.ActionBar.y6.Zg;
    public final int f28830p = org.telegram.ui.ActionBar.y6.f23309ah;
    public final int f28831q = org.telegram.ui.ActionBar.y6.f23457ih;
    public final int f28832r = org.telegram.ui.ActionBar.y6.f23476jh;
    public final int f28833s = org.telegram.ui.ActionBar.y6.f23496kh;

    public h20(int i10) {
        this.f28823i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f28823i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, this.f28827m, false);
            this.f28824j = x02;
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, this.f28828n, false);
            this.f28825k = x03;
            this.f28822g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, this.f28829o, false);
            this.f28824j = x04;
            int x05 = org.telegram.ui.ActionBar.y6.x0(null, this.f28830p, false);
            this.f28825k = x05;
            this.f28822g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.y6.x0(null, this.f28831q, false);
            this.f28824j = x06;
            int x07 = org.telegram.ui.ActionBar.y6.x0(null, this.f28833s, false);
            this.f28826l = x07;
            int x08 = org.telegram.ui.ActionBar.y6.x0(null, this.f28832r, false);
            this.f28825k = x08;
            this.f28822g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f28823i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23329bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f28824j, this.f28825k), this.f28826l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f28824j, this.f28825k));
            }
        } else {
            paint.setShader(this.f28822g);
        }
    }
}
