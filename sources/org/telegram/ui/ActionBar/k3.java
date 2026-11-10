package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wq;
public final class k3 {
    public final RectF f27638a = new RectF();
    public final l3 f27639b;
    public final d3 f27640c;
    public final b3 d;
    public final Paint f27641e;
    public final Matrix f27642f;
    public final float[] f27643g;
    public final float[] h;
    public float f27644i;
    public ValueAnimator f27645j;
    public final hc f27646k;
    public final Paint f27647l;
    public final RectF f27648m;
    public final Path f27649n;
    public final Paint f27650o;
    public final RadialGradient f27651p;
    public final Matrix f27652q;
    public final Paint f27653r;

    public k3(l3 l3Var, d3 d3Var, b3 b3Var) {
        Paint paint = new Paint(1);
        this.f27641e = paint;
        this.f27642f = new Matrix();
        this.f27643g = new float[8];
        this.h = new float[8];
        this.f27644i = 0.0f;
        this.f27647l = new Paint(1);
        this.f27648m = new RectF();
        this.f27649n = new Path();
        this.f27650o = new Paint(3);
        this.f27651p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f27652q = new Matrix();
        this.f27653r = new Paint(1);
        this.f27639b = l3Var;
        this.f27640c = d3Var;
        this.d = b3Var;
        this.f27646k = new hc(l3Var);
        paint.setColor(d3Var.f27407r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27645j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27644i, f10);
        this.f27645j = ofFloat;
        ofFloat.addUpdateListener(new fi.v3(this, 15));
        this.f27645j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f27645j, 285.0d, 20.0d);
        } else {
            this.f27645j.setInterpolator(wq.h);
        }
        this.f27645j.start();
    }
}
