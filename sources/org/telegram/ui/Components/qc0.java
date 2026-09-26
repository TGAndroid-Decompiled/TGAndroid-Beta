package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class qc0 {
    public final Paint f27647a;
    public final rc0 f27648b;
    public final rc0 f27649c;
    public final rc0 d;
    public final pc0 e;
    public final pc0 f27650f;
    public final float[] f27651g;
    public int h;
    public float f27652i;

    public qc0() {
        Paint paint = new Paint();
        this.f27647a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27648b = new rc0(tileMode);
        this.f27649c = new rc0(tileMode);
        this.d = new rc0(Shader.TileMode.REPEAT);
        this.e = new pc0(R.raw.wallpaper_pos_intensity);
        this.f27650f = new pc0(R.raw.wallpaper_neg_intensity);
        this.f27651g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        rc0 rc0Var = this.f27648b;
        boolean b10 = rc0Var.b(bitmap);
        rc0 rc0Var2 = this.d;
        boolean b11 = b10 | rc0Var2.b(bitmap2);
        Paint paint = this.f27647a;
        if (i11 >= 0) {
            rc0 rc0Var3 = this.f27649c;
            if ((b11 | rc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                pc0 pc0Var = this.e;
                pc0Var.f27325a.setInputBuffer("shaderPattern", rc0Var2.d);
                pc0Var.f27325a.setInputBuffer("shaderGradient", rc0Var.d);
                pc0Var.f27325a.setInputBuffer("shaderGradientSoftLight", rc0Var3.d);
                pc0Var.f27325a.setFloatUniform("transformGradient", pc0Var.f27326b);
                pc0Var.f27325a.setFloatUniform("transformPattern", pc0Var.f27327c);
                paint.setShader(pc0Var.f27325a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27652i != a2 || this.h != 2) {
                this.h = 2;
                this.f27652i = a2;
                pc0 pc0Var2 = this.f27650f;
                pc0Var2.f27325a.setInputBuffer("shaderPattern", rc0Var2.d);
                pc0Var2.f27325a.setInputBuffer("shaderGradient", rc0Var.d);
                pc0Var2.f27325a.setFloatUniform("intensity", a2);
                pc0Var2.f27325a.setFloatUniform("transformGradient", pc0Var2.f27326b);
                pc0Var2.f27325a.setFloatUniform("transformPattern", pc0Var2.f27327c);
                paint.setShader(pc0Var2.f27325a);
                return paint;
            }
        }
        return paint;
    }
}
