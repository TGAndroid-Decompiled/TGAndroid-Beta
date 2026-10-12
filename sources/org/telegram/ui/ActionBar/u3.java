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
import org.telegram.ui.Components.js;
public final class u3 {
    public final RectF f21343a = new RectF();
    public final v3 f21344b;
    public final l3 f21345c;
    public final j3 d;
    public final Paint f21346e;
    public final Matrix f21347f;
    public final float[] f21348g;
    public final float[] h;
    public float f21349i;
    public ValueAnimator f21350j;
    public final ad f21351k;
    public final Paint f21352l;
    public final RectF f21353m;
    public final Path f21354n;
    public final Paint f21355o;
    public final RadialGradient f21356p;
    public final Matrix f21357q;
    public final Paint f21358r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f21346e = paint;
        this.f21347f = new Matrix();
        this.f21348g = new float[8];
        this.h = new float[8];
        this.f21349i = 0.0f;
        this.f21352l = new Paint(1);
        this.f21353m = new RectF();
        this.f21354n = new Path();
        this.f21355o = new Paint(3);
        this.f21356p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21357q = new Matrix();
        this.f21358r = new Paint(1);
        this.f21344b = v3Var;
        this.f21345c = l3Var;
        this.d = j3Var;
        this.f21351k = new ad(v3Var);
        paint.setColor(l3Var.f21120r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21350j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21349i, f7);
        this.f21350j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21350j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21350j, 285.0d, 20.0d);
        } else {
            this.f21350j.setInterpolator(js.h);
        }
        this.f21350j.start();
    }
}
