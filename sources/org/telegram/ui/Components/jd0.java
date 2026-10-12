package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class jd0 {
    public final Paint f27473a;
    public final kd0 f27474b;
    public final kd0 f27475c;
    public final kd0 d;
    public final id0 f27476e;
    public final id0 f27477f;
    public final float[] f27478g;
    public int h;
    public float f27479i;

    public jd0() {
        Paint paint = new Paint();
        this.f27473a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27474b = new kd0(tileMode);
        this.f27475c = new kd0(tileMode);
        this.d = new kd0(Shader.TileMode.REPEAT);
        this.f27476e = new id0(R.raw.wallpaper_pos_intensity);
        this.f27477f = new id0(R.raw.wallpaper_neg_intensity);
        this.f27478g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        kd0 kd0Var = this.f27474b;
        boolean b10 = kd0Var.b(bitmap);
        kd0 kd0Var2 = this.d;
        boolean b11 = b10 | kd0Var2.b(bitmap2);
        Paint paint = this.f27473a;
        if (i11 >= 0) {
            kd0 kd0Var3 = this.f27475c;
            if ((b11 | kd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                id0 id0Var = this.f27476e;
                id0Var.f27143a.setInputBuffer("shaderPattern", kd0Var2.d);
                id0Var.f27143a.setInputBuffer("shaderGradient", kd0Var.d);
                id0Var.f27143a.setInputBuffer("shaderGradientSoftLight", kd0Var3.d);
                id0Var.f27143a.setFloatUniform("transformGradient", id0Var.f27144b);
                id0Var.f27143a.setFloatUniform("transformPattern", id0Var.f27145c);
                paint.setShader(id0Var.f27143a);
                return paint;
            }
        } else {
            float a2 = w7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27479i != a2 || this.h != 2) {
                this.h = 2;
                this.f27479i = a2;
                id0 id0Var2 = this.f27477f;
                id0Var2.f27143a.setInputBuffer("shaderPattern", kd0Var2.d);
                id0Var2.f27143a.setInputBuffer("shaderGradient", kd0Var.d);
                id0Var2.f27143a.setFloatUniform("intensity", a2);
                id0Var2.f27143a.setFloatUniform("transformGradient", id0Var2.f27144b);
                id0Var2.f27143a.setFloatUniform("transformPattern", id0Var2.f27145c);
                paint.setShader(id0Var2.f27143a);
                return paint;
            }
        }
        return paint;
    }
}
