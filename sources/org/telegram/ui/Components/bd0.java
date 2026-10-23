package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class bd0 {
    public final Paint f25059a;
    public final cd0 f25060b;
    public final cd0 f25061c;
    public final cd0 d;
    public final ad0 e;
    public final ad0 f25062f;
    public final float[] f25063g;
    public int h;
    public float f25064i;

    public bd0() {
        Paint paint = new Paint();
        this.f25059a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f25060b = new cd0(tileMode);
        this.f25061c = new cd0(tileMode);
        this.d = new cd0(Shader.TileMode.REPEAT);
        this.e = new ad0(R.raw.wallpaper_pos_intensity);
        this.f25062f = new ad0(R.raw.wallpaper_neg_intensity);
        this.f25063g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        cd0 cd0Var = this.f25060b;
        boolean b10 = cd0Var.b(bitmap);
        cd0 cd0Var2 = this.d;
        boolean b11 = b10 | cd0Var2.b(bitmap2);
        Paint paint = this.f25059a;
        if (i11 >= 0) {
            cd0 cd0Var3 = this.f25061c;
            if ((b11 | cd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ad0 ad0Var = this.e;
                ad0Var.f24692a.setInputBuffer("shaderPattern", cd0Var2.d);
                ad0Var.f24692a.setInputBuffer("shaderGradient", cd0Var.d);
                ad0Var.f24692a.setInputBuffer("shaderGradientSoftLight", cd0Var3.d);
                ad0Var.f24692a.setFloatUniform("transformGradient", ad0Var.f24693b);
                ad0Var.f24692a.setFloatUniform("transformPattern", ad0Var.f24694c);
                paint.setShader(ad0Var.f24692a);
                return paint;
            }
        } else {
            float a2 = w7.r.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f25064i != a2 || this.h != 2) {
                this.h = 2;
                this.f25064i = a2;
                ad0 ad0Var2 = this.f25062f;
                ad0Var2.f24692a.setInputBuffer("shaderPattern", cd0Var2.d);
                ad0Var2.f24692a.setInputBuffer("shaderGradient", cd0Var.d);
                ad0Var2.f24692a.setFloatUniform("intensity", a2);
                ad0Var2.f24692a.setFloatUniform("transformGradient", ad0Var2.f24693b);
                ad0Var2.f24692a.setFloatUniform("transformPattern", ad0Var2.f24694c);
                paint.setShader(ad0Var2.f24692a);
                return paint;
            }
        }
        return paint;
    }
}
