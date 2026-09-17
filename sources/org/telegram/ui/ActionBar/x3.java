package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
public final class x3 {
    public final RectF f19676a = new RectF();
    public final y3 f19677b;
    public final o3 f19678c;
    public final m3 d;
    public final Paint e;
    public final Matrix f19679f;
    public final float[] f19680g;
    public final float[] h;
    public float f19681i;
    public ValueAnimator f19682j;
    public final wc f19683k;
    public final Paint f19684l;
    public final RectF f19685m;
    public final Path f19686n;
    public final Paint f19687o;
    public final RadialGradient f19688p;
    public final Matrix f19689q;
    public final Paint f19690r;

    public x3(y3 y3Var, o3 o3Var, m3 m3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19679f = new Matrix();
        this.f19680g = new float[8];
        this.h = new float[8];
        this.f19681i = 0.0f;
        this.f19684l = new Paint(1);
        this.f19685m = new RectF();
        this.f19686n = new Path();
        this.f19687o = new Paint(3);
        this.f19688p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19689q = new Matrix();
        this.f19690r = new Paint(1);
        this.f19677b = y3Var;
        this.f19678c = o3Var;
        this.d = m3Var;
        this.f19683k = new wc(y3Var);
        paint.setColor(o3Var.f19467r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19682j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19681i, f7);
        this.f19682j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f19682j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19682j, 285.0d, 20.0d);
        } else {
            this.f19682j.setInterpolator(qr.h);
        }
        this.f19682j.start();
    }
}
