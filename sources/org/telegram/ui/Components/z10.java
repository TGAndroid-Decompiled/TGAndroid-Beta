package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class z10 {
    public float f30821c;
    public float d;
    public float e;
    public float f30822f;
    public RadialGradient f30823g;
    public final int f30824i;
    public int f30825j;
    public int f30826k;
    public int f30827l;
    public float f30819a = -1.0f;
    public float f30820b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30828m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f30829n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f30830o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f30831p = org.telegram.ui.ActionBar.i6.f19011ah;
    public final int f30832q = org.telegram.ui.ActionBar.i6.f19157ih;
    public final int f30833r = org.telegram.ui.ActionBar.i6.f19176jh;
    public final int f30834s = org.telegram.ui.ActionBar.i6.f19196kh;

    public z10(int i10) {
        this.f30824i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30824i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f30828m, false);
            this.f30825j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f30829n, false);
            this.f30826k = w03;
            this.f30823g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f30830o, false);
            this.f30825j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f30831p, false);
            this.f30826k = w05;
            this.f30823g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f30832q, false);
            this.f30825j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f30834s, false);
            this.f30827l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f30833r, false);
            this.f30826k = w08;
            this.f30823g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30824i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19030bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30825j, this.f30826k), this.f30827l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30825j, this.f30826k));
            }
        } else {
            paint.setShader(this.f30823g);
        }
    }
}
