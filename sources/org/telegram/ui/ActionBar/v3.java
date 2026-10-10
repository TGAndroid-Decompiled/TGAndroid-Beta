package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.is;
public final class v3 {
    public final RectF f21616a = new RectF();
    public final w3 f21617b;
    public final m3 f21618c;
    public final k3 d;
    public final Paint f21619e;
    public final Matrix f21620f;
    public final float[] f21621g;
    public final float[] h;
    public float f21622i;
    public ValueAnimator f21623j;
    public final bd f21624k;
    public final Paint f21625l;
    public final RectF f21626m;
    public final Path f21627n;
    public final Paint f21628o;
    public final RadialGradient f21629p;
    public final Matrix f21630q;
    public final Paint f21631r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.f21619e = paint;
        this.f21620f = new Matrix();
        this.f21621g = new float[8];
        this.h = new float[8];
        this.f21622i = 0.0f;
        this.f21625l = new Paint(1);
        this.f21626m = new RectF();
        this.f21627n = new Path();
        this.f21628o = new Paint(3);
        this.f21629p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21630q = new Matrix();
        this.f21631r = new Paint(1);
        this.f21617b = w3Var;
        this.f21618c = m3Var;
        this.d = k3Var;
        this.f21624k = new bd(w3Var);
        paint.setColor(m3Var.f21394r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21623j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21622i, f7);
        this.f21623j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21623j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21623j, 285.0d, 20.0d);
        } else {
            this.f21623j.setInterpolator(is.h);
        }
        this.f21623j.start();
    }
}
