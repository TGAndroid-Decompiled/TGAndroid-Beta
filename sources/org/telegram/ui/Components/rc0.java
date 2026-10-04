package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class rc0 {
    public final Paint f30357a;
    public final sc0 f30358b;
    public final sc0 f30359c;
    public final sc0 d;
    public final qc0 f30360e;
    public final qc0 f30361f;
    public final float[] f30362g;
    public int h;
    public float f30363i;

    public rc0() {
        Paint paint = new Paint();
        this.f30357a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f30358b = new sc0(tileMode);
        this.f30359c = new sc0(tileMode);
        this.d = new sc0(Shader.TileMode.REPEAT);
        this.f30360e = new qc0(R.raw.wallpaper_pos_intensity);
        this.f30361f = new qc0(R.raw.wallpaper_neg_intensity);
        this.f30362g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        sc0 sc0Var = this.f30358b;
        boolean b10 = sc0Var.b(bitmap);
        sc0 sc0Var2 = this.d;
        boolean b11 = b10 | sc0Var2.b(bitmap2);
        Paint paint = this.f30357a;
        if (i11 >= 0) {
            sc0 sc0Var3 = this.f30359c;
            if ((b11 | sc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                qc0 qc0Var = this.f30360e;
                qc0Var.f30000a.setInputBuffer("shaderPattern", sc0Var2.d);
                qc0Var.f30000a.setInputBuffer("shaderGradient", sc0Var.d);
                qc0Var.f30000a.setInputBuffer("shaderGradientSoftLight", sc0Var3.d);
                qc0Var.f30000a.setFloatUniform("transformGradient", qc0Var.f30001b);
                qc0Var.f30000a.setFloatUniform("transformPattern", qc0Var.f30002c);
                paint.setShader(qc0Var.f30000a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f30363i != a2 || this.h != 2) {
                this.h = 2;
                this.f30363i = a2;
                qc0 qc0Var2 = this.f30361f;
                qc0Var2.f30000a.setInputBuffer("shaderPattern", sc0Var2.d);
                qc0Var2.f30000a.setInputBuffer("shaderGradient", sc0Var.d);
                qc0Var2.f30000a.setFloatUniform("intensity", a2);
                qc0Var2.f30000a.setFloatUniform("transformGradient", qc0Var2.f30001b);
                qc0Var2.f30000a.setFloatUniform("transformPattern", qc0Var2.f30002c);
                paint.setShader(qc0Var2.f30000a);
                return paint;
            }
        }
        return paint;
    }
}
