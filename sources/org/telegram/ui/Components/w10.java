package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f32064c;
    public float d;
    public float f32065e;
    public float f32066f;
    public RadialGradient f32067g;
    public final int f32068i;
    public int f32069j;
    public int f32070k;
    public int f32071l;
    public float f32062a = -1.0f;
    public float f32063b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32072m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f32073n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f32074o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f32075p = org.telegram.ui.ActionBar.j6.f20618ah;
    public final int f32076q = org.telegram.ui.ActionBar.j6.f20764ih;
    public final int f32077r = org.telegram.ui.ActionBar.j6.f20783jh;
    public final int f32078s = org.telegram.ui.ActionBar.j6.f20803kh;

    public w10(int i10) {
        this.f32068i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32068i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f32072m, false);
            this.f32069j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f32073n, false);
            this.f32070k = w03;
            this.f32067g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f32074o, false);
            this.f32069j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f32075p, false);
            this.f32070k = w05;
            this.f32067g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f32076q, false);
            this.f32069j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f32078s, false);
            this.f32071l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f32077r, false);
            this.f32070k = w08;
            this.f32067g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32068i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20637bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32069j, this.f32070k), this.f32071l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32069j, this.f32070k));
            }
        } else {
            paint.setShader(this.f32067g);
        }
    }
}
