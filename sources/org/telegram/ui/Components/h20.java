package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class h20 {
    public float f28772c;
    public float d;
    public float e;
    public float f28773f;
    public RadialGradient f28774g;
    public final int f28775i;
    public int f28776j;
    public int f28777k;
    public int f28778l;
    public float f28770a = -1.0f;
    public float f28771b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f28779m = org.telegram.ui.ActionBar.y6.Xg;
    public final int f28780n = org.telegram.ui.ActionBar.y6.Yg;
    public final int f28781o = org.telegram.ui.ActionBar.y6.Zg;
    public final int f28782p = org.telegram.ui.ActionBar.y6.f23308ah;
    public final int f28783q = org.telegram.ui.ActionBar.y6.f23456ih;
    public final int f28784r = org.telegram.ui.ActionBar.y6.f23475jh;
    public final int f28785s = org.telegram.ui.ActionBar.y6.f23495kh;

    public h20(int i10) {
        this.f28775i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f28775i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, this.f28779m, false);
            this.f28776j = x02;
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, this.f28780n, false);
            this.f28777k = x03;
            this.f28774g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, this.f28781o, false);
            this.f28776j = x04;
            int x05 = org.telegram.ui.ActionBar.y6.x0(null, this.f28782p, false);
            this.f28777k = x05;
            this.f28774g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.y6.x0(null, this.f28783q, false);
            this.f28776j = x06;
            int x07 = org.telegram.ui.ActionBar.y6.x0(null, this.f28785s, false);
            this.f28778l = x07;
            int x08 = org.telegram.ui.ActionBar.y6.x0(null, this.f28784r, false);
            this.f28777k = x08;
            this.f28774g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f28775i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23328bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f28776j, this.f28777k), this.f28778l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f28776j, this.f28777k));
            }
        } else {
            paint.setShader(this.f28774g);
        }
    }
}
