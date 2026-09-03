package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f30429c;
    public float d;
    public float e;
    public float f30430f;
    public RadialGradient f30431g;
    public final int f30432i;
    public int f30433j;
    public int f30434k;
    public int f30435l;
    public float f30427a = -1.0f;
    public float f30428b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f30436m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f30437n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f30438o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f30439p = org.telegram.ui.ActionBar.j6.f19837ah;
    public final int f30440q = org.telegram.ui.ActionBar.j6.f19980ih;
    public final int f30441r = org.telegram.ui.ActionBar.j6.f19998jh;
    public final int f30442s = org.telegram.ui.ActionBar.j6.f20017kh;

    public x10(int i10) {
        this.f30432i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f30432i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f30436m, false);
            this.f30433j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f30437n, false);
            this.f30434k = w03;
            this.f30431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f30438o, false);
            this.f30433j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f30439p, false);
            this.f30434k = w05;
            this.f30431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f30440q, false);
            this.f30433j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f30442s, false);
            this.f30435l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f30441r, false);
            this.f30434k = w08;
            this.f30431g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f30432i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19856bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f30433j, this.f30434k), this.f30435l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f30433j, this.f30434k));
            }
        } else {
            paint.setShader(this.f30431g);
        }
    }
}
