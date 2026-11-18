package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class db0 {
    public final Paint f34362a;
    public final eb0 f34363b;
    public final eb0 f34364c;
    public final eb0 d;
    public final cb0 f34365e;
    public final cb0 f34366f;
    public final float[] f34367g;
    public int h;
    public float f34368i;

    public db0() {
        Paint paint = new Paint();
        this.f34362a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f34363b = new eb0(tileMode);
        this.f34364c = new eb0(tileMode);
        this.d = new eb0(Shader.TileMode.REPEAT);
        this.f34365e = new cb0(2131624362);
        this.f34366f = new cb0(2131624361);
        this.f34367g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        eb0 eb0Var = this.f34363b;
        boolean b10 = eb0Var.b(bitmap);
        eb0 eb0Var2 = this.d;
        boolean b11 = b10 | eb0Var2.b(bitmap2);
        Paint paint = this.f34362a;
        if (i10 >= 0) {
            eb0 eb0Var3 = this.f34364c;
            if ((b11 | eb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                cb0 cb0Var = this.f34365e;
                cb0Var.f33960a.setInputBuffer("shaderPattern", eb0Var2.d);
                cb0Var.f33960a.setInputBuffer("shaderGradient", eb0Var.d);
                cb0Var.f33960a.setInputBuffer("shaderGradientSoftLight", eb0Var3.d);
                cb0Var.f33960a.setFloatUniform("transformGradient", cb0Var.f33961b);
                cb0Var.f33960a.setFloatUniform("transformPattern", cb0Var.f33962c);
                paint.setShader(cb0Var.f33960a);
                return paint;
            }
        } else {
            float a10 = c8.l9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f34368i != a10 || this.h != 2) {
                this.h = 2;
                this.f34368i = a10;
                cb0 cb0Var2 = this.f34366f;
                cb0Var2.f33960a.setInputBuffer("shaderPattern", eb0Var2.d);
                cb0Var2.f33960a.setInputBuffer("shaderGradient", eb0Var.d);
                cb0Var2.f33960a.setFloatUniform("intensity", a10);
                cb0Var2.f33960a.setFloatUniform("transformGradient", cb0Var2.f33961b);
                cb0Var2.f33960a.setFloatUniform("transformPattern", cb0Var2.f33962c);
                paint.setShader(cb0Var2.f33960a);
                return paint;
            }
        }
        return paint;
    }
}
