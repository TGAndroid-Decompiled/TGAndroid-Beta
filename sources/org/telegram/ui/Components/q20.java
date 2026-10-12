package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class q20 {
    public float f29658c;
    public float d;
    public float f29659e;
    public float f29660f;
    public RadialGradient f29661g;
    public final int f29662i;
    public int f29663j;
    public int f29664k;
    public int f29665l;
    public float f29656a = -1.0f;
    public float f29657b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29666m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f29667n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f29668o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f29669p = org.telegram.ui.ActionBar.h6.f20513ah;
    public final int f29670q = org.telegram.ui.ActionBar.h6.f20660ih;
    public final int f29671r = org.telegram.ui.ActionBar.h6.f20678jh;
    public final int f29672s = org.telegram.ui.ActionBar.h6.f20698kh;

    public q20(int i10) {
        this.f29662i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29662i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f29666m, false);
            this.f29663j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f29667n, false);
            this.f29664k = x03;
            this.f29661g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f29668o, false);
            this.f29663j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f29669p, false);
            this.f29664k = x05;
            this.f29661g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f29670q, false);
            this.f29663j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f29672s, false);
            this.f29665l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f29671r, false);
            this.f29664k = x08;
            this.f29661g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29662i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20533bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29663j, this.f29664k), this.f29665l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29663j, this.f29664k));
            }
        } else {
            paint.setShader(this.f29661g);
        }
    }
}
