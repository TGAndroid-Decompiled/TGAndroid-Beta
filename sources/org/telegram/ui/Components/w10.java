package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29478c;
    public float d;
    public float e;
    public float f29479f;
    public RadialGradient f29480g;
    public final int f29481i;
    public int f29482j;
    public int f29483k;
    public int f29484l;
    public float f29476a = -1.0f;
    public float f29477b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29485m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f29486n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f29487o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f29488p = org.telegram.ui.ActionBar.j6.f18817ah;
    public final int f29489q = org.telegram.ui.ActionBar.j6.f18963ih;
    public final int f29490r = org.telegram.ui.ActionBar.j6.f18982jh;
    public final int f29491s = org.telegram.ui.ActionBar.j6.f19002kh;

    public w10(int i10) {
        this.f29481i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29481i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f29485m, false);
            this.f29482j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f29486n, false);
            this.f29483k = w03;
            this.f29480g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f29487o, false);
            this.f29482j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f29488p, false);
            this.f29483k = w05;
            this.f29480g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f29489q, false);
            this.f29482j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f29491s, false);
            this.f29484l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f29490r, false);
            this.f29483k = w08;
            this.f29480g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29481i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18836bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29482j, this.f29483k), this.f29484l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29482j, this.f29483k));
            }
        } else {
            paint.setShader(this.f29480g);
        }
    }
}
