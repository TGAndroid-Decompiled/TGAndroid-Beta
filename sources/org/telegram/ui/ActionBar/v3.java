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
    public final RectF f21785a = new RectF();
    public final w3 f21786b;
    public final m3 f21787c;
    public final k3 d;
    public final Paint e;
    public final Matrix f21788f;
    public final float[] f21789g;
    public final float[] h;
    public float f21790i;
    public ValueAnimator f21791j;
    public final yc f21792k;
    public final Paint f21793l;
    public final RectF f21794m;
    public final Path f21795n;
    public final Paint f21796o;
    public final RadialGradient f21797p;
    public final Matrix f21798q;
    public final Paint f21799r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21788f = new Matrix();
        this.f21789g = new float[8];
        this.h = new float[8];
        this.f21790i = 0.0f;
        this.f21793l = new Paint(1);
        this.f21794m = new RectF();
        this.f21795n = new Path();
        this.f21796o = new Paint(3);
        this.f21797p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21798q = new Matrix();
        this.f21799r = new Paint(1);
        this.f21786b = w3Var;
        this.f21787c = m3Var;
        this.d = k3Var;
        this.f21792k = new yc(w3Var);
        paint.setColor(m3Var.f21595r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21791j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21790i, f7);
        this.f21791j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21791j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21791j, 285.0d, 20.0d);
        } else {
            this.f21791j.setInterpolator(bs.h);
        }
        this.f21791j.start();
    }
}
