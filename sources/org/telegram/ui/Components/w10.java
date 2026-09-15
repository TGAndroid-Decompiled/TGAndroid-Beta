package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29522c;
    public float d;
    public float e;
    public float f29523f;
    public RadialGradient f29524g;
    public final int f29525i;
    public int f29526j;
    public int f29527k;
    public int f29528l;
    public float f29520a = -1.0f;
    public float f29521b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29529m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f29530n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f29531o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f29532p = org.telegram.ui.ActionBar.i6.f18790ah;
    public final int f29533q = org.telegram.ui.ActionBar.i6.f18936ih;
    public final int f29534r = org.telegram.ui.ActionBar.i6.f18955jh;
    public final int f29535s = org.telegram.ui.ActionBar.i6.f18975kh;

    public w10(int i10) {
        this.f29525i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29525i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f29529m, false);
            this.f29526j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f29530n, false);
            this.f29527k = w03;
            this.f29524g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f29531o, false);
            this.f29526j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f29532p, false);
            this.f29527k = w05;
            this.f29524g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f29533q, false);
            this.f29526j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f29535s, false);
            this.f29528l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f29534r, false);
            this.f29527k = w08;
            this.f29524g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29525i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18809bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29526j, this.f29527k), this.f29528l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29526j, this.f29527k));
            }
        } else {
            paint.setShader(this.f29524g);
        }
    }
}
