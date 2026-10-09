package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class n20 {
    public float f29011c;
    public float d;
    public float f29012e;
    public float f29013f;
    public RadialGradient f29014g;
    public final int f29015i;
    public int f29016j;
    public int f29017k;
    public int f29018l;
    public float f29009a = -1.0f;
    public float f29010b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29019m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f29020n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f29021o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f29022p = org.telegram.ui.ActionBar.i6.f20751ah;
    public final int f29023q = org.telegram.ui.ActionBar.i6.f20898ih;
    public final int f29024r = org.telegram.ui.ActionBar.i6.f20916jh;
    public final int f29025s = org.telegram.ui.ActionBar.i6.f20936kh;

    public n20(int i10) {
        this.f29015i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29015i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, this.f29019m, false);
            this.f29016j = x02;
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, this.f29020n, false);
            this.f29017k = x03;
            this.f29014g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.i6.x0(null, this.f29021o, false);
            this.f29016j = x04;
            int x05 = org.telegram.ui.ActionBar.i6.x0(null, this.f29022p, false);
            this.f29017k = x05;
            this.f29014g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.i6.x0(null, this.f29023q, false);
            this.f29016j = x06;
            int x07 = org.telegram.ui.ActionBar.i6.x0(null, this.f29025s, false);
            this.f29018l = x07;
            int x08 = org.telegram.ui.ActionBar.i6.x0(null, this.f29024r, false);
            this.f29017k = x08;
            this.f29014g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29015i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20771bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29016j, this.f29017k), this.f29018l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29016j, this.f29017k));
            }
        } else {
            paint.setShader(this.f29014g);
        }
    }
}
