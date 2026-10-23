package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f26048c;
    public float d;
    public float e;
    public float f26049f;
    public RadialGradient f26050g;
    public final int f26051i;
    public int f26052j;
    public int f26053k;
    public int f26054l;
    public float f26046a = -1.0f;
    public float f26047b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f26055m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f26056n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f26057o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f26058p = org.telegram.ui.ActionBar.h6.f20946ah;
    public final int f26059q = org.telegram.ui.ActionBar.h6.f21092ih;
    public final int f26060r = org.telegram.ui.ActionBar.h6.f21112jh;
    public final int f26061s = org.telegram.ui.ActionBar.h6.f21131kh;

    public f20(int i10) {
        this.f26051i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f26051i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f26055m, false);
            this.f26052j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f26056n, false);
            this.f26053k = x03;
            this.f26050g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f26057o, false);
            this.f26052j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f26058p, false);
            this.f26053k = x05;
            this.f26050g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f26059q, false);
            this.f26052j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f26061s, false);
            this.f26054l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f26060r, false);
            this.f26053k = x08;
            this.f26050g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f26051i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20966bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.f26052j, this.f26053k), this.f26054l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.f26052j, this.f26053k));
            }
        } else {
            paint.setShader(this.f26050g);
        }
    }
}
