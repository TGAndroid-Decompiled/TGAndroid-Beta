package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
public final class v3 {
    public final RectF f20616a = new RectF();
    public final w3 f20617b;
    public final m3 f20618c;
    public final k3 d;
    public final Paint e;
    public final Matrix f20619f;
    public final float[] f20620g;
    public final float[] h;
    public float f20621i;
    public ValueAnimator f20622j;
    public final rc f20623k;
    public final Paint f20624l;
    public final RectF f20625m;
    public final Path f20626n;
    public final Paint f20627o;
    public final RadialGradient f20628p;
    public final Matrix f20629q;
    public final Paint f20630r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f20619f = new Matrix();
        this.f20620g = new float[8];
        this.h = new float[8];
        this.f20621i = 0.0f;
        this.f20624l = new Paint(1);
        this.f20625m = new RectF();
        this.f20626n = new Path();
        this.f20627o = new Paint(3);
        this.f20628p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20629q = new Matrix();
        this.f20630r = new Paint(1);
        this.f20617b = w3Var;
        this.f20618c = m3Var;
        this.d = k3Var;
        this.f20623k = new rc(w3Var);
        paint.setColor(m3Var.f20460p);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f20622j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20621i, f10);
        this.f20622j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f20622j.addListener(new a1(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.f20622j, 285.0d, 20.0d);
        } else {
            this.f20622j.setInterpolator(nr.h);
        }
        this.f20622j.start();
    }
}
