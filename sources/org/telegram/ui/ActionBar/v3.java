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
    public final RectF f21789a = new RectF();
    public final w3 f21790b;
    public final m3 f21791c;
    public final k3 d;
    public final Paint e;
    public final Matrix f21792f;
    public final float[] f21793g;
    public final float[] h;
    public float f21794i;
    public ValueAnimator f21795j;
    public final yc f21796k;
    public final Paint f21797l;
    public final RectF f21798m;
    public final Path f21799n;
    public final Paint f21800o;
    public final RadialGradient f21801p;
    public final Matrix f21802q;
    public final Paint f21803r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21792f = new Matrix();
        this.f21793g = new float[8];
        this.h = new float[8];
        this.f21794i = 0.0f;
        this.f21797l = new Paint(1);
        this.f21798m = new RectF();
        this.f21799n = new Path();
        this.f21800o = new Paint(3);
        this.f21801p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21802q = new Matrix();
        this.f21803r = new Paint(1);
        this.f21790b = w3Var;
        this.f21791c = m3Var;
        this.d = k3Var;
        this.f21796k = new yc(w3Var);
        paint.setColor(m3Var.f21599r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21795j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21794i, f7);
        this.f21795j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21795j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21795j, 285.0d, 20.0d);
        } else {
            this.f21795j.setInterpolator(bs.h);
        }
        this.f21795j.start();
    }
}
