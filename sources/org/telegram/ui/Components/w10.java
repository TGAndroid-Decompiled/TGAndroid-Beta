package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f29519c;
    public float d;
    public float e;
    public float f29520f;
    public RadialGradient f29521g;
    public final int f29522i;
    public int f29523j;
    public int f29524k;
    public int f29525l;
    public float f29517a = -1.0f;
    public float f29518b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29526m = org.telegram.ui.ActionBar.i6.Xg;
    public final int f29527n = org.telegram.ui.ActionBar.i6.Yg;
    public final int f29528o = org.telegram.ui.ActionBar.i6.Zg;
    public final int f29529p = org.telegram.ui.ActionBar.i6.f18788ah;
    public final int f29530q = org.telegram.ui.ActionBar.i6.f18933ih;
    public final int f29531r = org.telegram.ui.ActionBar.i6.f18952jh;
    public final int f29532s = org.telegram.ui.ActionBar.i6.f18972kh;

    public w10(int i10) {
        this.f29522i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29522i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.f29526m, false);
            this.f29523j = w02;
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, this.f29527n, false);
            this.f29524k = w03;
            this.f29521g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.i6.w0(null, this.f29528o, false);
            this.f29523j = w04;
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, this.f29529p, false);
            this.f29524k = w05;
            this.f29521g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.i6.w0(null, this.f29530q, false);
            this.f29523j = w06;
            int w07 = org.telegram.ui.ActionBar.i6.w0(null, this.f29532s, false);
            this.f29525l = w07;
            int w08 = org.telegram.ui.ActionBar.i6.w0(null, this.f29531r, false);
            this.f29524k = w08;
            this.f29521g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29522i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18807bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29523j, this.f29524k), this.f29525l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29523j, this.f29524k));
            }
        } else {
            paint.setShader(this.f29521g);
        }
    }
}
