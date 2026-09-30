package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class sc0 {
    public final Paint f28233a;
    public final tc0 f28234b;
    public final tc0 f28235c;
    public final tc0 d;
    public final rc0 e;
    public final rc0 f28236f;
    public final float[] f28237g;
    public int h;
    public float f28238i;

    public sc0() {
        Paint paint = new Paint();
        this.f28233a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28234b = new tc0(tileMode);
        this.f28235c = new tc0(tileMode);
        this.d = new tc0(Shader.TileMode.REPEAT);
        this.e = new rc0(R.raw.wallpaper_pos_intensity);
        this.f28236f = new rc0(R.raw.wallpaper_neg_intensity);
        this.f28237g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        tc0 tc0Var = this.f28234b;
        boolean b10 = tc0Var.b(bitmap);
        tc0 tc0Var2 = this.d;
        boolean b11 = b10 | tc0Var2.b(bitmap2);
        Paint paint = this.f28233a;
        if (i11 >= 0) {
            tc0 tc0Var3 = this.f28235c;
            if ((b11 | tc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                rc0 rc0Var = this.e;
                rc0Var.f27958a.setInputBuffer("shaderPattern", tc0Var2.d);
                rc0Var.f27958a.setInputBuffer("shaderGradient", tc0Var.d);
                rc0Var.f27958a.setInputBuffer("shaderGradientSoftLight", tc0Var3.d);
                rc0Var.f27958a.setFloatUniform("transformGradient", rc0Var.f27959b);
                rc0Var.f27958a.setFloatUniform("transformPattern", rc0Var.f27960c);
                paint.setShader(rc0Var.f27958a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f28238i != a2 || this.h != 2) {
                this.h = 2;
                this.f28238i = a2;
                rc0 rc0Var2 = this.f28236f;
                rc0Var2.f27958a.setInputBuffer("shaderPattern", tc0Var2.d);
                rc0Var2.f27958a.setInputBuffer("shaderGradient", tc0Var.d);
                rc0Var2.f27958a.setFloatUniform("intensity", a2);
                rc0Var2.f27958a.setFloatUniform("transformGradient", rc0Var2.f27959b);
                rc0Var2.f27958a.setFloatUniform("transformPattern", rc0Var2.f27960c);
                paint.setShader(rc0Var2.f27958a);
                return paint;
            }
        }
        return paint;
    }
}
