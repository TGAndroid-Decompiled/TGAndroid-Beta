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
    public final RectF f29215a = new RectF();
    public final n3 f29216b;
    public final f3 f29217c;
    public final d3 d;
    public final Paint f29218e;
    public final Matrix f29219f;
    public final float[] f29220g;
    public final float[] h;
    public float f29221i;
    public ValueAnimator f29222j;
    public final mc f29223k;
    public final Paint f29224l;
    public final RectF f29225m;
    public final Path f29226n;
    public final Paint f29227o;
    public final RadialGradient f29228p;
    public final Matrix f29229q;
    public final Paint f29230r;

    public m3(n3 n3Var, f3 f3Var, d3 d3Var) {
        Paint paint = new Paint(1);
        this.f29218e = paint;
        this.f29219f = new Matrix();
        this.f29220g = new float[8];
        this.h = new float[8];
        this.f29221i = 0.0f;
        this.f29224l = new Paint(1);
        this.f29225m = new RectF();
        this.f29226n = new Path();
        this.f29227o = new Paint(3);
        this.f29228p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f29229q = new Matrix();
        this.f29230r = new Paint(1);
        this.f29216b = n3Var;
        this.f29217c = f3Var;
        this.d = d3Var;
        this.f29223k = new mc(n3Var);
        paint.setColor(f3Var.f28940r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29222j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29221i, f10);
        this.f29222j = ofFloat;
        ofFloat.addUpdateListener(new hi.k3(this, 15));
        this.f29222j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f29222j, 285.0d, 20.0d);
        } else {
            this.f29222j.setInterpolator(lr.h);
        }
        this.f29222j.start();
    }
}
