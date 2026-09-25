package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;
public final class pc0 {
    public final Paint f27317a;
    public final qc0 f27318b;
    public final qc0 f27319c;
    public final qc0 d;
    public final oc0 e;
    public final oc0 f27320f;
    public final float[] f27321g;
    public int h;
    public float f27322i;

    public pc0() {
        Paint paint = new Paint();
        this.f27317a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27318b = new qc0(tileMode);
        this.f27319c = new qc0(tileMode);
        this.d = new qc0(Shader.TileMode.REPEAT);
        this.e = new oc0(R.raw.wallpaper_pos_intensity);
        this.f27320f = new oc0(R.raw.wallpaper_neg_intensity);
        this.f27321g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        qc0 qc0Var = this.f27318b;
        boolean b10 = qc0Var.b(bitmap);
        qc0 qc0Var2 = this.d;
        boolean b11 = b10 | qc0Var2.b(bitmap2);
        Paint paint = this.f27317a;
        if (i11 >= 0) {
            qc0 qc0Var3 = this.f27319c;
            if ((b11 | qc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                oc0 oc0Var = this.e;
                oc0Var.f27025a.setInputBuffer("shaderPattern", qc0Var2.d);
                oc0Var.f27025a.setInputBuffer("shaderGradient", qc0Var.d);
                oc0Var.f27025a.setInputBuffer("shaderGradientSoftLight", qc0Var3.d);
                oc0Var.f27025a.setFloatUniform("transformGradient", oc0Var.f27026b);
                oc0Var.f27025a.setFloatUniform("transformPattern", oc0Var.f27027c);
                paint.setShader(oc0Var.f27025a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.f27322i != a2 || this.h != 2) {
                this.h = 2;
                this.f27322i = a2;
                oc0 oc0Var2 = this.f27320f;
                oc0Var2.f27025a.setInputBuffer("shaderPattern", qc0Var2.d);
                oc0Var2.f27025a.setInputBuffer("shaderGradient", qc0Var.d);
                oc0Var2.f27025a.setFloatUniform("intensity", a2);
                oc0Var2.f27025a.setFloatUniform("transformGradient", oc0Var2.f27026b);
                oc0Var2.f27025a.setFloatUniform("transformPattern", oc0Var2.f27027c);
                paint.setShader(oc0Var2.f27025a);
                return paint;
            }
        }
        return paint;
    }
}
