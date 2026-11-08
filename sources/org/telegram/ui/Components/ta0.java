package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class ta0 {
    public final Paint f38316a;
    public final ua0 f38317b;
    public final ua0 f38318c;
    public final ua0 d;
    public final sa0 f38319e;
    public final sa0 f38320f;
    public final float[] f38321g;
    public int h;
    public float f38322i;

    public ta0() {
        Paint paint = new Paint();
        this.f38316a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f38317b = new ua0(tileMode);
        this.f38318c = new ua0(tileMode);
        this.d = new ua0(Shader.TileMode.REPEAT);
        this.f38319e = new sa0(2131624361);
        this.f38320f = new sa0(2131624360);
        this.f38321g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        ua0 ua0Var = this.f38317b;
        boolean b10 = ua0Var.b(bitmap);
        ua0 ua0Var2 = this.d;
        boolean b11 = b10 | ua0Var2.b(bitmap2);
        Paint paint = this.f38316a;
        if (i10 >= 0) {
            ua0 ua0Var3 = this.f38318c;
            if ((b11 | ua0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                sa0 sa0Var = this.f38319e;
                sa0Var.f37964a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var.f37964a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var.f37964a.setInputBuffer("shaderGradientSoftLight", ua0Var3.d);
                sa0Var.f37964a.setFloatUniform("transformGradient", sa0Var.f37965b);
                sa0Var.f37964a.setFloatUniform("transformPattern", sa0Var.f37966c);
                paint.setShader(sa0Var.f37964a);
                return paint;
            }
        } else {
            float a10 = c8.j9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f38322i != a10 || this.h != 2) {
                this.h = 2;
                this.f38322i = a10;
                sa0 sa0Var2 = this.f38320f;
                sa0Var2.f37964a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var2.f37964a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var2.f37964a.setFloatUniform("intensity", a10);
                sa0Var2.f37964a.setFloatUniform("transformGradient", sa0Var2.f37965b);
                sa0Var2.f37964a.setFloatUniform("transformPattern", sa0Var2.f37966c);
                paint.setShader(sa0Var2.f37964a);
                return paint;
            }
        }
        return paint;
    }
}
