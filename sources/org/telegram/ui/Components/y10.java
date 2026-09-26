package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class y10 {
    public float f30529c;
    public float d;
    public float e;
    public float f30530f;
    public RadialGradient f30531g;
    public final int f30532i;
    public int f30533j;
    public int f30534k;
    public int f30535l;
    public float f30527a = -1.0f;
    public float f30528b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30536m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30537n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30538o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30539p = org.telegram.ui.ActionBar.h6.f19013ah;
    public final int f30540q = org.telegram.ui.ActionBar.h6.f19158ih;
    public final int f30541r = org.telegram.ui.ActionBar.h6.f19177jh;
    public final int f30542s = org.telegram.ui.ActionBar.h6.f19197kh;

    public y10(int i10) {
        this.f30532i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30532i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30536m, false);
            this.f30533j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30537n, false);
            this.f30534k = w03;
            this.f30531g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30538o, false);
            this.f30533j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30539p, false);
            this.f30534k = w05;
            this.f30531g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30540q, false);
            this.f30533j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30542s, false);
            this.f30535l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30541r, false);
            this.f30534k = w08;
            this.f30531g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30532i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19032bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30533j, this.f30534k), this.f30535l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30533j, this.f30534k));
            }
        } else {
            paint.setShader(this.f30531g);
        }
    }
}
