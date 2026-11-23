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
    public final RectF f29200a = new RectF();
    public final m3 f29201b;
    public final e3 f29202c;
    public final c3 d;
    public final Paint f29203e;
    public final Matrix f29204f;
    public final float[] f29205g;
    public final float[] h;
    public float f29206i;
    public ValueAnimator f29207j;
    public final mc f29208k;
    public final Paint f29209l;
    public final RectF f29210m;
    public final Path f29211n;
    public final Paint f29212o;
    public final RadialGradient f29213p;
    public final Matrix f29214q;
    public final Paint f29215r;

    public l3(m3 m3Var, e3 e3Var, c3 c3Var) {
        Paint paint = new Paint(1);
        this.f29203e = paint;
        this.f29204f = new Matrix();
        this.f29205g = new float[8];
        this.h = new float[8];
        this.f29206i = 0.0f;
        this.f29209l = new Paint(1);
        this.f29210m = new RectF();
        this.f29211n = new Path();
        this.f29212o = new Paint(3);
        this.f29213p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f29214q = new Matrix();
        this.f29215r = new Paint(1);
        this.f29201b = m3Var;
        this.f29202c = e3Var;
        this.d = c3Var;
        this.f29208k = new mc(m3Var);
        paint.setColor(e3Var.f28924r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29207j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29206i, f10);
        this.f29207j = ofFloat;
        ofFloat.addUpdateListener(new hi.j3(this, 15));
        this.f29207j.addListener(new s0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f29207j, 285.0d, 20.0d);
        } else {
            this.f29207j.setInterpolator(nr.h);
        }
        this.f29207j.start();
    }
}
