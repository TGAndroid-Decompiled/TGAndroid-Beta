package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class a20 {
    public float f24428c;
    public float d;
    public float f24429e;
    public float f24430f;
    public RadialGradient f24431g;
    public final int f24432i;
    public int f24433j;
    public int f24434k;
    public int f24435l;
    public float f24426a = -1.0f;
    public float f24427b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f24436m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f24437n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f24438o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f24439p = org.telegram.ui.ActionBar.i6.f20771ah;
    public final int f24440q = org.telegram.ui.ActionBar.i6.f20918ih;
    public final int f24441r = org.telegram.ui.ActionBar.i6.f20937jh;
    public final int f24442s = org.telegram.ui.ActionBar.i6.f20957kh;

    public a20(int i10) {
        this.f24432i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f24432i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f24436m, false);
            this.f24433j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f24437n, false);
            this.f24434k = w03;
            this.f24431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f24438o, false);
            this.f24433j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f24439p, false);
            this.f24434k = w05;
            this.f24431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f24440q, false);
            this.f24433j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f24442s, false);
            this.f24435l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f24441r, false);
            this.f24434k = w08;
            this.f24431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f24432i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20790bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f24433j, this.f24434k), this.f24435l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f24433j, this.f24434k));
            }
        } else {
            paint.setShader(this.f24431g);
        }
    }
}
