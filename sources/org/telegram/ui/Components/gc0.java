package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class gc0 {
    public final Paint f26339a;
    public final hc0 f26340b;
    public final hc0 f26341c;
    public final hc0 d;
    public final fc0 f26342e;
    public final fc0 f26343f;
    public final float[] f26344g;
    public int h;
    public float f26345i;

    public gc0() {
        Paint paint = new Paint();
        this.f26339a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26340b = new hc0(tileMode);
        this.f26341c = new hc0(tileMode);
        this.d = new hc0(Shader.TileMode.REPEAT);
        this.f26342e = new fc0(R.raw.wallpaper_pos_intensity);
        this.f26343f = new fc0(R.raw.wallpaper_neg_intensity);
        this.f26344g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        hc0 hc0Var = this.f26340b;
        boolean b10 = hc0Var.b(bitmap);
        hc0 hc0Var2 = this.d;
        boolean b11 = b10 | hc0Var2.b(bitmap2);
        Paint paint = this.f26339a;
        if (i11 >= 0) {
            hc0 hc0Var3 = this.f26341c;
            if ((b11 | hc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                fc0 fc0Var = this.f26342e;
                fc0Var.f26011a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var.f26011a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var.f26011a.setInputBuffer("shaderGradientSoftLight", hc0Var3.d);
                fc0Var.f26011a.setFloatUniform("transformGradient", fc0Var.f26012b);
                fc0Var.f26011a.setFloatUniform("transformPattern", fc0Var.f26013c);
                paint.setShader(fc0Var.f26011a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26345i != a2 || this.h != 2) {
                this.h = 2;
                this.f26345i = a2;
                fc0 fc0Var2 = this.f26343f;
                fc0Var2.f26011a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var2.f26011a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var2.f26011a.setFloatUniform("intensity", a2);
                fc0Var2.f26011a.setFloatUniform("transformGradient", fc0Var2.f26012b);
                fc0Var2.f26011a.setFloatUniform("transformPattern", fc0Var2.f26013c);
                paint.setShader(fc0Var2.f26011a);
                return paint;
            }
        }
        return paint;
    }
}
