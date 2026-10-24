package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class d20 {
    public float f25517c;
    public float d;
    public float e;
    public float f25518f;
    public RadialGradient f25519g;
    public final int f25520i;
    public int f25521j;
    public int f25522k;
    public int f25523l;
    public float f25515a = -1.0f;
    public float f25516b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f25524m = org.telegram.ui.ActionBar.k6.Xg;
    public final int f25525n = org.telegram.ui.ActionBar.k6.Yg;
    public final int f25526o = org.telegram.ui.ActionBar.k6.Zg;
    public final int f25527p = org.telegram.ui.ActionBar.k6.f21136ah;
    public final int f25528q = org.telegram.ui.ActionBar.k6.f21282ih;
    public final int f25529r = org.telegram.ui.ActionBar.k6.f21302jh;
    public final int f25530s = org.telegram.ui.ActionBar.k6.f21321kh;

    public d20(int i10) {
        this.f25520i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f25520i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f25524m, false);
            this.f25521j = x02;
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, this.f25525n, false);
            this.f25522k = x03;
            this.f25519g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, this.f25526o, false);
            this.f25521j = x04;
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, this.f25527p, false);
            this.f25522k = x05;
            this.f25519g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.k6.x0(null, this.f25528q, false);
            this.f25521j = x06;
            int x07 = org.telegram.ui.ActionBar.k6.x0(null, this.f25530s, false);
            this.f25523l = x07;
            int x08 = org.telegram.ui.ActionBar.k6.x0(null, this.f25529r, false);
            this.f25522k = x08;
            this.f25519g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f25520i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21156bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f25521j, this.f25522k), this.f25523l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f25521j, this.f25522k));
            }
        } else {
            paint.setShader(this.f25519g);
        }
    }
}
