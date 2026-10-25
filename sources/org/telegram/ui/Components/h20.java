package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class h20 {
    public float f28770c;
    public float d;
    public float e;
    public float f28771f;
    public RadialGradient f28772g;
    public final int f28773i;
    public int f28774j;
    public int f28775k;
    public int f28776l;
    public float f28768a = -1.0f;
    public float f28769b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f28777m = org.telegram.ui.ActionBar.y6.Xg;
    public final int f28778n = org.telegram.ui.ActionBar.y6.Yg;
    public final int f28779o = org.telegram.ui.ActionBar.y6.Zg;
    public final int f28780p = org.telegram.ui.ActionBar.y6.f23306ah;
    public final int f28781q = org.telegram.ui.ActionBar.y6.f23454ih;
    public final int f28782r = org.telegram.ui.ActionBar.y6.f23473jh;
    public final int f28783s = org.telegram.ui.ActionBar.y6.f23493kh;

    public h20(int i10) {
        this.f28773i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f28773i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, this.f28777m, false);
            this.f28774j = x02;
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, this.f28778n, false);
            this.f28775k = x03;
            this.f28772g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, this.f28779o, false);
            this.f28774j = x04;
            int x05 = org.telegram.ui.ActionBar.y6.x0(null, this.f28780p, false);
            this.f28775k = x05;
            this.f28772g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.y6.x0(null, this.f28781q, false);
            this.f28774j = x06;
            int x07 = org.telegram.ui.ActionBar.y6.x0(null, this.f28783s, false);
            this.f28776l = x07;
            int x08 = org.telegram.ui.ActionBar.y6.x0(null, this.f28782r, false);
            this.f28775k = x08;
            this.f28772g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f28773i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23326bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f28774j, this.f28775k), this.f28776l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f28774j, this.f28775k));
            }
        } else {
            paint.setShader(this.f28772g);
        }
    }
}
