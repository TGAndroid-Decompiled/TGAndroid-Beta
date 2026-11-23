package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class y00 {
    public float f42259c;
    public float d;
    public float f42260e;
    public float f42261f;
    public RadialGradient f42262g;
    public final int f42263i;
    public int f42264j;
    public int f42265k;
    public int f42266l;
    public float f42257a = -1.0f;
    public float f42258b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f42267m = org.telegram.ui.ActionBar.n6.Oh;
    public final int f42268n = org.telegram.ui.ActionBar.n6.Ph;
    public final int f42269o = org.telegram.ui.ActionBar.n6.Qh;
    public final int f42270p = org.telegram.ui.ActionBar.n6.Rh;
    public final int f42271q = org.telegram.ui.ActionBar.n6.Zh;
    public final int f42272r = org.telegram.ui.ActionBar.n6.f29405ai;
    public final int f42273s = org.telegram.ui.ActionBar.n6.f29425bi;

    public y00(int i7) {
        this.f42263i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f42263i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, this.f42267m, false);
            this.f42264j = x02;
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, this.f42268n, false);
            this.f42265k = x03;
            this.f42262g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.n6.x0(null, this.f42269o, false);
            this.f42264j = x04;
            int x05 = org.telegram.ui.ActionBar.n6.x0(null, this.f42270p, false);
            this.f42265k = x05;
            this.f42262g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.n6.x0(null, this.f42271q, false);
            this.f42264j = x06;
            int x07 = org.telegram.ui.ActionBar.n6.x0(null, this.f42273s, false);
            this.f42266l = x07;
            int x08 = org.telegram.ui.ActionBar.n6.x0(null, this.f42272r, false);
            this.f42265k = x08;
            this.f42262g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f42263i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Sh, false));
        } else if (!org.telegram.messenger.pc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f42264j, this.f42265k), this.f42266l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f42264j, this.f42265k));
            }
        } else {
            paint.setShader(this.f42262g);
        }
    }
}
