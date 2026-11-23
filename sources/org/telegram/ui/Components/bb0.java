package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class bb0 {
    public final Paint f33726a;
    public final cb0 f33727b;
    public final cb0 f33728c;
    public final cb0 d;
    public final ab0 f33729e;
    public final ab0 f33730f;
    public final float[] f33731g;
    public int h;
    public float f33732i;

    public bb0() {
        Paint paint = new Paint();
        this.f33726a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33727b = new cb0(tileMode);
        this.f33728c = new cb0(tileMode);
        this.d = new cb0(Shader.TileMode.REPEAT);
        this.f33729e = new ab0(2131624362);
        this.f33730f = new ab0(2131624361);
        this.f33731g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        cb0 cb0Var = this.f33727b;
        boolean b10 = cb0Var.b(bitmap);
        cb0 cb0Var2 = this.d;
        boolean b11 = b10 | cb0Var2.b(bitmap2);
        Paint paint = this.f33726a;
        if (i10 >= 0) {
            cb0 cb0Var3 = this.f33728c;
            if ((b11 | cb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ab0 ab0Var = this.f33729e;
                ab0Var.f33453a.setInputBuffer("shaderPattern", cb0Var2.d);
                ab0Var.f33453a.setInputBuffer("shaderGradient", cb0Var.d);
                ab0Var.f33453a.setInputBuffer("shaderGradientSoftLight", cb0Var3.d);
                ab0Var.f33453a.setFloatUniform("transformGradient", ab0Var.f33454b);
                ab0Var.f33453a.setFloatUniform("transformPattern", ab0Var.f33455c);
                paint.setShader(ab0Var.f33453a);
                return paint;
            }
        } else {
            float a10 = c8.m9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f33732i != a10 || this.h != 2) {
                this.h = 2;
                this.f33732i = a10;
                ab0 ab0Var2 = this.f33730f;
                ab0Var2.f33453a.setInputBuffer("shaderPattern", cb0Var2.d);
                ab0Var2.f33453a.setInputBuffer("shaderGradient", cb0Var.d);
                ab0Var2.f33453a.setFloatUniform("intensity", a10);
                ab0Var2.f33453a.setFloatUniform("transformGradient", ab0Var2.f33454b);
                ab0Var2.f33453a.setFloatUniform("transformPattern", ab0Var2.f33455c);
                paint.setShader(ab0Var2.f33453a);
                return paint;
            }
        }
        return paint;
    }
}
