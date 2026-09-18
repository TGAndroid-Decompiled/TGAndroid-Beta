package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29826c;
    public float d;
    public float e;
    public float f29827f;
    public RadialGradient f29828g;
    public final int f29829i;
    public int f29830j;
    public int f29831k;
    public int f29832l;
    public float f29824a = -1.0f;
    public float f29825b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29833m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f29834n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f29835o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f29836p = org.telegram.ui.ActionBar.j6.f19016ah;
    public final int f29837q = org.telegram.ui.ActionBar.j6.f19162ih;
    public final int f29838r = org.telegram.ui.ActionBar.j6.f19181jh;
    public final int f29839s = org.telegram.ui.ActionBar.j6.f19201kh;

    public w10(int i10) {
        this.f29829i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29829i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f29833m, false);
            this.f29830j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f29834n, false);
            this.f29831k = w03;
            this.f29828g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f29835o, false);
            this.f29830j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f29836p, false);
            this.f29831k = w05;
            this.f29828g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f29837q, false);
            this.f29830j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f29839s, false);
            this.f29832l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f29838r, false);
            this.f29831k = w08;
            this.f29828g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29829i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19035bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29830j, this.f29831k), this.f29832l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29830j, this.f29831k));
            }
        } else {
            paint.setShader(this.f29828g);
        }
    }
}
