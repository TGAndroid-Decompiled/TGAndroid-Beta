package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
public final class y3 {
    public final RectF f18774a = new RectF();
    public final z3 f18775b;
    public final p3 f18776c;
    public final n3 d;
    public final Paint e;
    public final Matrix f18777f;
    public final float[] f18778g;
    public final float[] h;
    public float f18779i;
    public ValueAnimator f18780j;
    public final xc f18781k;
    public final Paint f18782l;
    public final RectF f18783m;
    public final Path f18784n;
    public final Paint f18785o;
    public final RadialGradient f18786p;
    public final Matrix f18787q;
    public final Paint f18788r;

    public y3(z3 z3Var, p3 p3Var, n3 n3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f18777f = new Matrix();
        this.f18778g = new float[8];
        this.h = new float[8];
        this.f18779i = 0.0f;
        this.f18782l = new Paint(1);
        this.f18783m = new RectF();
        this.f18784n = new Path();
        this.f18785o = new Paint(3);
        this.f18786p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f18787q = new Matrix();
        this.f18788r = new Paint(1);
        this.f18775b = z3Var;
        this.f18776c = p3Var;
        this.d = n3Var;
        this.f18781k = new xc(z3Var);
        paint.setColor(p3Var.f18554r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f18780j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f18779i, f7);
        this.f18780j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f18780j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f18780j, 285.0d, 20.0d);
        } else {
            this.f18780j.setInterpolator(wr.h);
        }
        this.f18780j.start();
    }
}
