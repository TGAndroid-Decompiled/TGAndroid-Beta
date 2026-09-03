package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class hc0 {
    public final Paint f25377a;
    public final ic0 f25378b;
    public final ic0 f25379c;
    public final ic0 d;
    public final gc0 e;
    public final gc0 f25380f;
    public final float[] f25381g;
    public int h;
    public float f25382i;

    public hc0() {
        Paint paint = new Paint();
        this.f25377a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f25378b = new ic0(tileMode);
        this.f25379c = new ic0(tileMode);
        this.d = new ic0(Shader.TileMode.REPEAT);
        this.e = new gc0(R.raw.wallpaper_pos_intensity);
        this.f25380f = new gc0(R.raw.wallpaper_neg_intensity);
        this.f25381g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        ic0 ic0Var = this.f25378b;
        boolean b10 = ic0Var.b(bitmap);
        ic0 ic0Var2 = this.d;
        boolean b11 = b10 | ic0Var2.b(bitmap2);
        Paint paint = this.f25377a;
        if (i11 >= 0) {
            ic0 ic0Var3 = this.f25379c;
            if ((b11 | ic0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                gc0 gc0Var = this.e;
                gc0Var.f25115a.setInputBuffer("shaderPattern", ic0Var2.d);
                gc0Var.f25115a.setInputBuffer("shaderGradient", ic0Var.d);
                gc0Var.f25115a.setInputBuffer("shaderGradientSoftLight", ic0Var3.d);
                gc0Var.f25115a.setFloatUniform("transformGradient", gc0Var.f25116b);
                gc0Var.f25115a.setFloatUniform("transformPattern", gc0Var.f25117c);
                paint.setShader(gc0Var.f25115a);
                return paint;
            }
        } else {
            float a2 = k7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f25382i != a2 || this.h != 2) {
                this.h = 2;
                this.f25382i = a2;
                gc0 gc0Var2 = this.f25380f;
                gc0Var2.f25115a.setInputBuffer("shaderPattern", ic0Var2.d);
                gc0Var2.f25115a.setInputBuffer("shaderGradient", ic0Var.d);
                gc0Var2.f25115a.setFloatUniform("intensity", a2);
                gc0Var2.f25115a.setFloatUniform("transformGradient", gc0Var2.f25116b);
                gc0Var2.f25115a.setFloatUniform("transformPattern", gc0Var2.f25117c);
                paint.setShader(gc0Var2.f25115a);
                return paint;
            }
        }
        return paint;
    }
}
