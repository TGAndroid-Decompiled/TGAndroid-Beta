package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class yc0 {
    public final Paint f35033a;
    public final zc0 f35034b;
    public final zc0 f35035c;
    public final zc0 d;
    public final xc0 e;
    public final xc0 f35036f;
    public final float[] f35037g;
    public int h;
    public float f35038i;

    public yc0() {
        Paint paint = new Paint();
        this.f35033a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f35034b = new zc0(tileMode);
        this.f35035c = new zc0(tileMode);
        this.d = new zc0(Shader.TileMode.REPEAT);
        this.e = new xc0(R.raw.wallpaper_pos_intensity);
        this.f35036f = new xc0(R.raw.wallpaper_neg_intensity);
        this.f35037g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        zc0 zc0Var = this.f35034b;
        boolean b10 = zc0Var.b(bitmap);
        zc0 zc0Var2 = this.d;
        boolean b11 = b10 | zc0Var2.b(bitmap2);
        Paint paint = this.f35033a;
        if (i11 >= 0) {
            zc0 zc0Var3 = this.f35035c;
            if ((b11 | zc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                xc0 xc0Var = this.e;
                xc0Var.f34727a.setInputBuffer("shaderPattern", zc0Var2.d);
                xc0Var.f34727a.setInputBuffer("shaderGradient", zc0Var.d);
                xc0Var.f34727a.setInputBuffer("shaderGradientSoftLight", zc0Var3.d);
                xc0Var.f34727a.setFloatUniform("transformGradient", xc0Var.f34728b);
                xc0Var.f34727a.setFloatUniform("transformPattern", xc0Var.f34729c);
                paint.setShader(xc0Var.f34727a);
                return paint;
            }
        } else {
            float a2 = a8.ee.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f35038i != a2 || this.h != 2) {
                this.h = 2;
                this.f35038i = a2;
                xc0 xc0Var2 = this.f35036f;
                xc0Var2.f34727a.setInputBuffer("shaderPattern", zc0Var2.d);
                xc0Var2.f34727a.setInputBuffer("shaderGradient", zc0Var.d);
                xc0Var2.f34727a.setFloatUniform("intensity", a2);
                xc0Var2.f34727a.setFloatUniform("transformGradient", xc0Var2.f34728b);
                xc0Var2.f34727a.setFloatUniform("transformPattern", xc0Var2.f34729c);
                paint.setShader(xc0Var2.f34727a);
                return paint;
            }
        }
        return paint;
    }
}
