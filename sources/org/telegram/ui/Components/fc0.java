package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class fc0 {
    public final Paint f23886a;
    public final gc0 f23887b;
    public final gc0 f23888c;
    public final gc0 d;
    public final ec0 e;
    public final ec0 f23889f;
    public final float[] f23890g;
    public int h;
    public float f23891i;

    public fc0() {
        Paint paint = new Paint();
        this.f23886a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f23887b = new gc0(tileMode);
        this.f23888c = new gc0(tileMode);
        this.d = new gc0(Shader.TileMode.REPEAT);
        this.e = new ec0(R.raw.wallpaper_pos_intensity);
        this.f23889f = new ec0(R.raw.wallpaper_neg_intensity);
        this.f23890g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gc0 gc0Var = this.f23887b;
        boolean b10 = gc0Var.b(bitmap);
        gc0 gc0Var2 = this.d;
        boolean b11 = b10 | gc0Var2.b(bitmap2);
        Paint paint = this.f23886a;
        if (i11 >= 0) {
            gc0 gc0Var3 = this.f23888c;
            if ((b11 | gc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ec0 ec0Var = this.e;
                ec0Var.f23622a.setInputBuffer("shaderPattern", gc0Var2.d);
                ec0Var.f23622a.setInputBuffer("shaderGradient", gc0Var.d);
                ec0Var.f23622a.setInputBuffer("shaderGradientSoftLight", gc0Var3.d);
                ec0Var.f23622a.setFloatUniform("transformGradient", ec0Var.f23623b);
                ec0Var.f23622a.setFloatUniform("transformPattern", ec0Var.f23624c);
                paint.setShader(ec0Var.f23622a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f23891i != a2 || this.h != 2) {
                this.h = 2;
                this.f23891i = a2;
                ec0 ec0Var2 = this.f23889f;
                ec0Var2.f23622a.setInputBuffer("shaderPattern", gc0Var2.d);
                ec0Var2.f23622a.setInputBuffer("shaderGradient", gc0Var.d);
                ec0Var2.f23622a.setFloatUniform("intensity", a2);
                ec0Var2.f23622a.setFloatUniform("transformGradient", ec0Var2.f23623b);
                ec0Var2.f23622a.setFloatUniform("transformPattern", ec0Var2.f23624c);
                paint.setShader(ec0Var2.f23622a);
                return paint;
            }
        }
        return paint;
    }
}
