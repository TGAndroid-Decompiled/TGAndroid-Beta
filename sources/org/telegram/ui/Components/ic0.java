package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class ic0 {
    public final Paint f27757a;
    public final jc0 f27758b;
    public final jc0 f27759c;
    public final jc0 d;
    public final hc0 f27760e;
    public final hc0 f27761f;
    public final float[] f27762g;
    public int h;
    public float f27763i;

    public ic0() {
        Paint paint = new Paint();
        this.f27757a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27758b = new jc0(tileMode);
        this.f27759c = new jc0(tileMode);
        this.d = new jc0(Shader.TileMode.REPEAT);
        this.f27760e = new hc0(R.raw.wallpaper_pos_intensity);
        this.f27761f = new hc0(R.raw.wallpaper_neg_intensity);
        this.f27762g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        jc0 jc0Var = this.f27758b;
        boolean b10 = jc0Var.b(bitmap);
        jc0 jc0Var2 = this.d;
        boolean b11 = b10 | jc0Var2.b(bitmap2);
        Paint paint = this.f27757a;
        if (i11 >= 0) {
            jc0 jc0Var3 = this.f27759c;
            if ((b11 | jc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                hc0 hc0Var = this.f27760e;
                hc0Var.f27450a.setInputBuffer("shaderPattern", jc0Var2.d);
                hc0Var.f27450a.setInputBuffer("shaderGradient", jc0Var.d);
                hc0Var.f27450a.setInputBuffer("shaderGradientSoftLight", jc0Var3.d);
                hc0Var.f27450a.setFloatUniform("transformGradient", hc0Var.f27451b);
                hc0Var.f27450a.setFloatUniform("transformPattern", hc0Var.f27452c);
                paint.setShader(hc0Var.f27450a);
                return paint;
            }
        } else {
            float a2 = k7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27763i != a2 || this.h != 2) {
                this.h = 2;
                this.f27763i = a2;
                hc0 hc0Var2 = this.f27761f;
                hc0Var2.f27450a.setInputBuffer("shaderPattern", jc0Var2.d);
                hc0Var2.f27450a.setInputBuffer("shaderGradient", jc0Var.d);
                hc0Var2.f27450a.setFloatUniform("intensity", a2);
                hc0Var2.f27450a.setFloatUniform("transformGradient", hc0Var2.f27451b);
                hc0Var2.f27450a.setFloatUniform("transformPattern", hc0Var2.f27452c);
                paint.setShader(hc0Var2.f27450a);
                return paint;
            }
        }
        return paint;
    }
}
