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
    public final RectF f27613a = new RectF();
    public final k3 f27614b;
    public final c3 f27615c;
    public final a3 d;
    public final Paint f27616e;
    public final Matrix f27617f;
    public final float[] f27618g;
    public final float[] h;
    public float f27619i;
    public ValueAnimator f27620j;
    public final ic f27621k;
    public final Paint f27622l;
    public final RectF f27623m;
    public final Path f27624n;
    public final Paint f27625o;
    public final RadialGradient f27626p;
    public final Matrix f27627q;
    public final Paint f27628r;

    public j3(k3 k3Var, c3 c3Var, a3 a3Var) {
        Paint paint = new Paint(1);
        this.f27616e = paint;
        this.f27617f = new Matrix();
        this.f27618g = new float[8];
        this.h = new float[8];
        this.f27619i = 0.0f;
        this.f27622l = new Paint(1);
        this.f27623m = new RectF();
        this.f27624n = new Path();
        this.f27625o = new Paint(3);
        this.f27626p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f27627q = new Matrix();
        this.f27628r = new Paint(1);
        this.f27614b = k3Var;
        this.f27615c = c3Var;
        this.d = a3Var;
        this.f27621k = new ic(k3Var);
        paint.setColor(c3Var.f27389r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27620j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27619i, f10);
        this.f27620j = ofFloat;
        ofFloat.addUpdateListener(new fi.v3(this, 15));
        this.f27620j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f27620j, 285.0d, 20.0d);
        } else {
            this.f27620j.setInterpolator(xq.h);
        }
        this.f27620j.start();
    }
}
