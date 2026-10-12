package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class jd0 {
    public final Paint f27467a;
    public final kd0 f27468b;
    public final kd0 f27469c;
    public final kd0 d;
    public final id0 f27470e;
    public final id0 f27471f;
    public final float[] f27472g;
    public int h;
    public float f27473i;

    public jd0() {
        Paint paint = new Paint();
        this.f27467a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27468b = new kd0(tileMode);
        this.f27469c = new kd0(tileMode);
        this.d = new kd0(Shader.TileMode.REPEAT);
        this.f27470e = new id0(R.raw.wallpaper_pos_intensity);
        this.f27471f = new id0(R.raw.wallpaper_neg_intensity);
        this.f27472g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        kd0 kd0Var = this.f27468b;
        boolean b10 = kd0Var.b(bitmap);
        kd0 kd0Var2 = this.d;
        boolean b11 = b10 | kd0Var2.b(bitmap2);
        Paint paint = this.f27467a;
        if (i11 >= 0) {
            kd0 kd0Var3 = this.f27469c;
            if ((b11 | kd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                id0 id0Var = this.f27470e;
                id0Var.f27128a.setInputBuffer("shaderPattern", kd0Var2.d);
                id0Var.f27128a.setInputBuffer("shaderGradient", kd0Var.d);
                id0Var.f27128a.setInputBuffer("shaderGradientSoftLight", kd0Var3.d);
                id0Var.f27128a.setFloatUniform("transformGradient", id0Var.f27129b);
                id0Var.f27128a.setFloatUniform("transformPattern", id0Var.f27130c);
                paint.setShader(id0Var.f27128a);
                return paint;
            }
        } else {
            float a2 = w7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27473i != a2 || this.h != 2) {
                this.h = 2;
                this.f27473i = a2;
                id0 id0Var2 = this.f27471f;
                id0Var2.f27128a.setInputBuffer("shaderPattern", kd0Var2.d);
                id0Var2.f27128a.setInputBuffer("shaderGradient", kd0Var.d);
                id0Var2.f27128a.setFloatUniform("intensity", a2);
                id0Var2.f27128a.setFloatUniform("transformGradient", id0Var2.f27129b);
                id0Var2.f27128a.setFloatUniform("transformPattern", id0Var2.f27130c);
                paint.setShader(id0Var2.f27128a);
                return paint;
            }
        }
        return paint;
    }
}
