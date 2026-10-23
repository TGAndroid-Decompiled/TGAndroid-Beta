package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
public final class y3 {
    public final RectF f21976a = new RectF();
    public final z3 f21977b;
    public final p3 f21978c;
    public final n3 d;
    public final Paint e;
    public final Matrix f21979f;
    public final float[] f21980g;
    public final float[] h;
    public float f21981i;
    public ValueAnimator f21982j;
    public final yc f21983k;
    public final Paint f21984l;
    public final RectF f21985m;
    public final Path f21986n;
    public final Paint f21987o;
    public final RadialGradient f21988p;
    public final Matrix f21989q;
    public final Paint f21990r;

    public y3(z3 z3Var, p3 p3Var, n3 n3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21979f = new Matrix();
        this.f21980g = new float[8];
        this.h = new float[8];
        this.f21981i = 0.0f;
        this.f21984l = new Paint(1);
        this.f21985m = new RectF();
        this.f21986n = new Path();
        this.f21987o = new Paint(3);
        this.f21988p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21989q = new Matrix();
        this.f21990r = new Paint(1);
        this.f21977b = z3Var;
        this.f21978c = p3Var;
        this.d = n3Var;
        this.f21983k = new yc(z3Var);
        paint.setColor(p3Var.f21768r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21982j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21981i, f7);
        this.f21982j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21982j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21982j, 285.0d, 20.0d);
        } else {
            this.f21982j.setInterpolator(bs.h);
        }
        this.f21982j.start();
    }
}
