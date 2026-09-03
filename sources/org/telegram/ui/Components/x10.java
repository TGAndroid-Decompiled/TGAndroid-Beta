package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f32905c;
    public float d;
    public float f32906e;
    public float f32907f;
    public RadialGradient f32908g;
    public final int f32909i;
    public int f32910j;
    public int f32911k;
    public int f32912l;
    public float f32903a = -1.0f;
    public float f32904b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32913m = org.telegram.ui.ActionBar.k6.Xg;
    public final int f32914n = org.telegram.ui.ActionBar.k6.Yg;
    public final int f32915o = org.telegram.ui.ActionBar.k6.Zg;
    public final int f32916p = org.telegram.ui.ActionBar.k6.f21617ah;
    public final int f32917q = org.telegram.ui.ActionBar.k6.f21761ih;
    public final int f32918r = org.telegram.ui.ActionBar.k6.f21779jh;
    public final int f32919s = org.telegram.ui.ActionBar.k6.f21798kh;

    public x10(int i10) {
        this.f32909i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32909i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, this.f32913m, false);
            this.f32910j = w02;
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, this.f32914n, false);
            this.f32911k = w03;
            this.f32908g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(null, this.f32915o, false);
            this.f32910j = w04;
            int w05 = org.telegram.ui.ActionBar.k6.w0(null, this.f32916p, false);
            this.f32911k = w05;
            this.f32908g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.k6.w0(null, this.f32917q, false);
            this.f32910j = w06;
            int w07 = org.telegram.ui.ActionBar.k6.w0(null, this.f32919s, false);
            this.f32912l = w07;
            int w08 = org.telegram.ui.ActionBar.k6.w0(null, this.f32918r, false);
            this.f32911k = w08;
            this.f32908g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32909i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21636bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32910j, this.f32911k), this.f32912l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32910j, this.f32911k));
            }
        } else {
            paint.setShader(this.f32908g);
        }
    }
}
