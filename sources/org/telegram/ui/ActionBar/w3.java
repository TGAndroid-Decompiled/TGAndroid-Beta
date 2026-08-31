package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class w3 {
    public final RectF f22374a = new RectF();
    public final x3 f22375b;
    public final n3 f22376c;
    public final l3 d;
    public final Paint f22377e;
    public final Matrix f22378f;
    public final float[] f22379g;
    public final float[] h;
    public float f22380i;
    public ValueAnimator f22381j;
    public final rc f22382k;
    public final Paint f22383l;
    public final RectF f22384m;
    public final Path f22385n;
    public final Paint f22386o;
    public final RadialGradient f22387p;
    public final Matrix f22388q;
    public final Paint f22389r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.f22377e = paint;
        this.f22378f = new Matrix();
        this.f22379g = new float[8];
        this.h = new float[8];
        this.f22380i = 0.0f;
        this.f22383l = new Paint(1);
        this.f22384m = new RectF();
        this.f22385n = new Path();
        this.f22386o = new Paint(3);
        this.f22387p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f22388q = new Matrix();
        this.f22389r = new Paint(1);
        this.f22375b = x3Var;
        this.f22376c = n3Var;
        this.d = l3Var;
        this.f22382k = new rc(x3Var);
        paint.setColor(n3Var.f22173p);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f22381j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22380i, f10);
        this.f22381j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f22381j.addListener(new a1(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.f22381j, 285.0d, 20.0d);
        } else {
            this.f22381j.setInterpolator(pr.h);
        }
        this.f22381j.start();
    }
}
