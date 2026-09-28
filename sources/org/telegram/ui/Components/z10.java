package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class z10 {
    public float f30792c;
    public float d;
    public float e;
    public float f30793f;
    public RadialGradient f30794g;
    public final int f30795i;
    public int f30796j;
    public int f30797k;
    public int f30798l;
    public float f30790a = -1.0f;
    public float f30791b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30799m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30800n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30801o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30802p = org.telegram.ui.ActionBar.h6.f19014ah;
    public final int f30803q = org.telegram.ui.ActionBar.h6.f19159ih;
    public final int f30804r = org.telegram.ui.ActionBar.h6.f19178jh;
    public final int f30805s = org.telegram.ui.ActionBar.h6.f19198kh;

    public z10(int i10) {
        this.f30795i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30795i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30799m, false);
            this.f30796j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30800n, false);
            this.f30797k = w03;
            this.f30794g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30801o, false);
            this.f30796j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30802p, false);
            this.f30797k = w05;
            this.f30794g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30803q, false);
            this.f30796j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30805s, false);
            this.f30798l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30804r, false);
            this.f30797k = w08;
            this.f30794g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30795i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19033bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30796j, this.f30797k), this.f30798l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30796j, this.f30797k));
            }
        } else {
            paint.setShader(this.f30794g);
        }
    }
}
