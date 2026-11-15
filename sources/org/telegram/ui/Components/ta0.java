package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class ta0 {
    public final Paint f39618a;
    public final ua0 f39619b;
    public final ua0 f39620c;
    public final ua0 d;
    public final sa0 f39621e;
    public final sa0 f39622f;
    public final float[] f39623g;
    public int h;
    public float f39624i;

    public ta0() {
        Paint paint = new Paint();
        this.f39618a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39619b = new ua0(tileMode);
        this.f39620c = new ua0(tileMode);
        this.d = new ua0(Shader.TileMode.REPEAT);
        this.f39621e = new sa0(2131624362);
        this.f39622f = new sa0(2131624361);
        this.f39623g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        ua0 ua0Var = this.f39619b;
        boolean b10 = ua0Var.b(bitmap);
        ua0 ua0Var2 = this.d;
        boolean b11 = b10 | ua0Var2.b(bitmap2);
        Paint paint = this.f39618a;
        if (i10 >= 0) {
            ua0 ua0Var3 = this.f39620c;
            if ((b11 | ua0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                sa0 sa0Var = this.f39621e;
                sa0Var.f39262a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var.f39262a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var.f39262a.setInputBuffer("shaderGradientSoftLight", ua0Var3.d);
                sa0Var.f39262a.setFloatUniform("transformGradient", sa0Var.f39263b);
                sa0Var.f39262a.setFloatUniform("transformPattern", sa0Var.f39264c);
                paint.setShader(sa0Var.f39262a);
                return paint;
            }
        } else {
            float a10 = c8.i9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f39624i != a10 || this.h != 2) {
                this.h = 2;
                this.f39624i = a10;
                sa0 sa0Var2 = this.f39622f;
                sa0Var2.f39262a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var2.f39262a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var2.f39262a.setFloatUniform("intensity", a10);
                sa0Var2.f39262a.setFloatUniform("transformGradient", sa0Var2.f39263b);
                sa0Var2.f39262a.setFloatUniform("transformPattern", sa0Var2.f39264c);
                paint.setShader(sa0Var2.f39262a);
                return paint;
            }
        }
        return paint;
    }
}
