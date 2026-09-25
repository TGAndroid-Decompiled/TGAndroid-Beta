package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f30232c;
    public float d;
    public float e;
    public float f30233f;
    public RadialGradient f30234g;
    public final int f30235i;
    public int f30236j;
    public int f30237k;
    public int f30238l;
    public float f30230a = -1.0f;
    public float f30231b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30239m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30240n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30241o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30242p = org.telegram.ui.ActionBar.h6.f19014ah;
    public final int f30243q = org.telegram.ui.ActionBar.h6.f19159ih;
    public final int f30244r = org.telegram.ui.ActionBar.h6.f19178jh;
    public final int f30245s = org.telegram.ui.ActionBar.h6.f19198kh;

    public x10(int i10) {
        this.f30235i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30235i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30239m, false);
            this.f30236j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30240n, false);
            this.f30237k = w03;
            this.f30234g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30241o, false);
            this.f30236j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30242p, false);
            this.f30237k = w05;
            this.f30234g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30243q, false);
            this.f30236j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30245s, false);
            this.f30238l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30244r, false);
            this.f30237k = w08;
            this.f30234g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30235i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19033bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30236j, this.f30237k), this.f30238l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30236j, this.f30237k));
            }
        } else {
            paint.setShader(this.f30234g);
        }
    }
}
