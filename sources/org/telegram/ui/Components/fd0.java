package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class fd0 {
    public final Paint f25011a;
    public final gd0 f25012b;
    public final gd0 f25013c;
    public final gd0 d;
    public final ed0 e;
    public final ed0 f25014f;
    public final float[] f25015g;
    public int h;
    public float f25016i;

    public fd0() {
        Paint paint = new Paint();
        this.f25011a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f25012b = new gd0(tileMode);
        this.f25013c = new gd0(tileMode);
        this.d = new gd0(Shader.TileMode.REPEAT);
        this.e = new ed0(R.raw.wallpaper_pos_intensity);
        this.f25014f = new ed0(R.raw.wallpaper_neg_intensity);
        this.f25015g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gd0 gd0Var = this.f25012b;
        boolean b10 = gd0Var.b(bitmap);
        gd0 gd0Var2 = this.d;
        boolean b11 = b10 | gd0Var2.b(bitmap2);
        Paint paint = this.f25011a;
        if (i11 >= 0) {
            gd0 gd0Var3 = this.f25013c;
            if ((b11 | gd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ed0 ed0Var = this.e;
                ed0Var.f24685a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var.f24685a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var.f24685a.setInputBuffer("shaderGradientSoftLight", gd0Var3.d);
                ed0Var.f24685a.setFloatUniform("transformGradient", ed0Var.f24686b);
                ed0Var.f24685a.setFloatUniform("transformPattern", ed0Var.f24687c);
                paint.setShader(ed0Var.f24685a);
                return paint;
            }
        } else {
            float a2 = w7.s.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f25016i != a2 || this.h != 2) {
                this.h = 2;
                this.f25016i = a2;
                ed0 ed0Var2 = this.f25014f;
                ed0Var2.f24685a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var2.f24685a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var2.f24685a.setFloatUniform("intensity", a2);
                ed0Var2.f24685a.setFloatUniform("transformGradient", ed0Var2.f24686b);
                ed0Var2.f24685a.setFloatUniform("transformPattern", ed0Var2.f24687c);
                paint.setShader(ed0Var2.f24685a);
                return paint;
            }
        }
        return paint;
    }
}
