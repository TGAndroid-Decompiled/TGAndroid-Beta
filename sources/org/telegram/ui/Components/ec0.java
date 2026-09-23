package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class ec0 {
    public final Paint f23640a;
    public final fc0 f23641b;
    public final fc0 f23642c;
    public final fc0 d;
    public final dc0 e;
    public final dc0 f23643f;
    public final float[] f23644g;
    public int h;
    public float f23645i;

    public ec0() {
        Paint paint = new Paint();
        this.f23640a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f23641b = new fc0(tileMode);
        this.f23642c = new fc0(tileMode);
        this.d = new fc0(Shader.TileMode.REPEAT);
        this.e = new dc0(R.raw.wallpaper_pos_intensity);
        this.f23643f = new dc0(R.raw.wallpaper_neg_intensity);
        this.f23644g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        fc0 fc0Var = this.f23641b;
        boolean b10 = fc0Var.b(bitmap);
        fc0 fc0Var2 = this.d;
        boolean b11 = b10 | fc0Var2.b(bitmap2);
        Paint paint = this.f23640a;
        if (i11 >= 0) {
            fc0 fc0Var3 = this.f23642c;
            if ((b11 | fc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                dc0 dc0Var = this.e;
                dc0Var.f23369a.setInputBuffer("shaderPattern", fc0Var2.d);
                dc0Var.f23369a.setInputBuffer("shaderGradient", fc0Var.d);
                dc0Var.f23369a.setInputBuffer("shaderGradientSoftLight", fc0Var3.d);
                dc0Var.f23369a.setFloatUniform("transformGradient", dc0Var.f23370b);
                dc0Var.f23369a.setFloatUniform("transformPattern", dc0Var.f23371c);
                paint.setShader(dc0Var.f23369a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f23645i != a2 || this.h != 2) {
                this.h = 2;
                this.f23645i = a2;
                dc0 dc0Var2 = this.f23643f;
                dc0Var2.f23369a.setInputBuffer("shaderPattern", fc0Var2.d);
                dc0Var2.f23369a.setInputBuffer("shaderGradient", fc0Var.d);
                dc0Var2.f23369a.setFloatUniform("intensity", a2);
                dc0Var2.f23369a.setFloatUniform("transformGradient", dc0Var2.f23370b);
                dc0Var2.f23369a.setFloatUniform("transformPattern", dc0Var2.f23371c);
                paint.setShader(dc0Var2.f23369a);
                return paint;
            }
        }
        return paint;
    }
}
