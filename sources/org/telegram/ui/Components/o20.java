package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class o20 {
    public float f29358c;
    public float d;
    public float f29359e;
    public float f29360f;
    public RadialGradient f29361g;
    public final int f29362i;
    public int f29363j;
    public int f29364k;
    public int f29365l;
    public float f29356a = -1.0f;
    public float f29357b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29366m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f29367n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f29368o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f29369p = org.telegram.ui.ActionBar.h6.f20776ah;
    public final int f29370q = org.telegram.ui.ActionBar.h6.f20923ih;
    public final int f29371r = org.telegram.ui.ActionBar.h6.f20941jh;
    public final int f29372s = org.telegram.ui.ActionBar.h6.f20961kh;

    public o20(int i10) {
        this.f29362i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29362i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.f29366m, false);
            this.f29363j = x02;
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, this.f29367n, false);
            this.f29364k = x03;
            this.f29361g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, this.f29368o, false);
            this.f29363j = x04;
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, this.f29369p, false);
            this.f29364k = x05;
            this.f29361g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.h6.x0(null, this.f29370q, false);
            this.f29363j = x06;
            int x07 = org.telegram.ui.ActionBar.h6.x0(null, this.f29372s, false);
            this.f29365l = x07;
            int x08 = org.telegram.ui.ActionBar.h6.x0(null, this.f29371r, false);
            this.f29364k = x08;
            this.f29361g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29362i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20796bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29363j, this.f29364k), this.f29365l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29363j, this.f29364k));
            }
        } else {
            paint.setShader(this.f29361g);
        }
    }
}
