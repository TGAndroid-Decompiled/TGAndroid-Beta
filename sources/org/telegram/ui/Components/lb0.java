package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class lb0 {
    public final Paint f28104a;
    public final mb0 f28105b;
    public final mb0 f28106c;
    public final mb0 d;
    public final kb0 e;
    public final kb0 f28107f;
    public final float[] f28108g;
    public int h;
    public float f28109i;

    public lb0() {
        Paint paint = new Paint();
        this.f28104a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28105b = new mb0(tileMode);
        this.f28106c = new mb0(tileMode);
        this.d = new mb0(Shader.TileMode.REPEAT);
        this.e = new kb0(2131624359);
        this.f28107f = new kb0(2131624358);
        this.f28108g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        mb0 mb0Var = this.f28105b;
        boolean b10 = mb0Var.b(bitmap);
        mb0 mb0Var2 = this.d;
        boolean b11 = b10 | mb0Var2.b(bitmap2);
        Paint paint = this.f28104a;
        if (i11 >= 0) {
            mb0 mb0Var3 = this.f28106c;
            if ((b11 | mb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                kb0 kb0Var = this.e;
                kb0Var.f27798a.setInputBuffer("shaderPattern", mb0Var2.d);
                kb0Var.f27798a.setInputBuffer("shaderGradient", mb0Var.d);
                kb0Var.f27798a.setInputBuffer("shaderGradientSoftLight", mb0Var3.d);
                kb0Var.f27798a.setFloatUniform("transformGradient", kb0Var.f27799b);
                kb0Var.f27798a.setFloatUniform("transformPattern", kb0Var.f27800c);
                paint.setShader(kb0Var.f27798a);
                return paint;
            }
        } else {
            float a2 = w7.u.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f28109i != a2 || this.h != 2) {
                this.h = 2;
                this.f28109i = a2;
                kb0 kb0Var2 = this.f28107f;
                kb0Var2.f27798a.setInputBuffer("shaderPattern", mb0Var2.d);
                kb0Var2.f27798a.setInputBuffer("shaderGradient", mb0Var.d);
                kb0Var2.f27798a.setFloatUniform("intensity", a2);
                kb0Var2.f27798a.setFloatUniform("transformGradient", kb0Var2.f27799b);
                kb0Var2.f27798a.setFloatUniform("transformPattern", kb0Var2.f27800c);
                paint.setShader(kb0Var2.f27798a);
                return paint;
            }
        }
        return paint;
    }
}
