package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.zc;
public final class u3 {
    public final RectF f19806a = new RectF();
    public final v3 f19807b;
    public final l3 f19808c;
    public final j3 d;
    public final Paint e;
    public final Matrix f19809f;
    public final float[] f19810g;
    public final float[] h;
    public float f19811i;
    public ValueAnimator f19812j;
    public final zc f19813k;
    public final Paint f19814l;
    public final RectF f19815m;
    public final Path f19816n;
    public final Paint f19817o;
    public final RadialGradient f19818p;
    public final Matrix f19819q;
    public final Paint f19820r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19809f = new Matrix();
        this.f19810g = new float[8];
        this.h = new float[8];
        this.f19811i = 0.0f;
        this.f19814l = new Paint(1);
        this.f19815m = new RectF();
        this.f19816n = new Path();
        this.f19817o = new Paint(3);
        this.f19818p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19819q = new Matrix();
        this.f19820r = new Paint(1);
        this.f19807b = v3Var;
        this.f19808c = l3Var;
        this.d = j3Var;
        this.f19813k = new zc(v3Var);
        paint.setColor(l3Var.f19597r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19812j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19811i, f7);
        this.f19812j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f19812j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19812j, 285.0d, 20.0d);
        } else {
            this.f19812j.setInterpolator(rr.h);
        }
        this.f19812j.start();
    }
}
