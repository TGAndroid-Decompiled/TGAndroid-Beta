package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class mb0 {
    public final Paint f30778a;
    public final nb0 f30779b;
    public final nb0 f30780c;
    public final nb0 d;
    public final lb0 f30781e;
    public final lb0 f30782f;
    public final float[] f30783g;
    public int h;
    public float f30784i;

    public mb0() {
        Paint paint = new Paint();
        this.f30778a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f30779b = new nb0(tileMode);
        this.f30780c = new nb0(tileMode);
        this.d = new nb0(Shader.TileMode.REPEAT);
        this.f30781e = new lb0(R.raw.wallpaper_pos_intensity);
        this.f30782f = new lb0(R.raw.wallpaper_neg_intensity);
        this.f30783g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i9, int i10) {
        nb0 nb0Var = this.f30779b;
        boolean b10 = nb0Var.b(bitmap);
        nb0 nb0Var2 = this.d;
        boolean b11 = b10 | nb0Var2.b(bitmap2);
        Paint paint = this.f30778a;
        if (i10 >= 0) {
            nb0 nb0Var3 = this.f30780c;
            if ((b11 | nb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                lb0 lb0Var = this.f30781e;
                lb0Var.f30410a.setInputBuffer("shaderPattern", nb0Var2.d);
                lb0Var.f30410a.setInputBuffer("shaderGradient", nb0Var.d);
                lb0Var.f30410a.setInputBuffer("shaderGradientSoftLight", nb0Var3.d);
                lb0Var.f30410a.setFloatUniform("transformGradient", lb0Var.f30411b);
                lb0Var.f30410a.setFloatUniform("transformPattern", lb0Var.f30412c);
                paint.setShader(lb0Var.f30410a);
                return paint;
            }
        } else {
            float a2 = g7.n.a((i9 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f30784i != a2 || this.h != 2) {
                this.h = 2;
                this.f30784i = a2;
                lb0 lb0Var2 = this.f30782f;
                lb0Var2.f30410a.setInputBuffer("shaderPattern", nb0Var2.d);
                lb0Var2.f30410a.setInputBuffer("shaderGradient", nb0Var.d);
                lb0Var2.f30410a.setFloatUniform("intensity", a2);
                lb0Var2.f30410a.setFloatUniform("transformGradient", lb0Var2.f30411b);
                lb0Var2.f30410a.setFloatUniform("transformPattern", lb0Var2.f30412c);
                paint.setShader(lb0Var2.f30410a);
                return paint;
            }
        }
        return paint;
    }
}
