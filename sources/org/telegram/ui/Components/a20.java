package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class a20 {
    public float f22530c;
    public float d;
    public float e;
    public float f22531f;
    public RadialGradient f22532g;
    public final int f22533i;
    public int f22534j;
    public int f22535k;
    public int f22536l;
    public float f22528a = -1.0f;
    public float f22529b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f22537m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f22538n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f22539o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f22540p = org.telegram.ui.ActionBar.h6.f19030ah;
    public final int f22541q = org.telegram.ui.ActionBar.h6.f19175ih;
    public final int f22542r = org.telegram.ui.ActionBar.h6.f19194jh;
    public final int f22543s = org.telegram.ui.ActionBar.h6.f19214kh;

    public a20(int i10) {
        this.f22533i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f22533i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f22537m, false);
            this.f22534j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f22538n, false);
            this.f22535k = w03;
            this.f22532g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f22539o, false);
            this.f22534j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f22540p, false);
            this.f22535k = w05;
            this.f22532g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f22541q, false);
            this.f22534j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f22543s, false);
            this.f22536l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f22542r, false);
            this.f22535k = w08;
            this.f22532g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f22533i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19049bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f22534j, this.f22535k), this.f22536l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f22534j, this.f22535k));
            }
        } else {
            paint.setShader(this.f22532g);
        }
    }
}
