package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
public final class v3 {
    public final RectF f21612a = new RectF();
    public final w3 f21613b;
    public final m3 f21614c;
    public final k3 d;
    public final Paint f21615e;
    public final Matrix f21616f;
    public final float[] f21617g;
    public final float[] h;
    public float f21618i;
    public ValueAnimator f21619j;
    public final zc f21620k;
    public final Paint f21621l;
    public final RectF f21622m;
    public final Path f21623n;
    public final Paint f21624o;
    public final RadialGradient f21625p;
    public final Matrix f21626q;
    public final Paint f21627r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.f21615e = paint;
        this.f21616f = new Matrix();
        this.f21617g = new float[8];
        this.h = new float[8];
        this.f21618i = 0.0f;
        this.f21621l = new Paint(1);
        this.f21622m = new RectF();
        this.f21623n = new Path();
        this.f21624o = new Paint(3);
        this.f21625p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21626q = new Matrix();
        this.f21627r = new Paint(1);
        this.f21613b = w3Var;
        this.f21614c = m3Var;
        this.d = k3Var;
        this.f21620k = new zc(w3Var);
        paint.setColor(m3Var.f21392r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21619j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21618i, f7);
        this.f21619j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21619j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21619j, 285.0d, 20.0d);
        } else {
            this.f21619j.setInterpolator(tr.h);
        }
        this.f21619j.start();
    }
}
