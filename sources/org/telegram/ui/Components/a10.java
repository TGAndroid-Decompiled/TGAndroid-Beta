package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class a10 {
    public float f33255c;
    public float d;
    public float f33256e;
    public float f33257f;
    public RadialGradient f33258g;
    public final int f33259i;
    public int f33260j;
    public int f33261k;
    public int f33262l;
    public float f33253a = -1.0f;
    public float f33254b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f33263m = org.telegram.ui.ActionBar.m6.Oh;
    public final int f33264n = org.telegram.ui.ActionBar.m6.Ph;
    public final int f33265o = org.telegram.ui.ActionBar.m6.Qh;
    public final int f33266p = org.telegram.ui.ActionBar.m6.Rh;
    public final int f33267q = org.telegram.ui.ActionBar.m6.Zh;
    public final int f33268r = org.telegram.ui.ActionBar.m6.f29335ai;
    public final int f33269s = org.telegram.ui.ActionBar.m6.f29355bi;

    public a10(int i7) {
        this.f33259i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f33259i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f33263m, false);
            this.f33260j = x02;
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, this.f33264n, false);
            this.f33261k = x03;
            this.f33258g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, this.f33265o, false);
            this.f33260j = x04;
            int x05 = org.telegram.ui.ActionBar.m6.x0(null, this.f33266p, false);
            this.f33261k = x05;
            this.f33258g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.m6.x0(null, this.f33267q, false);
            this.f33260j = x06;
            int x07 = org.telegram.ui.ActionBar.m6.x0(null, this.f33269s, false);
            this.f33262l = x07;
            int x08 = org.telegram.ui.ActionBar.m6.x0(null, this.f33268r, false);
            this.f33261k = x08;
            this.f33258g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f33259i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Sh, false));
        } else if (!org.telegram.messenger.qc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f33260j, this.f33261k), this.f33262l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f33260j, this.f33261k));
            }
        } else {
            paint.setShader(this.f33258g);
        }
    }
}
