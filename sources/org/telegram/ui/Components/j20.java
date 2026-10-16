package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class j20 {
    public float f25858c;
    public float d;
    public float e;
    public float f25859f;
    public RadialGradient f25860g;
    public final int f25861i;
    public int f25862j;
    public int f25863k;
    public int f25864l;
    public float f25856a = -1.0f;
    public float f25857b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f25865m = org.telegram.ui.ActionBar.g6.Xg;
    public final int f25866n = org.telegram.ui.ActionBar.g6.Yg;
    public final int f25867o = org.telegram.ui.ActionBar.g6.Zg;
    public final int f25868p = org.telegram.ui.ActionBar.g6.f19553ah;
    public final int f25869q = org.telegram.ui.ActionBar.g6.f19699ih;
    public final int f25870r = org.telegram.ui.ActionBar.g6.f19719jh;
    public final int f25871s = org.telegram.ui.ActionBar.g6.f19738kh;

    public j20(int i10) {
        this.f25861i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f25861i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, this.f25865m, false);
            this.f25862j = x02;
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, this.f25866n, false);
            this.f25863k = x03;
            this.f25860g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.g6.x0(null, this.f25867o, false);
            this.f25862j = x04;
            int x05 = org.telegram.ui.ActionBar.g6.x0(null, this.f25868p, false);
            this.f25863k = x05;
            this.f25860g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.g6.x0(null, this.f25869q, false);
            this.f25862j = x06;
            int x07 = org.telegram.ui.ActionBar.g6.x0(null, this.f25871s, false);
            this.f25864l = x07;
            int x08 = org.telegram.ui.ActionBar.g6.x0(null, this.f25870r, false);
            this.f25863k = x08;
            this.f25860g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f25861i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19573bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f25862j, this.f25863k), this.f25864l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f25862j, this.f25863k));
            }
        } else {
            paint.setShader(this.f25860g);
        }
    }
}
