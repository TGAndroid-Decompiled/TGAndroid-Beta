package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f32090c;
    public float d;
    public float f32091e;
    public float f32092f;
    public RadialGradient f32093g;
    public final int f32094i;
    public int f32095j;
    public int f32096k;
    public int f32097l;
    public float f32088a = -1.0f;
    public float f32089b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32098m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f32099n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f32100o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f32101p = org.telegram.ui.ActionBar.j6.f20644ah;
    public final int f32102q = org.telegram.ui.ActionBar.j6.f20790ih;
    public final int f32103r = org.telegram.ui.ActionBar.j6.f20809jh;
    public final int f32104s = org.telegram.ui.ActionBar.j6.f20829kh;

    public w10(int i10) {
        this.f32094i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32094i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f32098m, false);
            this.f32095j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f32099n, false);
            this.f32096k = w03;
            this.f32093g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f32100o, false);
            this.f32095j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f32101p, false);
            this.f32096k = w05;
            this.f32093g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f32102q, false);
            this.f32095j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f32104s, false);
            this.f32097l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f32103r, false);
            this.f32096k = w08;
            this.f32093g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32094i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32095j, this.f32096k), this.f32097l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32095j, this.f32096k));
            }
        } else {
            paint.setShader(this.f32093g);
        }
    }
}
