package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class ta0 {
    public final Paint f38308a;
    public final ua0 f38309b;
    public final ua0 f38310c;
    public final ua0 d;
    public final sa0 f38311e;
    public final sa0 f38312f;
    public final float[] f38313g;
    public int h;
    public float f38314i;

    public ta0() {
        Paint paint = new Paint();
        this.f38308a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f38309b = new ua0(tileMode);
        this.f38310c = new ua0(tileMode);
        this.d = new ua0(Shader.TileMode.REPEAT);
        this.f38311e = new sa0(2131624361);
        this.f38312f = new sa0(2131624360);
        this.f38313g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        ua0 ua0Var = this.f38309b;
        boolean b10 = ua0Var.b(bitmap);
        ua0 ua0Var2 = this.d;
        boolean b11 = b10 | ua0Var2.b(bitmap2);
        Paint paint = this.f38308a;
        if (i10 >= 0) {
            ua0 ua0Var3 = this.f38310c;
            if ((b11 | ua0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                sa0 sa0Var = this.f38311e;
                sa0Var.f37984a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var.f37984a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var.f37984a.setInputBuffer("shaderGradientSoftLight", ua0Var3.d);
                sa0Var.f37984a.setFloatUniform("transformGradient", sa0Var.f37985b);
                sa0Var.f37984a.setFloatUniform("transformPattern", sa0Var.f37986c);
                paint.setShader(sa0Var.f37984a);
                return paint;
            }
        } else {
            float a10 = c8.j9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f38314i != a10 || this.h != 2) {
                this.h = 2;
                this.f38314i = a10;
                sa0 sa0Var2 = this.f38312f;
                sa0Var2.f37984a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var2.f37984a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var2.f37984a.setFloatUniform("intensity", a10);
                sa0Var2.f37984a.setFloatUniform("transformGradient", sa0Var2.f37985b);
                sa0Var2.f37984a.setFloatUniform("transformPattern", sa0Var2.f37986c);
                paint.setShader(sa0Var2.f37984a);
                return paint;
            }
        }
        return paint;
    }
}
