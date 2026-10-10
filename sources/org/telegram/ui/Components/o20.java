package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class o20 {
    public float f29316c;
    public float d;
    public float f29317e;
    public float f29318f;
    public RadialGradient f29319g;
    public final int f29320i;
    public int f29321j;
    public int f29322k;
    public int f29323l;
    public float f29314a = -1.0f;
    public float f29315b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29324m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f29325n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f29326o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f29327p = org.telegram.ui.ActionBar.i6.f20755ah;
    public final int f29328q = org.telegram.ui.ActionBar.i6.f20902ih;
    public final int f29329r = org.telegram.ui.ActionBar.i6.f20920jh;
    public final int f29330s = org.telegram.ui.ActionBar.i6.f20940kh;

    public o20(int i10) {
        this.f29320i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29320i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, this.f29324m, false);
            this.f29321j = x02;
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, this.f29325n, false);
            this.f29322k = x03;
            this.f29319g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.i6.x0(null, this.f29326o, false);
            this.f29321j = x04;
            int x05 = org.telegram.ui.ActionBar.i6.x0(null, this.f29327p, false);
            this.f29322k = x05;
            this.f29319g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.i6.x0(null, this.f29328q, false);
            this.f29321j = x06;
            int x07 = org.telegram.ui.ActionBar.i6.x0(null, this.f29330s, false);
            this.f29323l = x07;
            int x08 = org.telegram.ui.ActionBar.i6.x0(null, this.f29329r, false);
            this.f29322k = x08;
            this.f29319g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29320i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20775bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29321j, this.f29322k), this.f29323l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29321j, this.f29322k));
            }
        } else {
            paint.setShader(this.f29319g);
        }
    }
}
