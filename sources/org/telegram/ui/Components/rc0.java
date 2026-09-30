package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class rc0 {
    public final Paint f27938a;
    public final sc0 f27939b;
    public final sc0 f27940c;
    public final sc0 d;
    public final qc0 e;
    public final qc0 f27941f;
    public final float[] f27942g;
    public int h;
    public float f27943i;

    public rc0() {
        Paint paint = new Paint();
        this.f27938a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27939b = new sc0(tileMode);
        this.f27940c = new sc0(tileMode);
        this.d = new sc0(Shader.TileMode.REPEAT);
        this.e = new qc0(R.raw.wallpaper_pos_intensity);
        this.f27941f = new qc0(R.raw.wallpaper_neg_intensity);
        this.f27942g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        sc0 sc0Var = this.f27939b;
        boolean b10 = sc0Var.b(bitmap);
        sc0 sc0Var2 = this.d;
        boolean b11 = b10 | sc0Var2.b(bitmap2);
        Paint paint = this.f27938a;
        if (i11 >= 0) {
            sc0 sc0Var3 = this.f27940c;
            if ((b11 | sc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                qc0 qc0Var = this.e;
                qc0Var.f27653a.setInputBuffer("shaderPattern", sc0Var2.d);
                qc0Var.f27653a.setInputBuffer("shaderGradient", sc0Var.d);
                qc0Var.f27653a.setInputBuffer("shaderGradientSoftLight", sc0Var3.d);
                qc0Var.f27653a.setFloatUniform("transformGradient", qc0Var.f27654b);
                qc0Var.f27653a.setFloatUniform("transformPattern", qc0Var.f27655c);
                paint.setShader(qc0Var.f27653a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27943i != a2 || this.h != 2) {
                this.h = 2;
                this.f27943i = a2;
                qc0 qc0Var2 = this.f27941f;
                qc0Var2.f27653a.setInputBuffer("shaderPattern", sc0Var2.d);
                qc0Var2.f27653a.setInputBuffer("shaderGradient", sc0Var.d);
                qc0Var2.f27653a.setFloatUniform("intensity", a2);
                qc0Var2.f27653a.setFloatUniform("transformGradient", qc0Var2.f27654b);
                qc0Var2.f27653a.setFloatUniform("transformPattern", qc0Var2.f27655c);
                paint.setShader(qc0Var2.f27653a);
                return paint;
            }
        }
        return paint;
    }
}
