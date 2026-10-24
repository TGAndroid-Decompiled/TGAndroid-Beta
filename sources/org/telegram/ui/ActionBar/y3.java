package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zr;
public final class y3 {
    public final RectF f21977a = new RectF();
    public final z3 f21978b;
    public final p3 f21979c;
    public final n3 d;
    public final Paint e;
    public final Matrix f21980f;
    public final float[] f21981g;
    public final float[] h;
    public float f21982i;
    public ValueAnimator f21983j;
    public final wc f21984k;
    public final Paint f21985l;
    public final RectF f21986m;
    public final Path f21987n;
    public final Paint f21988o;
    public final RadialGradient f21989p;
    public final Matrix f21990q;
    public final Paint f21991r;

    public y3(z3 z3Var, p3 p3Var, n3 n3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21980f = new Matrix();
        this.f21981g = new float[8];
        this.h = new float[8];
        this.f21982i = 0.0f;
        this.f21985l = new Paint(1);
        this.f21986m = new RectF();
        this.f21987n = new Path();
        this.f21988o = new Paint(3);
        this.f21989p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21990q = new Matrix();
        this.f21991r = new Paint(1);
        this.f21978b = z3Var;
        this.f21979c = p3Var;
        this.d = n3Var;
        this.f21984k = new wc(z3Var);
        paint.setColor(p3Var.f21769r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21983j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21982i, f7);
        this.f21983j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21983j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21983j, 285.0d, 20.0d);
        } else {
            this.f21983j.setInterpolator(zr.h);
        }
        this.f21983j.start();
    }
}
