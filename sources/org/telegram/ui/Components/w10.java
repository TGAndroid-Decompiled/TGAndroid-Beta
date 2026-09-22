package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29886c;
    public float d;
    public float e;
    public float f29887f;
    public RadialGradient f29888g;
    public final int f29889i;
    public int f29890j;
    public int f29891k;
    public int f29892l;
    public float f29884a = -1.0f;
    public float f29885b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29893m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f29894n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f29895o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f29896p = org.telegram.ui.ActionBar.j6.f19063ah;
    public final int f29897q = org.telegram.ui.ActionBar.j6.f19209ih;
    public final int f29898r = org.telegram.ui.ActionBar.j6.f19228jh;
    public final int f29899s = org.telegram.ui.ActionBar.j6.f19248kh;

    public w10(int i10) {
        this.f29889i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29889i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f29893m, false);
            this.f29890j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f29894n, false);
            this.f29891k = w03;
            this.f29888g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f29895o, false);
            this.f29890j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f29896p, false);
            this.f29891k = w05;
            this.f29888g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f29897q, false);
            this.f29890j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f29899s, false);
            this.f29892l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f29898r, false);
            this.f29891k = w08;
            this.f29888g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29889i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19082bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29890j, this.f29891k), this.f29892l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29890j, this.f29891k));
            }
        } else {
            paint.setShader(this.f29888g);
        }
    }
}
