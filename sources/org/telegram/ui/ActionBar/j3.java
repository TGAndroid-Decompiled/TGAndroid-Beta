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
    public final RectF f27609a = new RectF();
    public final k3 f27610b;
    public final c3 f27611c;
    public final a3 d;
    public final Paint f27612e;
    public final Matrix f27613f;
    public final float[] f27614g;
    public final float[] h;
    public float f27615i;
    public ValueAnimator f27616j;
    public final ic f27617k;
    public final Paint f27618l;
    public final RectF f27619m;
    public final Path f27620n;
    public final Paint f27621o;
    public final RadialGradient f27622p;
    public final Matrix f27623q;
    public final Paint f27624r;

    public j3(k3 k3Var, c3 c3Var, a3 a3Var) {
        Paint paint = new Paint(1);
        this.f27612e = paint;
        this.f27613f = new Matrix();
        this.f27614g = new float[8];
        this.h = new float[8];
        this.f27615i = 0.0f;
        this.f27618l = new Paint(1);
        this.f27619m = new RectF();
        this.f27620n = new Path();
        this.f27621o = new Paint(3);
        this.f27622p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f27623q = new Matrix();
        this.f27624r = new Paint(1);
        this.f27610b = k3Var;
        this.f27611c = c3Var;
        this.d = a3Var;
        this.f27617k = new ic(k3Var);
        paint.setColor(c3Var.f27385r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27616j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27615i, f10);
        this.f27616j = ofFloat;
        ofFloat.addUpdateListener(new fi.v3(this, 15));
        this.f27616j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f27616j, 285.0d, 20.0d);
        } else {
            this.f27616j.setInterpolator(xq.h);
        }
        this.f27616j.start();
    }
}
