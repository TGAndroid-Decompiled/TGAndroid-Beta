package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class nc0 {
    public final Paint f26619a;
    public final oc0 f26620b;
    public final oc0 f26621c;
    public final oc0 d;
    public final mc0 e;
    public final mc0 f26622f;
    public final float[] f26623g;
    public int h;
    public float f26624i;

    public nc0() {
        Paint paint = new Paint();
        this.f26619a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26620b = new oc0(tileMode);
        this.f26621c = new oc0(tileMode);
        this.d = new oc0(Shader.TileMode.REPEAT);
        this.e = new mc0(R.raw.wallpaper_pos_intensity);
        this.f26622f = new mc0(R.raw.wallpaper_neg_intensity);
        this.f26623g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        oc0 oc0Var = this.f26620b;
        boolean b10 = oc0Var.b(bitmap);
        oc0 oc0Var2 = this.d;
        boolean b11 = b10 | oc0Var2.b(bitmap2);
        Paint paint = this.f26619a;
        if (i11 >= 0) {
            oc0 oc0Var3 = this.f26621c;
            if ((b11 | oc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                mc0 mc0Var = this.e;
                mc0Var.f26380a.setInputBuffer("shaderPattern", oc0Var2.d);
                mc0Var.f26380a.setInputBuffer("shaderGradient", oc0Var.d);
                mc0Var.f26380a.setInputBuffer("shaderGradientSoftLight", oc0Var3.d);
                mc0Var.f26380a.setFloatUniform("transformGradient", mc0Var.f26381b);
                mc0Var.f26380a.setFloatUniform("transformPattern", mc0Var.f26382c);
                paint.setShader(mc0Var.f26380a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26624i != a2 || this.h != 2) {
                this.h = 2;
                this.f26624i = a2;
                mc0 mc0Var2 = this.f26622f;
                mc0Var2.f26380a.setInputBuffer("shaderPattern", oc0Var2.d);
                mc0Var2.f26380a.setInputBuffer("shaderGradient", oc0Var.d);
                mc0Var2.f26380a.setFloatUniform("intensity", a2);
                mc0Var2.f26380a.setFloatUniform("transformGradient", mc0Var2.f26381b);
                mc0Var2.f26380a.setFloatUniform("transformPattern", mc0Var2.f26382c);
                paint.setShader(mc0Var2.f26380a);
                return paint;
            }
        }
        return paint;
    }
}
