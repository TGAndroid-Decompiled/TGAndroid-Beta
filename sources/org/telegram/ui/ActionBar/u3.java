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
    public final RectF f21342a = new RectF();
    public final v3 f21343b;
    public final l3 f21344c;
    public final j3 d;
    public final Paint f21345e;
    public final Matrix f21346f;
    public final float[] f21347g;
    public final float[] h;
    public float f21348i;
    public ValueAnimator f21349j;
    public final ad f21350k;
    public final Paint f21351l;
    public final RectF f21352m;
    public final Path f21353n;
    public final Paint f21354o;
    public final RadialGradient f21355p;
    public final Matrix f21356q;
    public final Paint f21357r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f21345e = paint;
        this.f21346f = new Matrix();
        this.f21347g = new float[8];
        this.h = new float[8];
        this.f21348i = 0.0f;
        this.f21351l = new Paint(1);
        this.f21352m = new RectF();
        this.f21353n = new Path();
        this.f21354o = new Paint(3);
        this.f21355p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21356q = new Matrix();
        this.f21357r = new Paint(1);
        this.f21343b = v3Var;
        this.f21344c = l3Var;
        this.d = j3Var;
        this.f21350k = new ad(v3Var);
        paint.setColor(l3Var.f21119r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21349j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21348i, f7);
        this.f21349j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21349j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21349j, 285.0d, 20.0d);
        } else {
            this.f21349j.setInterpolator(js.h);
        }
        this.f21349j.start();
    }
}
