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
    public final RectF f27610a = new RectF();
    public final k3 f27611b;
    public final c3 f27612c;
    public final a3 d;
    public final Paint f27613e;
    public final Matrix f27614f;
    public final float[] f27615g;
    public final float[] h;
    public float f27616i;
    public ValueAnimator f27617j;
    public final ic f27618k;
    public final Paint f27619l;
    public final RectF f27620m;
    public final Path f27621n;
    public final Paint f27622o;
    public final RadialGradient f27623p;
    public final Matrix f27624q;
    public final Paint f27625r;

    public j3(k3 k3Var, c3 c3Var, a3 a3Var) {
        Paint paint = new Paint(1);
        this.f27613e = paint;
        this.f27614f = new Matrix();
        this.f27615g = new float[8];
        this.h = new float[8];
        this.f27616i = 0.0f;
        this.f27619l = new Paint(1);
        this.f27620m = new RectF();
        this.f27621n = new Path();
        this.f27622o = new Paint(3);
        this.f27623p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f27624q = new Matrix();
        this.f27625r = new Paint(1);
        this.f27611b = k3Var;
        this.f27612c = c3Var;
        this.d = a3Var;
        this.f27618k = new ic(k3Var);
        paint.setColor(c3Var.f27386r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27617j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27616i, f10);
        this.f27617j = ofFloat;
        ofFloat.addUpdateListener(new fi.v3(this, 15));
        this.f27617j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f27617j, 285.0d, 20.0d);
        } else {
            this.f27617j.setInterpolator(xq.h);
        }
        this.f27617j.start();
    }
}
