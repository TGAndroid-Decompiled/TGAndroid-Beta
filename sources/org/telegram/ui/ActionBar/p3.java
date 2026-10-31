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
    public final RectF f20636a = new RectF();
    public final q3 f20637b;
    public final h3 f20638c;
    public final f3 d;
    public final Paint e;
    public final Matrix f20639f;
    public final float[] f20640g;
    public final float[] h;
    public float f20641i;
    public ValueAnimator f20642j;
    public final dc f20643k;
    public final Paint f20644l;
    public final RectF f20645m;
    public final Path f20646n;
    public final Paint f20647o;
    public final RadialGradient f20648p;
    public final Matrix f20649q;
    public final Paint f20650r;

    public p3(q3 q3Var, h3 h3Var, f3 f3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f20639f = new Matrix();
        this.f20640g = new float[8];
        this.h = new float[8];
        this.f20641i = 0.0f;
        this.f20644l = new Paint(1);
        this.f20645m = new RectF();
        this.f20646n = new Path();
        this.f20647o = new Paint(3);
        this.f20648p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20649q = new Matrix();
        this.f20650r = new Paint(1);
        this.f20637b = q3Var;
        this.f20638c = h3Var;
        this.d = f3Var;
        this.f20643k = new dc(q3Var);
        paint.setColor(h3Var.f20368r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f20642j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20641i, f7);
        this.f20642j = ofFloat;
        ofFloat.addUpdateListener(new bg.k(this, 19));
        this.f20642j.addListener(new v0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            org.telegram.messenger.i0.n(this.f20642j, 285.0d, 20.0d);
        } else {
            this.f20642j.setInterpolator(gr.h);
        }
        this.f20642j.start();
    }
}
