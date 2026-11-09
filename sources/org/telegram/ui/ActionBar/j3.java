package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
public final class j3 {
    public final RectF f27600a = new RectF();
    public final k3 f27601b;
    public final c3 f27602c;
    public final a3 d;
    public final Paint f27603e;
    public final Matrix f27604f;
    public final float[] f27605g;
    public final float[] h;
    public float f27606i;
    public ValueAnimator f27607j;
    public final ic f27608k;
    public final Paint f27609l;
    public final RectF f27610m;
    public final Path f27611n;
    public final Paint f27612o;
    public final RadialGradient f27613p;
    public final Matrix f27614q;
    public final Paint f27615r;

    public j3(k3 k3Var, c3 c3Var, a3 a3Var) {
        Paint paint = new Paint(1);
        this.f27603e = paint;
        this.f27604f = new Matrix();
        this.f27605g = new float[8];
        this.h = new float[8];
        this.f27606i = 0.0f;
        this.f27609l = new Paint(1);
        this.f27610m = new RectF();
        this.f27611n = new Path();
        this.f27612o = new Paint(3);
        this.f27613p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f27614q = new Matrix();
        this.f27615r = new Paint(1);
        this.f27601b = k3Var;
        this.f27602c = c3Var;
        this.d = a3Var;
        this.f27608k = new ic(k3Var);
        paint.setColor(c3Var.f27381r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27607j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27606i, f10);
        this.f27607j = ofFloat;
        ofFloat.addUpdateListener(new fi.v3(this, 15));
        this.f27607j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f27607j, 285.0d, 20.0d);
        } else {
            this.f27607j.setInterpolator(xq.h);
        }
        this.f27607j.start();
    }
}
