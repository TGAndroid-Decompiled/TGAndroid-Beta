package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f32892c;
    public float d;
    public float f32893e;
    public float f32894f;
    public RadialGradient f32895g;
    public final int f32896i;
    public int f32897j;
    public int f32898k;
    public int f32899l;
    public float f32890a = -1.0f;
    public float f32891b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32900m = org.telegram.ui.ActionBar.k6.Xg;
    public final int f32901n = org.telegram.ui.ActionBar.k6.Yg;
    public final int f32902o = org.telegram.ui.ActionBar.k6.Zg;
    public final int f32903p = org.telegram.ui.ActionBar.k6.f21615ah;
    public final int f32904q = org.telegram.ui.ActionBar.k6.f21759ih;
    public final int f32905r = org.telegram.ui.ActionBar.k6.f21777jh;
    public final int f32906s = org.telegram.ui.ActionBar.k6.f21796kh;

    public x10(int i10) {
        this.f32896i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32896i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, this.f32900m, false);
            this.f32897j = w02;
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, this.f32901n, false);
            this.f32898k = w03;
            this.f32895g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(null, this.f32902o, false);
            this.f32897j = w04;
            int w05 = org.telegram.ui.ActionBar.k6.w0(null, this.f32903p, false);
            this.f32898k = w05;
            this.f32895g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.k6.w0(null, this.f32904q, false);
            this.f32897j = w06;
            int w07 = org.telegram.ui.ActionBar.k6.w0(null, this.f32906s, false);
            this.f32899l = w07;
            int w08 = org.telegram.ui.ActionBar.k6.w0(null, this.f32905r, false);
            this.f32898k = w08;
            this.f32895g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32896i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21634bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32897j, this.f32898k), this.f32899l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32897j, this.f32898k));
            }
        } else {
            paint.setShader(this.f32895g);
        }
    }
}
