package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f30217c;
    public float d;
    public float e;
    public float f30218f;
    public RadialGradient f30219g;
    public final int f30220i;
    public int f30221j;
    public int f30222k;
    public int f30223l;
    public float f30215a = -1.0f;
    public float f30216b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30224m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f30225n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f30226o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f30227p = org.telegram.ui.ActionBar.h6.f18999ah;
    public final int f30228q = org.telegram.ui.ActionBar.h6.f19144ih;
    public final int f30229r = org.telegram.ui.ActionBar.h6.f19163jh;
    public final int f30230s = org.telegram.ui.ActionBar.h6.f19183kh;

    public x10(int i10) {
        this.f30220i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30220i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f30224m, false);
            this.f30221j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f30225n, false);
            this.f30222k = w03;
            this.f30219g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f30226o, false);
            this.f30221j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f30227p, false);
            this.f30222k = w05;
            this.f30219g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f30228q, false);
            this.f30221j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f30230s, false);
            this.f30223l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f30229r, false);
            this.f30222k = w08;
            this.f30219g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30220i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19018bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30221j, this.f30222k), this.f30223l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30221j, this.f30222k));
            }
        } else {
            paint.setShader(this.f30219g);
        }
    }
}
