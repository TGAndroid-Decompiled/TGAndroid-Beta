package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class o20 {
    public float f29228c;
    public float d;
    public float f29229e;
    public float f29230f;
    public RadialGradient f29231g;
    public final int f29232i;
    public int f29233j;
    public int f29234k;
    public int f29235l;
    public float f29226a = -1.0f;
    public float f29227b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29236m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f29237n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f29238o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f29239p = org.telegram.ui.ActionBar.h6.f20740ah;
    public final int f29240q = org.telegram.ui.ActionBar.h6.f20887ih;
    public final int f29241r = org.telegram.ui.ActionBar.h6.f20905jh;
    public final int f29242s = org.telegram.ui.ActionBar.h6.f20925kh;

    public o20(int i10) {
        this.f29232i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29232i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f29236m, false);
            this.f29233j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f29237n, false);
            this.f29234k = x03;
            this.f29231g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f29238o, false);
            this.f29233j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f29239p, false);
            this.f29234k = x05;
            this.f29231g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f29240q, false);
            this.f29233j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f29242s, false);
            this.f29235l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f29241r, false);
            this.f29234k = x08;
            this.f29231g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29232i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20760bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29233j, this.f29234k), this.f29235l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29233j, this.f29234k));
            }
        } else {
            paint.setShader(this.f29231g);
        }
    }
}
