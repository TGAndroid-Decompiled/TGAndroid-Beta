package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class fc0 {
    public final Paint f23868a;
    public final gc0 f23869b;
    public final gc0 f23870c;
    public final gc0 d;
    public final ec0 e;
    public final ec0 f23871f;
    public final float[] f23872g;
    public int h;
    public float f23873i;

    public fc0() {
        Paint paint = new Paint();
        this.f23868a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f23869b = new gc0(tileMode);
        this.f23870c = new gc0(tileMode);
        this.d = new gc0(Shader.TileMode.REPEAT);
        this.e = new ec0(R.raw.wallpaper_pos_intensity);
        this.f23871f = new ec0(R.raw.wallpaper_neg_intensity);
        this.f23872g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gc0 gc0Var = this.f23869b;
        boolean b10 = gc0Var.b(bitmap);
        gc0 gc0Var2 = this.d;
        boolean b11 = b10 | gc0Var2.b(bitmap2);
        Paint paint = this.f23868a;
        if (i11 >= 0) {
            gc0 gc0Var3 = this.f23870c;
            if ((b11 | gc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ec0 ec0Var = this.e;
                ec0Var.f23539a.setInputBuffer("shaderPattern", gc0Var2.d);
                ec0Var.f23539a.setInputBuffer("shaderGradient", gc0Var.d);
                ec0Var.f23539a.setInputBuffer("shaderGradientSoftLight", gc0Var3.d);
                ec0Var.f23539a.setFloatUniform("transformGradient", ec0Var.f23540b);
                ec0Var.f23539a.setFloatUniform("transformPattern", ec0Var.f23541c);
                paint.setShader(ec0Var.f23539a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f23873i != a2 || this.h != 2) {
                this.h = 2;
                this.f23873i = a2;
                ec0 ec0Var2 = this.f23871f;
                ec0Var2.f23539a.setInputBuffer("shaderPattern", gc0Var2.d);
                ec0Var2.f23539a.setInputBuffer("shaderGradient", gc0Var.d);
                ec0Var2.f23539a.setFloatUniform("intensity", a2);
                ec0Var2.f23539a.setFloatUniform("transformGradient", ec0Var2.f23540b);
                ec0Var2.f23539a.setFloatUniform("transformPattern", ec0Var2.f23541c);
                paint.setShader(ec0Var2.f23539a);
                return paint;
            }
        }
        return paint;
    }
}
