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
    public final RectF f21786a = new RectF();
    public final w3 f21787b;
    public final m3 f21788c;
    public final k3 d;
    public final Paint e;
    public final Matrix f21789f;
    public final float[] f21790g;
    public final float[] h;
    public float f21791i;
    public ValueAnimator f21792j;
    public final yc f21793k;
    public final Paint f21794l;
    public final RectF f21795m;
    public final Path f21796n;
    public final Paint f21797o;
    public final RadialGradient f21798p;
    public final Matrix f21799q;
    public final Paint f21800r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21789f = new Matrix();
        this.f21790g = new float[8];
        this.h = new float[8];
        this.f21791i = 0.0f;
        this.f21794l = new Paint(1);
        this.f21795m = new RectF();
        this.f21796n = new Path();
        this.f21797o = new Paint(3);
        this.f21798p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21799q = new Matrix();
        this.f21800r = new Paint(1);
        this.f21787b = w3Var;
        this.f21788c = m3Var;
        this.d = k3Var;
        this.f21793k = new yc(w3Var);
        paint.setColor(m3Var.f21596r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21792j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21791i, f7);
        this.f21792j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21792j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21792j, 285.0d, 20.0d);
        } else {
            this.f21792j.setInterpolator(bs.h);
        }
        this.f21792j.start();
    }
}
