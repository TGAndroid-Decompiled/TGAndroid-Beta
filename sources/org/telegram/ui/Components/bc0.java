package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class bc0 {
    public final Paint f27025a;
    public final cc0 f27026b;
    public final cc0 f27027c;
    public final cc0 d;
    public final ac0 f27028e;
    public final ac0 f27029f;
    public final float[] f27030g;
    public int h;
    public float f27031i;

    public bc0() {
        Paint paint = new Paint();
        this.f27025a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27026b = new cc0(tileMode);
        this.f27027c = new cc0(tileMode);
        this.d = new cc0(Shader.TileMode.REPEAT);
        this.f27028e = new ac0(R.raw.wallpaper_pos_intensity);
        this.f27029f = new ac0(R.raw.wallpaper_neg_intensity);
        this.f27030g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        cc0 cc0Var = this.f27026b;
        boolean b10 = cc0Var.b(bitmap);
        cc0 cc0Var2 = this.d;
        boolean b11 = b10 | cc0Var2.b(bitmap2);
        Paint paint = this.f27025a;
        if (i11 >= 0) {
            cc0 cc0Var3 = this.f27027c;
            if ((b11 | cc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ac0 ac0Var = this.f27028e;
                ac0Var.f26735a.setInputBuffer("shaderPattern", cc0Var2.d);
                ac0Var.f26735a.setInputBuffer("shaderGradient", cc0Var.d);
                ac0Var.f26735a.setInputBuffer("shaderGradientSoftLight", cc0Var3.d);
                ac0Var.f26735a.setFloatUniform("transformGradient", ac0Var.f26736b);
                ac0Var.f26735a.setFloatUniform("transformPattern", ac0Var.f26737c);
                paint.setShader(ac0Var.f26735a);
                return paint;
            }
        } else {
            float a2 = i7.w.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27031i != a2 || this.h != 2) {
                this.h = 2;
                this.f27031i = a2;
                ac0 ac0Var2 = this.f27029f;
                ac0Var2.f26735a.setInputBuffer("shaderPattern", cc0Var2.d);
                ac0Var2.f26735a.setInputBuffer("shaderGradient", cc0Var.d);
                ac0Var2.f26735a.setFloatUniform("intensity", a2);
                ac0Var2.f26735a.setFloatUniform("transformGradient", ac0Var2.f26736b);
                ac0Var2.f26735a.setFloatUniform("transformPattern", ac0Var2.f26737c);
                paint.setShader(ac0Var2.f26735a);
                return paint;
            }
        }
        return paint;
    }
}
