package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class c10 {
    public float f24956c;
    public float d;
    public float e;
    public float f24957f;
    public RadialGradient f24958g;
    public final int f24959i;
    public int f24960j;
    public int f24961k;
    public int f24962l;
    public float f24954a = -1.0f;
    public float f24955b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f24963m = org.telegram.ui.ActionBar.t6.Lh;
    public final int f24964n = org.telegram.ui.ActionBar.t6.Mh;
    public final int f24965o = org.telegram.ui.ActionBar.t6.Nh;
    public final int f24966p = org.telegram.ui.ActionBar.t6.Oh;
    public final int f24967q = org.telegram.ui.ActionBar.t6.Wh;
    public final int f24968r = org.telegram.ui.ActionBar.t6.Xh;
    public final int f24969s = org.telegram.ui.ActionBar.t6.Yh;

    public c10(int i10) {
        this.f24959i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f24959i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.f24963m, false);
            this.f24960j = x02;
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, this.f24964n, false);
            this.f24961k = x03;
            this.f24958g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.t6.x0(null, this.f24965o, false);
            this.f24960j = x04;
            int x05 = org.telegram.ui.ActionBar.t6.x0(null, this.f24966p, false);
            this.f24961k = x05;
            this.f24958g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.t6.x0(null, this.f24967q, false);
            this.f24960j = x06;
            int x07 = org.telegram.ui.ActionBar.t6.x0(null, this.f24969s, false);
            this.f24962l = x07;
            int x08 = org.telegram.ui.ActionBar.t6.x0(null, this.f24968r, false);
            this.f24961k = x08;
            this.f24958g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f24959i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ph, false));
        } else if (!org.telegram.messenger.tc.e(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.b.f(0.5f, i0.b.f(0.5f, this.f24960j, this.f24961k), this.f24962l));
            } else {
                paint.setColor(i0.b.f(0.5f, this.f24960j, this.f24961k));
            }
        } else {
            paint.setShader(this.f24958g);
        }
    }
}
