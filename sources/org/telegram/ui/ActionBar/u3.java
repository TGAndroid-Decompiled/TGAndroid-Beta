package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
public final class u3 {
    public final RectF f20707a = new RectF();
    public final v3 f20708b;
    public final l3 f20709c;
    public final j3 d;
    public final Paint e;
    public final Matrix f20710f;
    public final float[] f20711g;
    public final float[] h;
    public float f20712i;
    public ValueAnimator f20713j;
    public final ad f20714k;
    public final Paint f20715l;
    public final RectF f20716m;
    public final Path f20717n;
    public final Paint f20718o;
    public final RadialGradient f20719p;
    public final Matrix f20720q;
    public final Paint f20721r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f20710f = new Matrix();
        this.f20711g = new float[8];
        this.h = new float[8];
        this.f20712i = 0.0f;
        this.f20715l = new Paint(1);
        this.f20716m = new RectF();
        this.f20717n = new Path();
        this.f20718o = new Paint(3);
        this.f20719p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20720q = new Matrix();
        this.f20721r = new Paint(1);
        this.f20708b = v3Var;
        this.f20709c = l3Var;
        this.d = j3Var;
        this.f20714k = new ad(v3Var);
        paint.setColor(l3Var.f20499r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f20713j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20712i, f7);
        this.f20713j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f20713j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f20713j, 285.0d, 20.0d);
        } else {
            this.f20713j.setInterpolator(es.h);
        }
        this.f20713j.start();
    }
}
