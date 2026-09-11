package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f32063c;
    public float d;
    public float f32064e;
    public float f32065f;
    public RadialGradient f32066g;
    public final int f32067i;
    public int f32068j;
    public int f32069k;
    public int f32070l;
    public float f32061a = -1.0f;
    public float f32062b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32071m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f32072n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f32073o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f32074p = org.telegram.ui.ActionBar.j6.f20617ah;
    public final int f32075q = org.telegram.ui.ActionBar.j6.f20763ih;
    public final int f32076r = org.telegram.ui.ActionBar.j6.f20782jh;
    public final int f32077s = org.telegram.ui.ActionBar.j6.f20802kh;

    public w10(int i10) {
        this.f32067i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32067i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f32071m, false);
            this.f32068j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f32072n, false);
            this.f32069k = w03;
            this.f32066g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f32073o, false);
            this.f32068j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f32074p, false);
            this.f32069k = w05;
            this.f32066g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f32075q, false);
            this.f32068j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f32077s, false);
            this.f32070l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f32076r, false);
            this.f32069k = w08;
            this.f32066g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32067i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20636bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32068j, this.f32069k), this.f32070l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32068j, this.f32069k));
            }
        } else {
            paint.setShader(this.f32066g);
        }
    }
}
