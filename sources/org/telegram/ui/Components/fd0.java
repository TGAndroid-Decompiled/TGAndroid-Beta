package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class fd0 {
    public final Paint f26348a;
    public final gd0 f26349b;
    public final gd0 f26350c;
    public final gd0 d;
    public final ed0 f26351e;
    public final ed0 f26352f;
    public final float[] f26353g;
    public int h;
    public float f26354i;

    public fd0() {
        Paint paint = new Paint();
        this.f26348a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26349b = new gd0(tileMode);
        this.f26350c = new gd0(tileMode);
        this.d = new gd0(Shader.TileMode.REPEAT);
        this.f26351e = new ed0(R.raw.wallpaper_pos_intensity);
        this.f26352f = new ed0(R.raw.wallpaper_neg_intensity);
        this.f26353g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gd0 gd0Var = this.f26349b;
        boolean b10 = gd0Var.b(bitmap);
        gd0 gd0Var2 = this.d;
        boolean b11 = b10 | gd0Var2.b(bitmap2);
        Paint paint = this.f26348a;
        if (i11 >= 0) {
            gd0 gd0Var3 = this.f26350c;
            if ((b11 | gd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ed0 ed0Var = this.f26351e;
                ed0Var.f26058a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var.f26058a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var.f26058a.setInputBuffer("shaderGradientSoftLight", gd0Var3.d);
                ed0Var.f26058a.setFloatUniform("transformGradient", ed0Var.f26059b);
                ed0Var.f26058a.setFloatUniform("transformPattern", ed0Var.f26060c);
                paint.setShader(ed0Var.f26058a);
                return paint;
            }
        } else {
            float a2 = w7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26354i != a2 || this.h != 2) {
                this.h = 2;
                this.f26354i = a2;
                ed0 ed0Var2 = this.f26352f;
                ed0Var2.f26058a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var2.f26058a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var2.f26058a.setFloatUniform("intensity", a2);
                ed0Var2.f26058a.setFloatUniform("transformGradient", ed0Var2.f26059b);
                ed0Var2.f26058a.setFloatUniform("transformPattern", ed0Var2.f26060c);
                paint.setShader(ed0Var2.f26058a);
                return paint;
            }
        }
        return paint;
    }
}
