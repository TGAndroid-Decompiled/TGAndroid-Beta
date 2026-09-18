package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class oc0 {
    public final Paint f26909a;
    public final pc0 f26910b;
    public final pc0 f26911c;
    public final pc0 d;
    public final nc0 e;
    public final nc0 f26912f;
    public final float[] f26913g;
    public int h;
    public float f26914i;

    public oc0() {
        Paint paint = new Paint();
        this.f26909a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26910b = new pc0(tileMode);
        this.f26911c = new pc0(tileMode);
        this.d = new pc0(Shader.TileMode.REPEAT);
        this.e = new nc0(R.raw.wallpaper_pos_intensity);
        this.f26912f = new nc0(R.raw.wallpaper_neg_intensity);
        this.f26913g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        pc0 pc0Var = this.f26910b;
        boolean b10 = pc0Var.b(bitmap);
        pc0 pc0Var2 = this.d;
        boolean b11 = b10 | pc0Var2.b(bitmap2);
        Paint paint = this.f26909a;
        if (i11 >= 0) {
            pc0 pc0Var3 = this.f26911c;
            if ((b11 | pc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                nc0 nc0Var = this.e;
                nc0Var.f26659a.setInputBuffer("shaderPattern", pc0Var2.d);
                nc0Var.f26659a.setInputBuffer("shaderGradient", pc0Var.d);
                nc0Var.f26659a.setInputBuffer("shaderGradientSoftLight", pc0Var3.d);
                nc0Var.f26659a.setFloatUniform("transformGradient", nc0Var.f26660b);
                nc0Var.f26659a.setFloatUniform("transformPattern", nc0Var.f26661c);
                paint.setShader(nc0Var.f26659a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26914i != a2 || this.h != 2) {
                this.h = 2;
                this.f26914i = a2;
                nc0 nc0Var2 = this.f26912f;
                nc0Var2.f26659a.setInputBuffer("shaderPattern", pc0Var2.d);
                nc0Var2.f26659a.setInputBuffer("shaderGradient", pc0Var.d);
                nc0Var2.f26659a.setFloatUniform("intensity", a2);
                nc0Var2.f26659a.setFloatUniform("transformGradient", nc0Var2.f26660b);
                nc0Var2.f26659a.setFloatUniform("transformPattern", nc0Var2.f26661c);
                paint.setShader(nc0Var2.f26659a);
                return paint;
            }
        }
        return paint;
    }
}
