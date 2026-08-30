package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f30142c;
    public float d;
    public float e;
    public float f30143f;
    public RadialGradient f30144g;
    public final int f30145i;
    public int f30146j;
    public int f30147k;
    public int f30148l;
    public float f30140a = -1.0f;
    public float f30141b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30149m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f30150n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f30151o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f30152p = org.telegram.ui.ActionBar.j6.f19862ah;
    public final int f30153q = org.telegram.ui.ActionBar.j6.f20005ih;
    public final int f30154r = org.telegram.ui.ActionBar.j6.f20023jh;
    public final int f30155s = org.telegram.ui.ActionBar.j6.f20042kh;

    public w10(int i10) {
        this.f30145i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30145i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f30149m, false);
            this.f30146j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f30150n, false);
            this.f30147k = w03;
            this.f30144g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f30151o, false);
            this.f30146j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f30152p, false);
            this.f30147k = w05;
            this.f30144g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f30153q, false);
            this.f30146j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f30155s, false);
            this.f30148l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f30154r, false);
            this.f30147k = w08;
            this.f30144g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30145i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30146j, this.f30147k), this.f30148l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30146j, this.f30147k));
            }
        } else {
            paint.setShader(this.f30144g);
        }
    }
}
