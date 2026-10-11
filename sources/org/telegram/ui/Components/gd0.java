package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class gd0 {
    public final Paint f26690a;
    public final hd0 f26691b;
    public final hd0 f26692c;
    public final hd0 d;
    public final fd0 f26693e;
    public final fd0 f26694f;
    public final float[] f26695g;
    public int h;
    public float f26696i;

    public gd0() {
        Paint paint = new Paint();
        this.f26690a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26691b = new hd0(tileMode);
        this.f26692c = new hd0(tileMode);
        this.d = new hd0(Shader.TileMode.REPEAT);
        this.f26693e = new fd0(R.raw.wallpaper_pos_intensity);
        this.f26694f = new fd0(R.raw.wallpaper_neg_intensity);
        this.f26695g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        hd0 hd0Var = this.f26691b;
        boolean b10 = hd0Var.b(bitmap);
        hd0 hd0Var2 = this.d;
        boolean b11 = b10 | hd0Var2.b(bitmap2);
        Paint paint = this.f26690a;
        if (i11 >= 0) {
            hd0 hd0Var3 = this.f26692c;
            if ((b11 | hd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                fd0 fd0Var = this.f26693e;
                fd0Var.f26336a.setInputBuffer("shaderPattern", hd0Var2.d);
                fd0Var.f26336a.setInputBuffer("shaderGradient", hd0Var.d);
                fd0Var.f26336a.setInputBuffer("shaderGradientSoftLight", hd0Var3.d);
                fd0Var.f26336a.setFloatUniform("transformGradient", fd0Var.f26337b);
                fd0Var.f26336a.setFloatUniform("transformPattern", fd0Var.f26338c);
                paint.setShader(fd0Var.f26336a);
                return paint;
            }
        } else {
            float a2 = w7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26696i != a2 || this.h != 2) {
                this.h = 2;
                this.f26696i = a2;
                fd0 fd0Var2 = this.f26694f;
                fd0Var2.f26336a.setInputBuffer("shaderPattern", hd0Var2.d);
                fd0Var2.f26336a.setInputBuffer("shaderGradient", hd0Var.d);
                fd0Var2.f26336a.setFloatUniform("intensity", a2);
                fd0Var2.f26336a.setFloatUniform("transformGradient", fd0Var2.f26337b);
                fd0Var2.f26336a.setFloatUniform("transformPattern", fd0Var2.f26338c);
                paint.setShader(fd0Var2.f26336a);
                return paint;
            }
        }
        return paint;
    }
}
