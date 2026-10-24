package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class zc0 {
    public final Paint f33242a;
    public final ad0 f33243b;
    public final ad0 f33244c;
    public final ad0 d;
    public final yc0 e;
    public final yc0 f33245f;
    public final float[] f33246g;
    public int h;
    public float f33247i;

    public zc0() {
        Paint paint = new Paint();
        this.f33242a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33243b = new ad0(tileMode);
        this.f33244c = new ad0(tileMode);
        this.d = new ad0(Shader.TileMode.REPEAT);
        this.e = new yc0(R.raw.wallpaper_pos_intensity);
        this.f33245f = new yc0(R.raw.wallpaper_neg_intensity);
        this.f33246g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        ad0 ad0Var = this.f33243b;
        boolean b10 = ad0Var.b(bitmap);
        ad0 ad0Var2 = this.d;
        boolean b11 = b10 | ad0Var2.b(bitmap2);
        Paint paint = this.f33242a;
        if (i11 >= 0) {
            ad0 ad0Var3 = this.f33244c;
            if ((b11 | ad0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                yc0 yc0Var = this.e;
                yc0Var.f32881a.setInputBuffer("shaderPattern", ad0Var2.d);
                yc0Var.f32881a.setInputBuffer("shaderGradient", ad0Var.d);
                yc0Var.f32881a.setInputBuffer("shaderGradientSoftLight", ad0Var3.d);
                yc0Var.f32881a.setFloatUniform("transformGradient", yc0Var.f32882b);
                yc0Var.f32881a.setFloatUniform("transformPattern", yc0Var.f32883c);
                paint.setShader(yc0Var.f32881a);
                return paint;
            }
        } else {
            float a2 = w7.r.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f33247i != a2 || this.h != 2) {
                this.h = 2;
                this.f33247i = a2;
                yc0 yc0Var2 = this.f33245f;
                yc0Var2.f32881a.setInputBuffer("shaderPattern", ad0Var2.d);
                yc0Var2.f32881a.setInputBuffer("shaderGradient", ad0Var.d);
                yc0Var2.f32881a.setFloatUniform("intensity", a2);
                yc0Var2.f32881a.setFloatUniform("transformGradient", yc0Var2.f32882b);
                yc0Var2.f32881a.setFloatUniform("transformPattern", yc0Var2.f32883c);
                paint.setShader(yc0Var2.f32881a);
                return paint;
            }
        }
        return paint;
    }
}
