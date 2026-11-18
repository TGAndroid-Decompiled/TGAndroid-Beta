package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
public final class m3 {
    public final RectF f29217a = new RectF();
    public final n3 f29218b;
    public final f3 f29219c;
    public final d3 d;
    public final Paint f29220e;
    public final Matrix f29221f;
    public final float[] f29222g;
    public final float[] h;
    public float f29223i;
    public ValueAnimator f29224j;
    public final mc f29225k;
    public final Paint f29226l;
    public final RectF f29227m;
    public final Path f29228n;
    public final Paint f29229o;
    public final RadialGradient f29230p;
    public final Matrix f29231q;
    public final Paint f29232r;

    public m3(n3 n3Var, f3 f3Var, d3 d3Var) {
        Paint paint = new Paint(1);
        this.f29220e = paint;
        this.f29221f = new Matrix();
        this.f29222g = new float[8];
        this.h = new float[8];
        this.f29223i = 0.0f;
        this.f29226l = new Paint(1);
        this.f29227m = new RectF();
        this.f29228n = new Path();
        this.f29229o = new Paint(3);
        this.f29230p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f29231q = new Matrix();
        this.f29232r = new Paint(1);
        this.f29218b = n3Var;
        this.f29219c = f3Var;
        this.d = d3Var;
        this.f29225k = new mc(n3Var);
        paint.setColor(f3Var.f28942r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29224j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29223i, f10);
        this.f29224j = ofFloat;
        ofFloat.addUpdateListener(new hi.k3(this, 15));
        this.f29224j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f29224j, 285.0d, 20.0d);
        } else {
            this.f29224j.setInterpolator(lr.h);
        }
        this.f29224j.start();
    }
}
