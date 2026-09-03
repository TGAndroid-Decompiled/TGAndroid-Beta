package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class ic0 {
    public final Paint f27790a;
    public final jc0 f27791b;
    public final jc0 f27792c;
    public final jc0 d;
    public final hc0 f27793e;
    public final hc0 f27794f;
    public final float[] f27795g;
    public int h;
    public float f27796i;

    public ic0() {
        Paint paint = new Paint();
        this.f27790a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27791b = new jc0(tileMode);
        this.f27792c = new jc0(tileMode);
        this.d = new jc0(Shader.TileMode.REPEAT);
        this.f27793e = new hc0(R.raw.wallpaper_pos_intensity);
        this.f27794f = new hc0(R.raw.wallpaper_neg_intensity);
        this.f27795g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        jc0 jc0Var = this.f27791b;
        boolean b10 = jc0Var.b(bitmap);
        jc0 jc0Var2 = this.d;
        boolean b11 = b10 | jc0Var2.b(bitmap2);
        Paint paint = this.f27790a;
        if (i11 >= 0) {
            jc0 jc0Var3 = this.f27792c;
            if ((b11 | jc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                hc0 hc0Var = this.f27793e;
                hc0Var.f27467a.setInputBuffer("shaderPattern", jc0Var2.d);
                hc0Var.f27467a.setInputBuffer("shaderGradient", jc0Var.d);
                hc0Var.f27467a.setInputBuffer("shaderGradientSoftLight", jc0Var3.d);
                hc0Var.f27467a.setFloatUniform("transformGradient", hc0Var.f27468b);
                hc0Var.f27467a.setFloatUniform("transformPattern", hc0Var.f27469c);
                paint.setShader(hc0Var.f27467a);
                return paint;
            }
        } else {
            float a2 = k7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27796i != a2 || this.h != 2) {
                this.h = 2;
                this.f27796i = a2;
                hc0 hc0Var2 = this.f27794f;
                hc0Var2.f27467a.setInputBuffer("shaderPattern", jc0Var2.d);
                hc0Var2.f27467a.setInputBuffer("shaderGradient", jc0Var.d);
                hc0Var2.f27467a.setFloatUniform("intensity", a2);
                hc0Var2.f27467a.setFloatUniform("transformGradient", hc0Var2.f27468b);
                hc0Var2.f27467a.setFloatUniform("transformPattern", hc0Var2.f27469c);
                paint.setShader(hc0Var2.f27467a);
                return paint;
            }
        }
        return paint;
    }
}
