package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
public final class l3 {
    public final RectF f29197a = new RectF();
    public final m3 f29198b;
    public final e3 f29199c;
    public final c3 d;
    public final Paint f29200e;
    public final Matrix f29201f;
    public final float[] f29202g;
    public final float[] h;
    public float f29203i;
    public ValueAnimator f29204j;
    public final mc f29205k;
    public final Paint f29206l;
    public final RectF f29207m;
    public final Path f29208n;
    public final Paint f29209o;
    public final RadialGradient f29210p;
    public final Matrix f29211q;
    public final Paint f29212r;

    public l3(m3 m3Var, e3 e3Var, c3 c3Var) {
        Paint paint = new Paint(1);
        this.f29200e = paint;
        this.f29201f = new Matrix();
        this.f29202g = new float[8];
        this.h = new float[8];
        this.f29203i = 0.0f;
        this.f29206l = new Paint(1);
        this.f29207m = new RectF();
        this.f29208n = new Path();
        this.f29209o = new Paint(3);
        this.f29210p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f29211q = new Matrix();
        this.f29212r = new Paint(1);
        this.f29198b = m3Var;
        this.f29199c = e3Var;
        this.d = c3Var;
        this.f29205k = new mc(m3Var);
        paint.setColor(e3Var.f28921r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29204j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29203i, f10);
        this.f29204j = ofFloat;
        ofFloat.addUpdateListener(new hi.j3(this, 15));
        this.f29204j.addListener(new s0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f29204j, 285.0d, 20.0d);
        } else {
            this.f29204j.setInterpolator(nr.h);
        }
        this.f29204j.start();
    }
}
