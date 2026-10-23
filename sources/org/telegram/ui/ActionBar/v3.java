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
public final class v3 {
    public final RectF f21790a = new RectF();
    public final w3 f21791b;
    public final m3 f21792c;
    public final k3 d;
    public final Paint e;
    public final Matrix f21793f;
    public final float[] f21794g;
    public final float[] h;
    public float f21795i;
    public ValueAnimator f21796j;
    public final yc f21797k;
    public final Paint f21798l;
    public final RectF f21799m;
    public final Path f21800n;
    public final Paint f21801o;
    public final RadialGradient f21802p;
    public final Matrix f21803q;
    public final Paint f21804r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21793f = new Matrix();
        this.f21794g = new float[8];
        this.h = new float[8];
        this.f21795i = 0.0f;
        this.f21798l = new Paint(1);
        this.f21799m = new RectF();
        this.f21800n = new Path();
        this.f21801o = new Paint(3);
        this.f21802p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21803q = new Matrix();
        this.f21804r = new Paint(1);
        this.f21791b = w3Var;
        this.f21792c = m3Var;
        this.d = k3Var;
        this.f21797k = new yc(w3Var);
        paint.setColor(m3Var.f21600r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21796j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21795i, f7);
        this.f21796j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21796j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21796j, 285.0d, 20.0d);
        } else {
            this.f21796j.setInterpolator(bs.h);
        }
        this.f21796j.start();
    }
}
