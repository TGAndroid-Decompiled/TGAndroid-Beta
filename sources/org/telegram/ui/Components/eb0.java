package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class eb0 {
    public final Paint f34717a;
    public final fb0 f34718b;
    public final fb0 f34719c;
    public final fb0 d;
    public final db0 f34720e;
    public final db0 f34721f;
    public final float[] f34722g;
    public int h;
    public float f34723i;

    public eb0() {
        Paint paint = new Paint();
        this.f34717a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f34718b = new fb0(tileMode);
        this.f34719c = new fb0(tileMode);
        this.d = new fb0(Shader.TileMode.REPEAT);
        this.f34720e = new db0(2131624362);
        this.f34721f = new db0(2131624361);
        this.f34722g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        fb0 fb0Var = this.f34718b;
        boolean b10 = fb0Var.b(bitmap);
        fb0 fb0Var2 = this.d;
        boolean b11 = b10 | fb0Var2.b(bitmap2);
        Paint paint = this.f34717a;
        if (i10 >= 0) {
            fb0 fb0Var3 = this.f34719c;
            if ((b11 | fb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                db0 db0Var = this.f34720e;
                db0Var.f34463a.setInputBuffer("shaderPattern", fb0Var2.d);
                db0Var.f34463a.setInputBuffer("shaderGradient", fb0Var.d);
                db0Var.f34463a.setInputBuffer("shaderGradientSoftLight", fb0Var3.d);
                db0Var.f34463a.setFloatUniform("transformGradient", db0Var.f34464b);
                db0Var.f34463a.setFloatUniform("transformPattern", db0Var.f34465c);
                paint.setShader(db0Var.f34463a);
                return paint;
            }
        } else {
            float a10 = c8.l9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f34723i != a10 || this.h != 2) {
                this.h = 2;
                this.f34723i = a10;
                db0 db0Var2 = this.f34721f;
                db0Var2.f34463a.setInputBuffer("shaderPattern", fb0Var2.d);
                db0Var2.f34463a.setInputBuffer("shaderGradient", fb0Var.d);
                db0Var2.f34463a.setFloatUniform("intensity", a10);
                db0Var2.f34463a.setFloatUniform("transformGradient", db0Var2.f34464b);
                db0Var2.f34463a.setFloatUniform("transformPattern", db0Var2.f34465c);
                paint.setShader(db0Var2.f34463a);
                return paint;
            }
        }
        return paint;
    }
}
