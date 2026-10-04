package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class a20 {
    public float f24433c;
    public float d;
    public float f24434e;
    public float f24435f;
    public RadialGradient f24436g;
    public final int f24437i;
    public int f24438j;
    public int f24439k;
    public int f24440l;
    public float f24431a = -1.0f;
    public float f24432b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f24441m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f24442n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f24443o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f24444p = org.telegram.ui.ActionBar.i6.f20776ah;
    public final int f24445q = org.telegram.ui.ActionBar.i6.f20923ih;
    public final int f24446r = org.telegram.ui.ActionBar.i6.f20942jh;
    public final int f24447s = org.telegram.ui.ActionBar.i6.f20962kh;

    public a20(int i10) {
        this.f24437i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f24437i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f24441m, false);
            this.f24438j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f24442n, false);
            this.f24439k = w03;
            this.f24436g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f24443o, false);
            this.f24438j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f24444p, false);
            this.f24439k = w05;
            this.f24436g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f24445q, false);
            this.f24438j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f24447s, false);
            this.f24440l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f24446r, false);
            this.f24439k = w08;
            this.f24436g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f24437i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20795bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f24438j, this.f24439k), this.f24440l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f24438j, this.f24439k));
            }
        } else {
            paint.setShader(this.f24436g);
        }
    }
}
