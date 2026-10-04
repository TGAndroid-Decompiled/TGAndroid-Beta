package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class a20 {
    public float f24429c;
    public float d;
    public float f24430e;
    public float f24431f;
    public RadialGradient f24432g;
    public final int f24433i;
    public int f24434j;
    public int f24435k;
    public int f24436l;
    public float f24427a = -1.0f;
    public float f24428b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f24437m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f24438n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f24439o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f24440p = org.telegram.ui.ActionBar.i6.f20772ah;
    public final int f24441q = org.telegram.ui.ActionBar.i6.f20919ih;
    public final int f24442r = org.telegram.ui.ActionBar.i6.f20938jh;
    public final int f24443s = org.telegram.ui.ActionBar.i6.f20958kh;

    public a20(int i10) {
        this.f24433i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f24433i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f24437m, false);
            this.f24434j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f24438n, false);
            this.f24435k = w03;
            this.f24432g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f24439o, false);
            this.f24434j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f24440p, false);
            this.f24435k = w05;
            this.f24432g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f24441q, false);
            this.f24434j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f24443s, false);
            this.f24436l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f24442r, false);
            this.f24435k = w08;
            this.f24432g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f24433i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20791bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f24434j, this.f24435k), this.f24436l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f24434j, this.f24435k));
            }
        } else {
            paint.setShader(this.f24432g);
        }
    }
}
