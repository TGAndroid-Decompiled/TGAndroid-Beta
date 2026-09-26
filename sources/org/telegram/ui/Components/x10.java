package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f30231c;
    public float d;
    public float e;
    public float f30232f;
    public RadialGradient f30233g;
    public final int f30234i;
    public int f30235j;
    public int f30236k;
    public int f30237l;
    public float f30229a = -1.0f;
    public float f30230b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30238m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30239n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30240o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30241p = org.telegram.ui.ActionBar.h6.f19013ah;
    public final int f30242q = org.telegram.ui.ActionBar.h6.f19158ih;
    public final int f30243r = org.telegram.ui.ActionBar.h6.f19177jh;
    public final int f30244s = org.telegram.ui.ActionBar.h6.f19197kh;

    public x10(int i10) {
        this.f30234i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30234i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30238m, false);
            this.f30235j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30239n, false);
            this.f30236k = w03;
            this.f30233g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30240o, false);
            this.f30235j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30241p, false);
            this.f30236k = w05;
            this.f30233g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30242q, false);
            this.f30235j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30244s, false);
            this.f30237l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30243r, false);
            this.f30236k = w08;
            this.f30233g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30234i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19032bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30235j, this.f30236k), this.f30237l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30235j, this.f30236k));
            }
        } else {
            paint.setShader(this.f30233g);
        }
    }
}
