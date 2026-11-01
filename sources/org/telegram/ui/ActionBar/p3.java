package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
public final class p3 {
    public final RectF f20637a = new RectF();
    public final q3 f20638b;
    public final h3 f20639c;
    public final f3 d;
    public final Paint e;
    public final Matrix f20640f;
    public final float[] f20641g;
    public final float[] h;
    public float f20642i;
    public ValueAnimator f20643j;
    public final dc f20644k;
    public final Paint f20645l;
    public final RectF f20646m;
    public final Path f20647n;
    public final Paint f20648o;
    public final RadialGradient f20649p;
    public final Matrix f20650q;
    public final Paint f20651r;

    public p3(q3 q3Var, h3 h3Var, f3 f3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f20640f = new Matrix();
        this.f20641g = new float[8];
        this.h = new float[8];
        this.f20642i = 0.0f;
        this.f20645l = new Paint(1);
        this.f20646m = new RectF();
        this.f20647n = new Path();
        this.f20648o = new Paint(3);
        this.f20649p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20650q = new Matrix();
        this.f20651r = new Paint(1);
        this.f20638b = q3Var;
        this.f20639c = h3Var;
        this.d = f3Var;
        this.f20644k = new dc(q3Var);
        paint.setColor(h3Var.f20369r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f20643j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20642i, f7);
        this.f20643j = ofFloat;
        ofFloat.addUpdateListener(new bg.k(this, 19));
        this.f20643j.addListener(new v0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            org.telegram.messenger.i0.n(this.f20643j, 285.0d, 20.0d);
        } else {
            this.f20643j.setInterpolator(gr.h);
        }
        this.f20643j.start();
    }
}
