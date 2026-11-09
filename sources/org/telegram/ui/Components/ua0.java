package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class ua0 {
    public final Paint f38673a;
    public final va0 f38674b;
    public final va0 f38675c;
    public final va0 d;
    public final ta0 f38676e;
    public final ta0 f38677f;
    public final float[] f38678g;
    public int h;
    public float f38679i;

    public ua0() {
        Paint paint = new Paint();
        this.f38673a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f38674b = new va0(tileMode);
        this.f38675c = new va0(tileMode);
        this.d = new va0(Shader.TileMode.REPEAT);
        this.f38676e = new ta0(2131624361);
        this.f38677f = new ta0(2131624360);
        this.f38678g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        va0 va0Var = this.f38674b;
        boolean b10 = va0Var.b(bitmap);
        va0 va0Var2 = this.d;
        boolean b11 = b10 | va0Var2.b(bitmap2);
        Paint paint = this.f38673a;
        if (i10 >= 0) {
            va0 va0Var3 = this.f38675c;
            if ((b11 | va0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ta0 ta0Var = this.f38676e;
                ta0Var.f38335a.setInputBuffer("shaderPattern", va0Var2.d);
                ta0Var.f38335a.setInputBuffer("shaderGradient", va0Var.d);
                ta0Var.f38335a.setInputBuffer("shaderGradientSoftLight", va0Var3.d);
                ta0Var.f38335a.setFloatUniform("transformGradient", ta0Var.f38336b);
                ta0Var.f38335a.setFloatUniform("transformPattern", ta0Var.f38337c);
                paint.setShader(ta0Var.f38335a);
                return paint;
            }
        } else {
            float a10 = c8.j9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f38679i != a10 || this.h != 2) {
                this.h = 2;
                this.f38679i = a10;
                ta0 ta0Var2 = this.f38677f;
                ta0Var2.f38335a.setInputBuffer("shaderPattern", va0Var2.d);
                ta0Var2.f38335a.setInputBuffer("shaderGradient", va0Var.d);
                ta0Var2.f38335a.setFloatUniform("intensity", a10);
                ta0Var2.f38335a.setFloatUniform("transformGradient", ta0Var2.f38336b);
                ta0Var2.f38335a.setFloatUniform("transformPattern", ta0Var2.f38337c);
                paint.setShader(ta0Var2.f38335a);
                return paint;
            }
        }
        return paint;
    }
}
