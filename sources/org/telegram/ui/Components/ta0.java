package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class ta0 {
    public final Paint f39621a;
    public final ua0 f39622b;
    public final ua0 f39623c;
    public final ua0 d;
    public final sa0 f39624e;
    public final sa0 f39625f;
    public final float[] f39626g;
    public int h;
    public float f39627i;

    public ta0() {
        Paint paint = new Paint();
        this.f39621a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39622b = new ua0(tileMode);
        this.f39623c = new ua0(tileMode);
        this.d = new ua0(Shader.TileMode.REPEAT);
        this.f39624e = new sa0(2131624362);
        this.f39625f = new sa0(2131624361);
        this.f39626g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        ua0 ua0Var = this.f39622b;
        boolean b10 = ua0Var.b(bitmap);
        ua0 ua0Var2 = this.d;
        boolean b11 = b10 | ua0Var2.b(bitmap2);
        Paint paint = this.f39621a;
        if (i10 >= 0) {
            ua0 ua0Var3 = this.f39623c;
            if ((b11 | ua0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                sa0 sa0Var = this.f39624e;
                sa0Var.f39264a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var.f39264a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var.f39264a.setInputBuffer("shaderGradientSoftLight", ua0Var3.d);
                sa0Var.f39264a.setFloatUniform("transformGradient", sa0Var.f39265b);
                sa0Var.f39264a.setFloatUniform("transformPattern", sa0Var.f39266c);
                paint.setShader(sa0Var.f39264a);
                return paint;
            }
        } else {
            float a10 = c8.i9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f39627i != a10 || this.h != 2) {
                this.h = 2;
                this.f39627i = a10;
                sa0 sa0Var2 = this.f39625f;
                sa0Var2.f39264a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var2.f39264a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var2.f39264a.setFloatUniform("intensity", a10);
                sa0Var2.f39264a.setFloatUniform("transformGradient", sa0Var2.f39265b);
                sa0Var2.f39264a.setFloatUniform("transformPattern", sa0Var2.f39266c);
                paint.setShader(sa0Var2.f39264a);
                return paint;
            }
        }
        return paint;
    }
}
