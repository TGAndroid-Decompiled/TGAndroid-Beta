package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26135c;
    public float d;
    public float e;
    public float f26136f;
    public RadialGradient f26137g;
    public final int f26138i;
    public int f26139j;
    public int f26140k;
    public int f26141l;
    public float f26133a = -1.0f;
    public float f26134b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26142m = org.telegram.ui.ActionBar.k6.Xg;
    public final int f26143n = org.telegram.ui.ActionBar.k6.Yg;
    public final int f26144o = org.telegram.ui.ActionBar.k6.Zg;
    public final int f26145p = org.telegram.ui.ActionBar.k6.f21135ah;
    public final int f26146q = org.telegram.ui.ActionBar.k6.f21281ih;
    public final int f26147r = org.telegram.ui.ActionBar.k6.f21301jh;
    public final int f26148s = org.telegram.ui.ActionBar.k6.f21320kh;

    public f20(int i10) {
        this.f26138i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26138i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f26142m, false);
            this.f26139j = x02;
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, this.f26143n, false);
            this.f26140k = x03;
            this.f26137g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, this.f26144o, false);
            this.f26139j = x04;
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, this.f26145p, false);
            this.f26140k = x05;
            this.f26137g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.k6.x0(null, this.f26146q, false);
            this.f26139j = x06;
            int x07 = org.telegram.ui.ActionBar.k6.x0(null, this.f26148s, false);
            this.f26141l = x07;
            int x08 = org.telegram.ui.ActionBar.k6.x0(null, this.f26147r, false);
            this.f26140k = x08;
            this.f26137g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26138i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21155bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26139j, this.f26140k), this.f26141l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26139j, this.f26140k));
            }
        } else {
            paint.setShader(this.f26137g);
        }
    }
}
