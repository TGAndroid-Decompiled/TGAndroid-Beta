package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class j20 {
    public float f26161c;
    public float d;
    public float e;
    public float f26162f;
    public RadialGradient f26163g;
    public final int f26164i;
    public int f26165j;
    public int f26166k;
    public int f26167l;
    public float f26159a = -1.0f;
    public float f26160b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26168m = org.telegram.ui.ActionBar.g6.Xg;
    public final int f26169n = org.telegram.ui.ActionBar.g6.Yg;
    public final int f26170o = org.telegram.ui.ActionBar.g6.Zg;
    public final int f26171p = org.telegram.ui.ActionBar.g6.f19853ah;
    public final int f26172q = org.telegram.ui.ActionBar.g6.f19999ih;
    public final int f26173r = org.telegram.ui.ActionBar.g6.f20019jh;
    public final int f26174s = org.telegram.ui.ActionBar.g6.f20038kh;

    public j20(int i10) {
        this.f26164i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26164i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, this.f26168m, false);
            this.f26165j = x02;
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, this.f26169n, false);
            this.f26166k = x03;
            this.f26163g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.g6.x0(null, this.f26170o, false);
            this.f26165j = x04;
            int x05 = org.telegram.ui.ActionBar.g6.x0(null, this.f26171p, false);
            this.f26166k = x05;
            this.f26163g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.g6.x0(null, this.f26172q, false);
            this.f26165j = x06;
            int x07 = org.telegram.ui.ActionBar.g6.x0(null, this.f26174s, false);
            this.f26167l = x07;
            int x08 = org.telegram.ui.ActionBar.g6.x0(null, this.f26173r, false);
            this.f26166k = x08;
            this.f26163g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26164i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19873bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f26165j, this.f26166k), this.f26167l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f26165j, this.f26166k));
            }
        } else {
            paint.setShader(this.f26163g);
        }
    }
}
