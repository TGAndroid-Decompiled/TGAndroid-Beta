package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class a10 {
    public float f33221c;
    public float d;
    public float f33222e;
    public float f33223f;
    public RadialGradient f33224g;
    public final int f33225i;
    public int f33226j;
    public int f33227k;
    public int f33228l;
    public float f33219a = -1.0f;
    public float f33220b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f33229m = org.telegram.ui.ActionBar.m6.Oh;
    public final int f33230n = org.telegram.ui.ActionBar.m6.Ph;
    public final int f33231o = org.telegram.ui.ActionBar.m6.Qh;
    public final int f33232p = org.telegram.ui.ActionBar.m6.Rh;
    public final int f33233q = org.telegram.ui.ActionBar.m6.Zh;
    public final int f33234r = org.telegram.ui.ActionBar.m6.f29301ai;
    public final int f33235s = org.telegram.ui.ActionBar.m6.f29321bi;

    public a10(int i7) {
        this.f33225i = i7;
        a();
    }

    public final void a() {
        int i7 = this.f33225i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f33229m, false);
            this.f33226j = x02;
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, this.f33230n, false);
            this.f33227k = x03;
            this.f33224g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, this.f33231o, false);
            this.f33226j = x04;
            int x05 = org.telegram.ui.ActionBar.m6.x0(null, this.f33232p, false);
            this.f33227k = x05;
            this.f33224g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.m6.x0(null, this.f33233q, false);
            this.f33226j = x06;
            int x07 = org.telegram.ui.ActionBar.m6.x0(null, this.f33235s, false);
            this.f33228l = x07;
            int x08 = org.telegram.ui.ActionBar.m6.x0(null, this.f33234r, false);
            this.f33227k = x08;
            this.f33224g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.f33225i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Sh, false));
        } else if (!org.telegram.messenger.qc.e(512)) {
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f33226j, this.f33227k), this.f33228l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f33226j, this.f33227k));
            }
        } else {
            paint.setShader(this.f33224g);
        }
    }
}
