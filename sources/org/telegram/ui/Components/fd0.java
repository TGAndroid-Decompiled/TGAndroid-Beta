package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class fd0 {
    public final Paint f26439a;
    public final gd0 f26440b;
    public final gd0 f26441c;
    public final gd0 d;
    public final ed0 f26442e;
    public final ed0 f26443f;
    public final float[] f26444g;
    public int h;
    public float f26445i;

    public fd0() {
        Paint paint = new Paint();
        this.f26439a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26440b = new gd0(tileMode);
        this.f26441c = new gd0(tileMode);
        this.d = new gd0(Shader.TileMode.REPEAT);
        this.f26442e = new ed0(R.raw.wallpaper_pos_intensity);
        this.f26443f = new ed0(R.raw.wallpaper_neg_intensity);
        this.f26444g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gd0 gd0Var = this.f26440b;
        boolean b10 = gd0Var.b(bitmap);
        gd0 gd0Var2 = this.d;
        boolean b11 = b10 | gd0Var2.b(bitmap2);
        Paint paint = this.f26439a;
        if (i11 >= 0) {
            gd0 gd0Var3 = this.f26441c;
            if ((b11 | gd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ed0 ed0Var = this.f26442e;
                ed0Var.f26072a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var.f26072a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var.f26072a.setInputBuffer("shaderGradientSoftLight", gd0Var3.d);
                ed0Var.f26072a.setFloatUniform("transformGradient", ed0Var.f26073b);
                ed0Var.f26072a.setFloatUniform("transformPattern", ed0Var.f26074c);
                paint.setShader(ed0Var.f26072a);
                return paint;
            }
        } else {
            float a2 = w7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26445i != a2 || this.h != 2) {
                this.h = 2;
                this.f26445i = a2;
                ed0 ed0Var2 = this.f26443f;
                ed0Var2.f26072a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var2.f26072a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var2.f26072a.setFloatUniform("intensity", a2);
                ed0Var2.f26072a.setFloatUniform("transformGradient", ed0Var2.f26073b);
                ed0Var2.f26072a.setFloatUniform("transformPattern", ed0Var2.f26074c);
                paint.setShader(ed0Var2.f26072a);
                return paint;
            }
        }
        return paint;
    }
}
