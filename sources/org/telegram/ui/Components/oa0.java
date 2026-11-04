package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class oa0 {
    public final Paint f36791a;
    public final pa0 f36792b;
    public final pa0 f36793c;
    public final pa0 d;
    public final na0 f36794e;
    public final na0 f36795f;
    public final float[] f36796g;
    public int h;
    public float f36797i;

    public oa0() {
        Paint paint = new Paint();
        this.f36791a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f36792b = new pa0(tileMode);
        this.f36793c = new pa0(tileMode);
        this.d = new pa0(Shader.TileMode.REPEAT);
        this.f36794e = new na0(2131624361);
        this.f36795f = new na0(2131624360);
        this.f36796g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i3, int i10) {
        pa0 pa0Var = this.f36792b;
        boolean b10 = pa0Var.b(bitmap);
        pa0 pa0Var2 = this.d;
        boolean b11 = b10 | pa0Var2.b(bitmap2);
        Paint paint = this.f36791a;
        if (i10 >= 0) {
            pa0 pa0Var3 = this.f36793c;
            if ((b11 | pa0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                na0 na0Var = this.f36794e;
                na0Var.f36423a.setInputBuffer("shaderPattern", pa0Var2.d);
                na0Var.f36423a.setInputBuffer("shaderGradient", pa0Var.d);
                na0Var.f36423a.setInputBuffer("shaderGradientSoftLight", pa0Var3.d);
                na0Var.f36423a.setFloatUniform("transformGradient", na0Var.f36424b);
                na0Var.f36423a.setFloatUniform("transformPattern", na0Var.f36425c);
                paint.setShader(na0Var.f36423a);
                return paint;
            }
        } else {
            float a10 = b8.be.a((i3 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f36797i != a10 || this.h != 2) {
                this.h = 2;
                this.f36797i = a10;
                na0 na0Var2 = this.f36795f;
                na0Var2.f36423a.setInputBuffer("shaderPattern", pa0Var2.d);
                na0Var2.f36423a.setInputBuffer("shaderGradient", pa0Var.d);
                na0Var2.f36423a.setFloatUniform("intensity", a10);
                na0Var2.f36423a.setFloatUniform("transformGradient", na0Var2.f36424b);
                na0Var2.f36423a.setFloatUniform("transformPattern", na0Var2.f36425c);
                paint.setShader(na0Var2.f36423a);
                return paint;
            }
        }
        return paint;
    }
}
