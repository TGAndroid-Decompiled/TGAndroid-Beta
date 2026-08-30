package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class gc0 {
    public final Paint f25100a;
    public final hc0 f25101b;
    public final hc0 f25102c;
    public final hc0 d;
    public final fc0 e;
    public final fc0 f25103f;
    public final float[] f25104g;
    public int h;
    public float f25105i;

    public gc0() {
        Paint paint = new Paint();
        this.f25100a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f25101b = new hc0(tileMode);
        this.f25102c = new hc0(tileMode);
        this.d = new hc0(Shader.TileMode.REPEAT);
        this.e = new fc0(R.raw.wallpaper_pos_intensity);
        this.f25103f = new fc0(R.raw.wallpaper_neg_intensity);
        this.f25104g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        hc0 hc0Var = this.f25101b;
        boolean b10 = hc0Var.b(bitmap);
        hc0 hc0Var2 = this.d;
        boolean b11 = b10 | hc0Var2.b(bitmap2);
        Paint paint = this.f25100a;
        if (i11 >= 0) {
            hc0 hc0Var3 = this.f25102c;
            if ((b11 | hc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                fc0 fc0Var = this.e;
                fc0Var.f24848a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var.f24848a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var.f24848a.setInputBuffer("shaderGradientSoftLight", hc0Var3.d);
                fc0Var.f24848a.setFloatUniform("transformGradient", fc0Var.f24849b);
                fc0Var.f24848a.setFloatUniform("transformPattern", fc0Var.f24850c);
                paint.setShader(fc0Var.f24848a);
                return paint;
            }
        } else {
            float a2 = k7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f25105i != a2 || this.h != 2) {
                this.h = 2;
                this.f25105i = a2;
                fc0 fc0Var2 = this.f25103f;
                fc0Var2.f24848a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var2.f24848a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var2.f24848a.setFloatUniform("intensity", a2);
                fc0Var2.f24848a.setFloatUniform("transformGradient", fc0Var2.f24849b);
                fc0Var2.f24848a.setFloatUniform("transformPattern", fc0Var2.f24850c);
                paint.setShader(fc0Var2.f24848a);
                return paint;
            }
        }
        return paint;
    }
}
