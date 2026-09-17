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
    public final RectF f21454a = new RectF();
    public final x3 f21455b;
    public final n3 f21456c;
    public final l3 d;
    public final Paint f21457e;
    public final Matrix f21458f;
    public final float[] f21459g;
    public final float[] h;
    public float f21460i;
    public ValueAnimator f21461j;
    public final zc f21462k;
    public final Paint f21463l;
    public final RectF f21464m;
    public final Path f21465n;
    public final Paint f21466o;
    public final RadialGradient f21467p;
    public final Matrix f21468q;
    public final Paint f21469r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.f21457e = paint;
        this.f21458f = new Matrix();
        this.f21459g = new float[8];
        this.h = new float[8];
        this.f21460i = 0.0f;
        this.f21463l = new Paint(1);
        this.f21464m = new RectF();
        this.f21465n = new Path();
        this.f21466o = new Paint(3);
        this.f21467p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21468q = new Matrix();
        this.f21469r = new Paint(1);
        this.f21455b = x3Var;
        this.f21456c = n3Var;
        this.d = l3Var;
        this.f21462k = new zc(x3Var);
        paint.setColor(n3Var.f21232r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21461j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21460i, f7);
        this.f21461j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21461j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21461j, 285.0d, 20.0d);
        } else {
            this.f21461j.setInterpolator(pr.h);
        }
        this.f21461j.start();
    }
}
