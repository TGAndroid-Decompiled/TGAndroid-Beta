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
public final class u3 {
    public final RectF f19837a = new RectF();
    public final v3 f19838b;
    public final l3 f19839c;
    public final j3 d;
    public final Paint e;
    public final Matrix f19840f;
    public final float[] f19841g;
    public final float[] h;
    public float f19842i;
    public ValueAnimator f19843j;
    public final zc f19844k;
    public final Paint f19845l;
    public final RectF f19846m;
    public final Path f19847n;
    public final Paint f19848o;
    public final RadialGradient f19849p;
    public final Matrix f19850q;
    public final Paint f19851r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19840f = new Matrix();
        this.f19841g = new float[8];
        this.h = new float[8];
        this.f19842i = 0.0f;
        this.f19845l = new Paint(1);
        this.f19846m = new RectF();
        this.f19847n = new Path();
        this.f19848o = new Paint(3);
        this.f19849p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19850q = new Matrix();
        this.f19851r = new Paint(1);
        this.f19838b = v3Var;
        this.f19839c = l3Var;
        this.d = j3Var;
        this.f19844k = new zc(v3Var);
        paint.setColor(l3Var.f19628r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19843j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19842i, f7);
        this.f19843j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f19843j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19843j, 285.0d, 20.0d);
        } else {
            this.f19843j.setInterpolator(tr.h);
        }
        this.f19843j.start();
    }
}
