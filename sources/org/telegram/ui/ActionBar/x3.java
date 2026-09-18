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
    public final RectF f19677a = new RectF();
    public final y3 f19678b;
    public final o3 f19679c;
    public final m3 d;
    public final Paint e;
    public final Matrix f19680f;
    public final float[] f19681g;
    public final float[] h;
    public float f19682i;
    public ValueAnimator f19683j;
    public final wc f19684k;
    public final Paint f19685l;
    public final RectF f19686m;
    public final Path f19687n;
    public final Paint f19688o;
    public final RadialGradient f19689p;
    public final Matrix f19690q;
    public final Paint f19691r;

    public x3(y3 y3Var, o3 o3Var, m3 m3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19680f = new Matrix();
        this.f19681g = new float[8];
        this.h = new float[8];
        this.f19682i = 0.0f;
        this.f19685l = new Paint(1);
        this.f19686m = new RectF();
        this.f19687n = new Path();
        this.f19688o = new Paint(3);
        this.f19689p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19690q = new Matrix();
        this.f19691r = new Paint(1);
        this.f19678b = y3Var;
        this.f19679c = o3Var;
        this.d = m3Var;
        this.f19684k = new wc(y3Var);
        paint.setColor(o3Var.f19468r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19683j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19682i, f7);
        this.f19683j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f19683j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19683j, 285.0d, 20.0d);
        } else {
            this.f19683j.setInterpolator(qr.h);
        }
        this.f19683j.start();
    }
}
