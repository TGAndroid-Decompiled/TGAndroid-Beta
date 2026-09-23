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
import org.telegram.ui.Components.yc;
public final class v3 {
    public final RectF f19593a = new RectF();
    public final w3 f19594b;
    public final m3 f19595c;
    public final k3 d;
    public final Paint e;
    public final Matrix f19596f;
    public final float[] f19597g;
    public final float[] h;
    public float f19598i;
    public ValueAnimator f19599j;
    public final yc f19600k;
    public final Paint f19601l;
    public final RectF f19602m;
    public final Path f19603n;
    public final Paint f19604o;
    public final RadialGradient f19605p;
    public final Matrix f19606q;
    public final Paint f19607r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19596f = new Matrix();
        this.f19597g = new float[8];
        this.h = new float[8];
        this.f19598i = 0.0f;
        this.f19601l = new Paint(1);
        this.f19602m = new RectF();
        this.f19603n = new Path();
        this.f19604o = new Paint(3);
        this.f19605p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19606q = new Matrix();
        this.f19607r = new Paint(1);
        this.f19594b = w3Var;
        this.f19595c = m3Var;
        this.d = k3Var;
        this.f19600k = new yc(w3Var);
        paint.setColor(m3Var.f19384r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19599j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19598i, f7);
        this.f19599j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f19599j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19599j, 285.0d, 20.0d);
        } else {
            this.f19599j.setInterpolator(rr.h);
        }
        this.f19599j.start();
    }
}
