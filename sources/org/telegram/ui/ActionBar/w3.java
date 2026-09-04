package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
public final class w3 {
    public final RectF f21453a = new RectF();
    public final x3 f21454b;
    public final n3 f21455c;
    public final l3 d;
    public final Paint f21456e;
    public final Matrix f21457f;
    public final float[] f21458g;
    public final float[] h;
    public float f21459i;
    public ValueAnimator f21460j;
    public final zc f21461k;
    public final Paint f21462l;
    public final RectF f21463m;
    public final Path f21464n;
    public final Paint f21465o;
    public final RadialGradient f21466p;
    public final Matrix f21467q;
    public final Paint f21468r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.f21456e = paint;
        this.f21457f = new Matrix();
        this.f21458g = new float[8];
        this.h = new float[8];
        this.f21459i = 0.0f;
        this.f21462l = new Paint(1);
        this.f21463m = new RectF();
        this.f21464n = new Path();
        this.f21465o = new Paint(3);
        this.f21466p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21467q = new Matrix();
        this.f21468r = new Paint(1);
        this.f21454b = x3Var;
        this.f21455c = n3Var;
        this.d = l3Var;
        this.f21461k = new zc(x3Var);
        paint.setColor(n3Var.f21231r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21460j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21459i, f7);
        this.f21460j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21460j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21460j, 285.0d, 20.0d);
        } else {
            this.f21460j.setInterpolator(pr.h);
        }
        this.f21460j.start();
    }
}
