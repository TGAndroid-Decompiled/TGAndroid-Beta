package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29904c;
    public float d;
    public float e;
    public float f29905f;
    public RadialGradient f29906g;
    public final int f29907i;
    public int f29908j;
    public int f29909k;
    public int f29910l;
    public float f29902a = -1.0f;
    public float f29903b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29911m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f29912n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f29913o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f29914p = org.telegram.ui.ActionBar.j6.f19048ah;
    public final int f29915q = org.telegram.ui.ActionBar.j6.f19194ih;
    public final int f29916r = org.telegram.ui.ActionBar.j6.f19213jh;
    public final int f29917s = org.telegram.ui.ActionBar.j6.f19233kh;

    public w10(int i10) {
        this.f29907i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29907i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f29911m, false);
            this.f29908j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f29912n, false);
            this.f29909k = w03;
            this.f29906g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f29913o, false);
            this.f29908j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f29914p, false);
            this.f29909k = w05;
            this.f29906g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f29915q, false);
            this.f29908j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f29917s, false);
            this.f29910l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f29916r, false);
            this.f29909k = w08;
            this.f29906g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29907i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19067bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29908j, this.f29909k), this.f29910l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29908j, this.f29909k));
            }
        } else {
            paint.setShader(this.f29906g);
        }
    }
}
