package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class z10 {
    public float f30787c;
    public float d;
    public float e;
    public float f30788f;
    public RadialGradient f30789g;
    public final int f30790i;
    public int f30791j;
    public int f30792k;
    public int f30793l;
    public float f30785a = -1.0f;
    public float f30786b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30794m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30795n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30796o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30797p = org.telegram.ui.ActionBar.h6.f19015ah;
    public final int f30798q = org.telegram.ui.ActionBar.h6.f19160ih;
    public final int f30799r = org.telegram.ui.ActionBar.h6.f19179jh;
    public final int f30800s = org.telegram.ui.ActionBar.h6.f19199kh;

    public z10(int i10) {
        this.f30790i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30790i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30794m, false);
            this.f30791j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30795n, false);
            this.f30792k = w03;
            this.f30789g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30796o, false);
            this.f30791j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30797p, false);
            this.f30792k = w05;
            this.f30789g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30798q, false);
            this.f30791j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30800s, false);
            this.f30793l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30799r, false);
            this.f30792k = w08;
            this.f30789g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30790i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19034bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30791j, this.f30792k), this.f30793l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30791j, this.f30792k));
            }
        } else {
            paint.setShader(this.f30789g);
        }
    }
}
