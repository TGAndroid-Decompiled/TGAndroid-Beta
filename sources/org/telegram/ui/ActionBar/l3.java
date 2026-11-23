package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
public final class l3 {
    public final RectF f29251a = new RectF();
    public final m3 f29252b;
    public final e3 f29253c;
    public final c3 d;
    public final Paint f29254e;
    public final Matrix f29255f;
    public final float[] f29256g;
    public final float[] h;
    public float f29257i;
    public ValueAnimator f29258j;
    public final lc f29259k;
    public final Paint f29260l;
    public final RectF f29261m;
    public final Path f29262n;
    public final Paint f29263o;
    public final RadialGradient f29264p;
    public final Matrix f29265q;
    public final Paint f29266r;

    public l3(m3 m3Var, e3 e3Var, c3 c3Var) {
        Paint paint = new Paint(1);
        this.f29254e = paint;
        this.f29255f = new Matrix();
        this.f29256g = new float[8];
        this.h = new float[8];
        this.f29257i = 0.0f;
        this.f29260l = new Paint(1);
        this.f29261m = new RectF();
        this.f29262n = new Path();
        this.f29263o = new Paint(3);
        this.f29264p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f29265q = new Matrix();
        this.f29266r = new Paint(1);
        this.f29252b = m3Var;
        this.f29253c = e3Var;
        this.d = c3Var;
        this.f29259k = new lc(m3Var);
        paint.setColor(e3Var.f28967r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29258j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29257i, f10);
        this.f29258j = ofFloat;
        ofFloat.addUpdateListener(new hi.s3(this, 15));
        this.f29258j.addListener(new s0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f29258j, 285.0d, 20.0d);
        } else {
            this.f29258j.setInterpolator(kr.h);
        }
        this.f29258j.start();
    }
}
