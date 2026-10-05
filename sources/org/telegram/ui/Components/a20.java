package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class a20 {
    public float f24437c;
    public float d;
    public float f24438e;
    public float f24439f;
    public RadialGradient f24440g;
    public final int f24441i;
    public int f24442j;
    public int f24443k;
    public int f24444l;
    public float f24435a = -1.0f;
    public float f24436b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f24445m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f24446n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f24447o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f24448p = org.telegram.ui.ActionBar.i6.f20781ah;
    public final int f24449q = org.telegram.ui.ActionBar.i6.f20928ih;
    public final int f24450r = org.telegram.ui.ActionBar.i6.f20947jh;
    public final int f24451s = org.telegram.ui.ActionBar.i6.f20967kh;

    public a20(int i10) {
        this.f24441i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f24441i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f24445m, false);
            this.f24442j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f24446n, false);
            this.f24443k = w03;
            this.f24440g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f24447o, false);
            this.f24442j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f24448p, false);
            this.f24443k = w05;
            this.f24440g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f24449q, false);
            this.f24442j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f24451s, false);
            this.f24444l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f24450r, false);
            this.f24443k = w08;
            this.f24440g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f24441i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20800bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f24442j, this.f24443k), this.f24444l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f24442j, this.f24443k));
            }
        } else {
            paint.setShader(this.f24440g);
        }
    }
}
