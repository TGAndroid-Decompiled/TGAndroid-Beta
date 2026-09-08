package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class gc0 {
    public final Paint f26366a;
    public final hc0 f26367b;
    public final hc0 f26368c;
    public final hc0 d;
    public final fc0 f26369e;
    public final fc0 f26370f;
    public final float[] f26371g;
    public int h;
    public float f26372i;

    public gc0() {
        Paint paint = new Paint();
        this.f26366a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26367b = new hc0(tileMode);
        this.f26368c = new hc0(tileMode);
        this.d = new hc0(Shader.TileMode.REPEAT);
        this.f26369e = new fc0(R.raw.wallpaper_pos_intensity);
        this.f26370f = new fc0(R.raw.wallpaper_neg_intensity);
        this.f26371g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        hc0 hc0Var = this.f26367b;
        boolean b10 = hc0Var.b(bitmap);
        hc0 hc0Var2 = this.d;
        boolean b11 = b10 | hc0Var2.b(bitmap2);
        Paint paint = this.f26366a;
        if (i11 >= 0) {
            hc0 hc0Var3 = this.f26368c;
            if ((b11 | hc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                fc0 fc0Var = this.f26369e;
                fc0Var.f26038a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var.f26038a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var.f26038a.setInputBuffer("shaderGradientSoftLight", hc0Var3.d);
                fc0Var.f26038a.setFloatUniform("transformGradient", fc0Var.f26039b);
                fc0Var.f26038a.setFloatUniform("transformPattern", fc0Var.f26040c);
                paint.setShader(fc0Var.f26038a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f26372i != a2 || this.h != 2) {
                this.h = 2;
                this.f26372i = a2;
                fc0 fc0Var2 = this.f26370f;
                fc0Var2.f26038a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var2.f26038a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var2.f26038a.setFloatUniform("intensity", a2);
                fc0Var2.f26038a.setFloatUniform("transformGradient", fc0Var2.f26039b);
                fc0Var2.f26038a.setFloatUniform("transformPattern", fc0Var2.f26040c);
                paint.setShader(fc0Var2.f26038a);
                return paint;
            }
        }
        return paint;
    }
}
