package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class z10 {
    public float f30791c;
    public float d;
    public float e;
    public float f30792f;
    public RadialGradient f30793g;
    public final int f30794i;
    public int f30795j;
    public int f30796k;
    public int f30797l;
    public float f30789a = -1.0f;
    public float f30790b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30798m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30799n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30800o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30801p = org.telegram.ui.ActionBar.h6.f19013ah;
    public final int f30802q = org.telegram.ui.ActionBar.h6.f19158ih;
    public final int f30803r = org.telegram.ui.ActionBar.h6.f19177jh;
    public final int f30804s = org.telegram.ui.ActionBar.h6.f19197kh;

    public z10(int i10) {
        this.f30794i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30794i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30798m, false);
            this.f30795j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30799n, false);
            this.f30796k = w03;
            this.f30793g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30800o, false);
            this.f30795j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30801p, false);
            this.f30796k = w05;
            this.f30793g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30802q, false);
            this.f30795j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30804s, false);
            this.f30797l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30803r, false);
            this.f30796k = w08;
            this.f30793g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30794i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19032bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30795j, this.f30796k), this.f30797l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30795j, this.f30796k));
            }
        } else {
            paint.setShader(this.f30793g);
        }
    }
}
