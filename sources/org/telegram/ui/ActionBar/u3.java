package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
public final class u3 {
    public final RectF f23834a = new RectF();
    public final v3 f23835b;
    public final l3 f23836c;
    public final j3 d;
    public final Paint f23837e;
    public final Matrix f23838f;
    public final float[] f23839g;
    public final float[] h;
    public float f23840i;
    public ValueAnimator f23841j;
    public final uc f23842k;
    public final Paint f23843l;
    public final RectF f23844m;
    public final Path f23845n;
    public final Paint f23846o;
    public final RadialGradient f23847p;
    public final Matrix f23848q;
    public final Paint f23849r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f23837e = paint;
        this.f23838f = new Matrix();
        this.f23839g = new float[8];
        this.h = new float[8];
        this.f23840i = 0.0f;
        this.f23843l = new Paint(1);
        this.f23844m = new RectF();
        this.f23845n = new Path();
        this.f23846o = new Paint(3);
        this.f23847p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f23848q = new Matrix();
        this.f23849r = new Paint(1);
        this.f23835b = v3Var;
        this.f23836c = l3Var;
        this.d = j3Var;
        this.f23842k = new uc(v3Var);
        paint.setColor(l3Var.f23654p);
    }

    public final void a(float f9) {
        ValueAnimator valueAnimator = this.f23841j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23840i, f9);
        this.f23841j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f23841j.addListener(new a1(this, f9, 1));
        if (Math.abs(f9) < 0.1f) {
            AndroidUtilities.applySpring(this.f23841j, 285.0d, 20.0d);
        } else {
            this.f23841j.setInterpolator(jr.h);
        }
        this.f23841j.start();
    }
}
