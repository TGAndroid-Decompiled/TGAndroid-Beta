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
    public final RectF f21783a = new RectF();
    public final w3 f21784b;
    public final m3 f21785c;
    public final k3 d;
    public final Paint e;
    public final Matrix f21786f;
    public final float[] f21787g;
    public final float[] h;
    public float f21788i;
    public ValueAnimator f21789j;
    public final yc f21790k;
    public final Paint f21791l;
    public final RectF f21792m;
    public final Path f21793n;
    public final Paint f21794o;
    public final RadialGradient f21795p;
    public final Matrix f21796q;
    public final Paint f21797r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f21786f = new Matrix();
        this.f21787g = new float[8];
        this.h = new float[8];
        this.f21788i = 0.0f;
        this.f21791l = new Paint(1);
        this.f21792m = new RectF();
        this.f21793n = new Path();
        this.f21794o = new Paint(3);
        this.f21795p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21796q = new Matrix();
        this.f21797r = new Paint(1);
        this.f21784b = w3Var;
        this.f21785c = m3Var;
        this.d = k3Var;
        this.f21790k = new yc(w3Var);
        paint.setColor(m3Var.f21593r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21789j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21788i, f7);
        this.f21789j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21789j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21789j, 285.0d, 20.0d);
        } else {
            this.f21789j.setInterpolator(bs.h);
        }
        this.f21789j.start();
    }
}
