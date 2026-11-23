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
    public final RectF f29166a = new RectF();
    public final m3 f29167b;
    public final e3 f29168c;
    public final c3 d;
    public final Paint f29169e;
    public final Matrix f29170f;
    public final float[] f29171g;
    public final float[] h;
    public float f29172i;
    public ValueAnimator f29173j;
    public final mc f29174k;
    public final Paint f29175l;
    public final RectF f29176m;
    public final Path f29177n;
    public final Paint f29178o;
    public final RadialGradient f29179p;
    public final Matrix f29180q;
    public final Paint f29181r;

    public l3(m3 m3Var, e3 e3Var, c3 c3Var) {
        Paint paint = new Paint(1);
        this.f29169e = paint;
        this.f29170f = new Matrix();
        this.f29171g = new float[8];
        this.h = new float[8];
        this.f29172i = 0.0f;
        this.f29175l = new Paint(1);
        this.f29176m = new RectF();
        this.f29177n = new Path();
        this.f29178o = new Paint(3);
        this.f29179p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f29180q = new Matrix();
        this.f29181r = new Paint(1);
        this.f29167b = m3Var;
        this.f29168c = e3Var;
        this.d = c3Var;
        this.f29174k = new mc(m3Var);
        paint.setColor(e3Var.f28890r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29173j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29172i, f10);
        this.f29173j = ofFloat;
        ofFloat.addUpdateListener(new hi.j3(this, 15));
        this.f29173j.addListener(new s0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f29173j, 285.0d, 20.0d);
        } else {
            this.f29173j.setInterpolator(nr.h);
        }
        this.f29173j.start();
    }
}
