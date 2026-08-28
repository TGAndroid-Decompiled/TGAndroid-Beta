package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class h10 {
    public float f28915c;
    public float d;
    public float f28916e;
    public float f28917f;
    public RadialGradient f28918g;
    public final int f28919i;
    public int f28920j;
    public int f28921k;
    public int f28922l;
    public float f28913a = -1.0f;
    public float f28914b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f28923m = org.telegram.ui.ActionBar.f6.Xg;
    public final int f28924n = org.telegram.ui.ActionBar.f6.Yg;
    public final int f28925o = org.telegram.ui.ActionBar.f6.Zg;
    public final int f28926p = org.telegram.ui.ActionBar.f6.f22957ah;
    public final int f28927q = org.telegram.ui.ActionBar.f6.f23101ih;
    public final int f28928r = org.telegram.ui.ActionBar.f6.f23119jh;
    public final int f28929s = org.telegram.ui.ActionBar.f6.f23137kh;

    public h10(int i9) {
        this.f28919i = i9;
        a();
    }

    public final void a() {
        int i9 = this.f28919i;
        if (i9 == 0) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, this.f28923m, false);
            this.f28920j = w02;
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, this.f28924n, false);
            this.f28921k = w03;
            this.f28918g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i9 == 1) {
            int w04 = org.telegram.ui.ActionBar.f6.w0(null, this.f28925o, false);
            this.f28920j = w04;
            int w05 = org.telegram.ui.ActionBar.f6.w0(null, this.f28926p, false);
            this.f28921k = w05;
            this.f28918g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i9 == 3) {
            int w06 = org.telegram.ui.ActionBar.f6.w0(null, this.f28927q, false);
            this.f28920j = w06;
            int w07 = org.telegram.ui.ActionBar.f6.w0(null, this.f28929s, false);
            this.f28922l = w07;
            int w08 = org.telegram.ui.ActionBar.f6.w0(null, this.f28928r, false);
            this.f28921k = w08;
            this.f28918g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i9 = this.f28919i;
        if (i9 != 0 && i9 != 1 && i9 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22975bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i9 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f28920j, this.f28921k), this.f28922l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f28920j, this.f28921k));
            }
        } else {
            paint.setShader(this.f28918g);
        }
    }
}
