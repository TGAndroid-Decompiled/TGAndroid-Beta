package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
public final class v3 {
    public final RectF f21782a = new RectF();
    public final w3 f21783b;
    public final m3 f21784c;
    public final k3 d;
    public final Paint e;
    public final Matrix f21785f;
    public final float[] f21786g;
    public final float[] h;
    public float f21787i;
    public ValueAnimator f21788j;
    public final yc f21789k;
    public final Paint f21790l;
    public final RectF f21791m;
    public final Path f21792n;
    public final Paint f21793o;
    public final RadialGradient f21794p;
    public final Matrix f21795q;
    public final Paint f21796r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21785f = new Matrix();
        this.f21786g = new float[8];
        this.h = new float[8];
        this.f21787i = 0.0f;
        this.f21790l = new Paint(1);
        this.f21791m = new RectF();
        this.f21792n = new Path();
        this.f21793o = new Paint(3);
        this.f21794p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21795q = new Matrix();
        this.f21796r = new Paint(1);
        this.f21783b = w3Var;
        this.f21784c = m3Var;
        this.d = k3Var;
        this.f21789k = new yc(w3Var);
        paint.setColor(m3Var.f21592r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21788j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21787i, f7);
        this.f21788j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21788j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21788j, 285.0d, 20.0d);
        } else {
            this.f21788j.setInterpolator(bs.h);
        }
        this.f21788j.start();
    }
}
