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
import org.telegram.ui.Components.zc;
public final class w3 {
    public final RectF f21480a = new RectF();
    public final x3 f21481b;
    public final n3 f21482c;
    public final l3 d;
    public final Paint f21483e;
    public final Matrix f21484f;
    public final float[] f21485g;
    public final float[] h;
    public float f21486i;
    public ValueAnimator f21487j;
    public final zc f21488k;
    public final Paint f21489l;
    public final RectF f21490m;
    public final Path f21491n;
    public final Paint f21492o;
    public final RadialGradient f21493p;
    public final Matrix f21494q;
    public final Paint f21495r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.f21483e = paint;
        this.f21484f = new Matrix();
        this.f21485g = new float[8];
        this.h = new float[8];
        this.f21486i = 0.0f;
        this.f21489l = new Paint(1);
        this.f21490m = new RectF();
        this.f21491n = new Path();
        this.f21492o = new Paint(3);
        this.f21493p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21494q = new Matrix();
        this.f21495r = new Paint(1);
        this.f21481b = x3Var;
        this.f21482c = n3Var;
        this.d = l3Var;
        this.f21488k = new zc(x3Var);
        paint.setColor(n3Var.f21258r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21487j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21486i, f7);
        this.f21487j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21487j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21487j, 285.0d, 20.0d);
        } else {
            this.f21487j.setInterpolator(pr.h);
        }
        this.f21487j.start();
    }
}
