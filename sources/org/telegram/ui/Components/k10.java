package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;

public final class k10 {

    public float f29881c;
    public float d;

    public float f29882e;

    public float f29883f;

    public RadialGradient f29884g;

    public final int f29885i;

    public int f29886j;

    public int f29887k;

    public int f29888l;

    public float f29879a = -1.0f;

    public float f29880b = -1.0f;
    public final Matrix h = new Matrix();

    public final int f29889m = org.telegram.ui.ActionBar.g6.Xg;

    public final int f29890n = org.telegram.ui.ActionBar.g6.Yg;

    public final int f29891o = org.telegram.ui.ActionBar.g6.Zg;

    public final int f29892p = org.telegram.ui.ActionBar.g6.f23009ah;

    public final int f29893q = org.telegram.ui.ActionBar.g6.f23154ih;

    public final int f29894r = org.telegram.ui.ActionBar.g6.f23173jh;

    public final int f29895s = org.telegram.ui.ActionBar.g6.f23191kh;

    public k10(int i10) {
        this.f29885i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29885i;
        if (i10 == 0) {
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, this.f29889m, false);
            this.f29886j = iW0;
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, this.f29890n, false);
            this.f29887k = iW1;
            this.f29884g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{iW0, iW1}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i10 == 1) {
            int iW2 = org.telegram.ui.ActionBar.g6.w0(null, this.f29891o, false);
            this.f29886j = iW2;
            int iW3 = org.telegram.ui.ActionBar.g6.w0(null, this.f29892p, false);
            this.f29887k = iW3;
            this.f29884g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{iW2, iW3}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i10 == 3) {
            int iW4 = org.telegram.ui.ActionBar.g6.w0(null, this.f29893q, false);
            this.f29886j = iW4;
            int iW5 = org.telegram.ui.ActionBar.g6.w0(null, this.f29895s, false);
            this.f29888l = iW5;
            int iW6 = org.telegram.ui.ActionBar.g6.w0(null, this.f29894r, false);
            this.f29887k = iW6;
            this.f29884g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{iW4, iW5, iW6}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29885i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23028bh, false));
        } else {
            if (LiteMode.isEnabled(512)) {
                paint.setShader(this.f29884g);
                return;
            }
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.b.d(0.5f, i0.b.d(0.5f, this.f29886j, this.f29887k), this.f29888l));
            } else {
                paint.setColor(i0.b.d(0.5f, this.f29886j, this.f29887k));
            }
        }
    }
}
