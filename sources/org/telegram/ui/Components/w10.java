package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29475c;
    public float d;
    public float e;
    public float f29476f;
    public RadialGradient f29477g;
    public final int f29478i;
    public int f29479j;
    public int f29480k;
    public int f29481l;
    public float f29473a = -1.0f;
    public float f29474b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29482m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f29483n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f29484o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f29485p = org.telegram.ui.ActionBar.j6.f18816ah;
    public final int f29486q = org.telegram.ui.ActionBar.j6.f18962ih;
    public final int f29487r = org.telegram.ui.ActionBar.j6.f18981jh;
    public final int f29488s = org.telegram.ui.ActionBar.j6.f19001kh;

    public w10(int i10) {
        this.f29478i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29478i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f29482m, false);
            this.f29479j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f29483n, false);
            this.f29480k = w03;
            this.f29477g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f29484o, false);
            this.f29479j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f29485p, false);
            this.f29480k = w05;
            this.f29477g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f29486q, false);
            this.f29479j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f29488s, false);
            this.f29481l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f29487r, false);
            this.f29480k = w08;
            this.f29477g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29478i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18835bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29479j, this.f29480k), this.f29481l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29479j, this.f29480k));
            }
        } else {
            paint.setShader(this.f29477g);
        }
    }
}
