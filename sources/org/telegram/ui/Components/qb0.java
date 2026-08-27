package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

public final class qb0 {

    public final Paint f31863a;

    public final rb0 f31864b;

    public final rb0 f31865c;
    public final rb0 d;

    public final pb0 f31866e;

    public final pb0 f31867f;

    public final float[] f31868g;
    public int h;

    public float f31869i;

    public qb0() {
        Paint paint = new Paint();
        this.f31863a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31864b = new rb0(tileMode);
        this.f31865c = new rb0(tileMode);
        this.d = new rb0(Shader.TileMode.REPEAT);
        this.f31866e = new pb0(R.raw.wallpaper_pos_intensity);
        this.f31867f = new pb0(R.raw.wallpaper_neg_intensity);
        this.f31868g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        rb0 rb0Var = this.f31864b;
        boolean zB = rb0Var.b(bitmap);
        rb0 rb0Var2 = this.d;
        boolean zB2 = zB | rb0Var2.b(bitmap2);
        Paint paint = this.f31863a;
        if (i11 >= 0) {
            rb0 rb0Var3 = this.f31865c;
            if ((zB2 | rb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                pb0 pb0Var = this.f31866e;
                pb0Var.f31578a.setInputBuffer("shaderPattern", rb0Var2.d);
                pb0Var.f31578a.setInputBuffer("shaderGradient", rb0Var.d);
                pb0Var.f31578a.setInputBuffer("shaderGradientSoftLight", rb0Var3.d);
                pb0Var.f31578a.setFloatUniform("transformGradient", pb0Var.f31579b);
                pb0Var.f31578a.setFloatUniform("transformPattern", pb0Var.f31580c);
                paint.setShader(pb0Var.f31578a);
                return paint;
            }
        } else {
            float fA = h7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (zB2 || this.f31869i != fA || this.h != 2) {
                this.h = 2;
                this.f31869i = fA;
                pb0 pb0Var2 = this.f31867f;
                pb0Var2.f31578a.setInputBuffer("shaderPattern", rb0Var2.d);
                pb0Var2.f31578a.setInputBuffer("shaderGradient", rb0Var.d);
                pb0Var2.f31578a.setFloatUniform("intensity", fA);
                pb0Var2.f31578a.setFloatUniform("transformGradient", pb0Var2.f31579b);
                pb0Var2.f31578a.setFloatUniform("transformPattern", pb0Var2.f31580c);
                paint.setShader(pb0Var2.f31578a);
                return paint;
            }
        }
        return paint;
    }
}
