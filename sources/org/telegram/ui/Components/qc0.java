package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class qc0 {
    public final Paint f27538a;
    public final rc0 f27539b;
    public final rc0 f27540c;
    public final rc0 d;
    public final pc0 e;
    public final pc0 f27541f;
    public final float[] f27542g;
    public int h;
    public float f27543i;

    public qc0() {
        Paint paint = new Paint();
        this.f27538a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27539b = new rc0(tileMode);
        this.f27540c = new rc0(tileMode);
        this.d = new rc0(Shader.TileMode.REPEAT);
        this.e = new pc0(R.raw.wallpaper_pos_intensity);
        this.f27541f = new pc0(R.raw.wallpaper_neg_intensity);
        this.f27542g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        rc0 rc0Var = this.f27539b;
        boolean b10 = rc0Var.b(bitmap);
        rc0 rc0Var2 = this.d;
        boolean b11 = b10 | rc0Var2.b(bitmap2);
        Paint paint = this.f27538a;
        if (i11 >= 0) {
            rc0 rc0Var3 = this.f27540c;
            if ((b11 | rc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                pc0 pc0Var = this.e;
                pc0Var.f27323a.setInputBuffer("shaderPattern", rc0Var2.d);
                pc0Var.f27323a.setInputBuffer("shaderGradient", rc0Var.d);
                pc0Var.f27323a.setInputBuffer("shaderGradientSoftLight", rc0Var3.d);
                pc0Var.f27323a.setFloatUniform("transformGradient", pc0Var.f27324b);
                pc0Var.f27323a.setFloatUniform("transformPattern", pc0Var.f27325c);
                paint.setShader(pc0Var.f27323a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27543i != a2 || this.h != 2) {
                this.h = 2;
                this.f27543i = a2;
                pc0 pc0Var2 = this.f27541f;
                pc0Var2.f27323a.setInputBuffer("shaderPattern", rc0Var2.d);
                pc0Var2.f27323a.setInputBuffer("shaderGradient", rc0Var.d);
                pc0Var2.f27323a.setFloatUniform("intensity", a2);
                pc0Var2.f27323a.setFloatUniform("transformGradient", pc0Var2.f27324b);
                pc0Var2.f27323a.setFloatUniform("transformPattern", pc0Var2.f27325c);
                paint.setShader(pc0Var2.f27323a);
                return paint;
            }
        }
        return paint;
    }
}
