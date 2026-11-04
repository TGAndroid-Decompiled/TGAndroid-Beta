package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class j00 {
    public float f34887c;
    public float d;
    public float f34888e;
    public float f34889f;
    public RadialGradient f34890g;
    public final int f34891i;
    public int f34892j;
    public int f34893k;
    public int f34894l;
    public float f34885a = -1.0f;
    public float f34886b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f34895m = org.telegram.ui.ActionBar.k6.Lh;
    public final int f34896n = org.telegram.ui.ActionBar.k6.Mh;
    public final int f34897o = org.telegram.ui.ActionBar.k6.Nh;
    public final int f34898p = org.telegram.ui.ActionBar.k6.Oh;
    public final int f34899q = org.telegram.ui.ActionBar.k6.Wh;
    public final int f34900r = org.telegram.ui.ActionBar.k6.Xh;
    public final int f34901s = org.telegram.ui.ActionBar.k6.Yh;

    public j00(int i3) {
        this.f34891i = i3;
        a();
    }

    public final void a() {
        int i3 = this.f34891i;
        if (i3 == 0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f34895m, false);
            this.f34892j = x02;
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, this.f34896n, false);
            this.f34893k = x03;
            this.f34890g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i3 == 1) {
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, this.f34897o, false);
            this.f34892j = x04;
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, this.f34898p, false);
            this.f34893k = x05;
            this.f34890g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i3 == 3) {
            int x06 = org.telegram.ui.ActionBar.k6.x0(null, this.f34899q, false);
            this.f34892j = x06;
            int x07 = org.telegram.ui.ActionBar.k6.x0(null, this.f34901s, false);
            this.f34894l = x07;
            int x08 = org.telegram.ui.ActionBar.k6.x0(null, this.f34900r, false);
            this.f34893k = x08;
            this.f34890g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i3 = this.f34891i;
        if (i3 != 0 && i3 != 1 && i3 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ph, false));
        } else if (!org.telegram.messenger.lc.e(512)) {
            paint.setShader(null);
            if (i3 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f34892j, this.f34893k), this.f34894l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f34892j, this.f34893k));
            }
        } else {
            paint.setShader(this.f34890g);
        }
    }
}
