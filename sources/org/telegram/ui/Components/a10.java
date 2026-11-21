package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class a10 {
    public float f33252c;
    public float d;
    public float f33253e;
    public float f33254f;
    public RadialGradient f33255g;
    public final int f33256i;
    public int f33257j;
    public int f33258k;
    public int f33259l;
    public float f33250a = -1.0f;
    public float f33251b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f33260m = org.telegram.ui.ActionBar.m6.Oh;
    public final int f33261n = org.telegram.ui.ActionBar.m6.Ph;
    public final int f33262o = org.telegram.ui.ActionBar.m6.Qh;
    public final int f33263p = org.telegram.ui.ActionBar.m6.Rh;
    public final int f33264q = org.telegram.ui.ActionBar.m6.Zh;
    public final int f33265r = org.telegram.ui.ActionBar.m6.f29332ai;
    public final int f33266s = org.telegram.ui.ActionBar.m6.f29352bi;

    public a10(int i7) {
        this.f33256i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f33256i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f33260m, false);
            this.f33257j = x02;
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, this.f33261n, false);
            this.f33258k = x03;
            this.f33255g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, this.f33262o, false);
            this.f33257j = x04;
            int x05 = org.telegram.ui.ActionBar.m6.x0(null, this.f33263p, false);
            this.f33258k = x05;
            this.f33255g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.m6.x0(null, this.f33264q, false);
            this.f33257j = x06;
            int x07 = org.telegram.ui.ActionBar.m6.x0(null, this.f33266s, false);
            this.f33259l = x07;
            int x08 = org.telegram.ui.ActionBar.m6.x0(null, this.f33265r, false);
            this.f33258k = x08;
            this.f33255g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f33256i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Sh, false));
        } else if (!org.telegram.messenger.pc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f33257j, this.f33258k), this.f33259l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f33257j, this.f33258k));
            }
        } else {
            paint.setShader(this.f33255g);
        }
    }
}
