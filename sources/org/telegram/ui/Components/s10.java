package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class s10 {
    public float f32439c;
    public float d;
    public float f32440e;
    public float f32441f;
    public RadialGradient f32442g;
    public final int f32443i;
    public int f32444j;
    public int f32445k;
    public int f32446l;
    public float f32437a = -1.0f;
    public float f32438b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32447m = org.telegram.ui.ActionBar.g6.Xg;
    public final int f32448n = org.telegram.ui.ActionBar.g6.Yg;
    public final int f32449o = org.telegram.ui.ActionBar.g6.Zg;
    public final int f32450p = org.telegram.ui.ActionBar.g6.f23019ah;
    public final int f32451q = org.telegram.ui.ActionBar.g6.f23162ih;
    public final int f32452r = org.telegram.ui.ActionBar.g6.f23181jh;
    public final int f32453s = org.telegram.ui.ActionBar.g6.f23199kh;

    public s10(int i10) {
        this.f32443i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32443i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, this.f32447m, false);
            this.f32444j = w02;
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, this.f32448n, false);
            this.f32445k = w03;
            this.f32442g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.g6.w0(null, this.f32449o, false);
            this.f32444j = w04;
            int w05 = org.telegram.ui.ActionBar.g6.w0(null, this.f32450p, false);
            this.f32445k = w05;
            this.f32442g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.g6.w0(null, this.f32451q, false);
            this.f32444j = w06;
            int w07 = org.telegram.ui.ActionBar.g6.w0(null, this.f32453s, false);
            this.f32446l = w07;
            int w08 = org.telegram.ui.ActionBar.g6.w0(null, this.f32452r, false);
            this.f32445k = w08;
            this.f32442g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32443i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23038bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32444j, this.f32445k), this.f32446l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32444j, this.f32445k));
            }
        } else {
            paint.setShader(this.f32442g);
        }
    }
}
