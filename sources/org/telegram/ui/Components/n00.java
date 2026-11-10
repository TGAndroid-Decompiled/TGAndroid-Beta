package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class n00 {
    public float f36170c;
    public float d;
    public float f36171e;
    public float f36172f;
    public RadialGradient f36173g;
    public final int f36174i;
    public int f36175j;
    public int f36176k;
    public int f36177l;
    public float f36168a = -1.0f;
    public float f36169b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f36178m = org.telegram.ui.ActionBar.m6.Lh;
    public final int f36179n = org.telegram.ui.ActionBar.m6.Mh;
    public final int f36180o = org.telegram.ui.ActionBar.m6.Nh;
    public final int f36181p = org.telegram.ui.ActionBar.m6.Oh;
    public final int f36182q = org.telegram.ui.ActionBar.m6.Wh;
    public final int f36183r = org.telegram.ui.ActionBar.m6.Xh;
    public final int f36184s = org.telegram.ui.ActionBar.m6.Yh;

    public n00(int i7) {
        this.f36174i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f36174i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f36178m, false);
            this.f36175j = x02;
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, this.f36179n, false);
            this.f36176k = x03;
            this.f36173g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, this.f36180o, false);
            this.f36175j = x04;
            int x05 = org.telegram.ui.ActionBar.m6.x0(null, this.f36181p, false);
            this.f36176k = x05;
            this.f36173g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.m6.x0(null, this.f36182q, false);
            this.f36175j = x06;
            int x07 = org.telegram.ui.ActionBar.m6.x0(null, this.f36184s, false);
            this.f36177l = x07;
            int x08 = org.telegram.ui.ActionBar.m6.x0(null, this.f36183r, false);
            this.f36176k = x08;
            this.f36173g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f36174i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ph, false));
        } else if (!org.telegram.messenger.sc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f36175j, this.f36176k), this.f36177l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f36175j, this.f36176k));
            }
        } else {
            paint.setShader(this.f36173g);
        }
    }
}
