package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class xc0 {
    public final Paint f34689a;
    public final yc0 f34690b;
    public final yc0 f34691c;
    public final yc0 d;
    public final wc0 e;
    public final wc0 f34692f;
    public final float[] f34693g;
    public int h;
    public float f34694i;

    public xc0() {
        Paint paint = new Paint();
        this.f34689a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f34690b = new yc0(tileMode);
        this.f34691c = new yc0(tileMode);
        this.d = new yc0(Shader.TileMode.REPEAT);
        this.e = new wc0(R.raw.wallpaper_pos_intensity);
        this.f34692f = new wc0(R.raw.wallpaper_neg_intensity);
        this.f34693g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        yc0 yc0Var = this.f34690b;
        boolean b10 = yc0Var.b(bitmap);
        yc0 yc0Var2 = this.d;
        boolean b11 = b10 | yc0Var2.b(bitmap2);
        Paint paint = this.f34689a;
        if (i11 >= 0) {
            yc0 yc0Var3 = this.f34691c;
            if ((b11 | yc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                wc0 wc0Var = this.e;
                wc0Var.f34408a.setInputBuffer("shaderPattern", yc0Var2.d);
                wc0Var.f34408a.setInputBuffer("shaderGradient", yc0Var.d);
                wc0Var.f34408a.setInputBuffer("shaderGradientSoftLight", yc0Var3.d);
                wc0Var.f34408a.setFloatUniform("transformGradient", wc0Var.f34409b);
                wc0Var.f34408a.setFloatUniform("transformPattern", wc0Var.f34410c);
                paint.setShader(wc0Var.f34408a);
                return paint;
            }
        } else {
            float a2 = a8.ee.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f34694i != a2 || this.h != 2) {
                this.h = 2;
                this.f34694i = a2;
                wc0 wc0Var2 = this.f34692f;
                wc0Var2.f34408a.setInputBuffer("shaderPattern", yc0Var2.d);
                wc0Var2.f34408a.setInputBuffer("shaderGradient", yc0Var.d);
                wc0Var2.f34408a.setFloatUniform("intensity", a2);
                wc0Var2.f34408a.setFloatUniform("transformGradient", wc0Var2.f34409b);
                wc0Var2.f34408a.setFloatUniform("transformPattern", wc0Var2.f34410c);
                paint.setShader(wc0Var2.f34408a);
                return paint;
            }
        }
        return paint;
    }
}
