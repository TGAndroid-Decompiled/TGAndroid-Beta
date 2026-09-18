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
import org.telegram.ui.Components.yc;
public final class w3 {
    public final RectF f19836a = new RectF();
    public final x3 f19837b;
    public final n3 f19838c;
    public final l3 d;
    public final Paint e;
    public final Matrix f19839f;
    public final float[] f19840g;
    public final float[] h;
    public float f19841i;
    public ValueAnimator f19842j;
    public final yc f19843k;
    public final Paint f19844l;
    public final RectF f19845m;
    public final Path f19846n;
    public final Paint f19847o;
    public final RadialGradient f19848p;
    public final Matrix f19849q;
    public final Paint f19850r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19839f = new Matrix();
        this.f19840g = new float[8];
        this.h = new float[8];
        this.f19841i = 0.0f;
        this.f19844l = new Paint(1);
        this.f19845m = new RectF();
        this.f19846n = new Path();
        this.f19847o = new Paint(3);
        this.f19848p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19849q = new Matrix();
        this.f19850r = new Paint(1);
        this.f19837b = x3Var;
        this.f19838c = n3Var;
        this.d = l3Var;
        this.f19843k = new yc(x3Var);
        paint.setColor(n3Var.f19628r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19842j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19841i, f7);
        this.f19842j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f19842j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19842j, 285.0d, 20.0d);
        } else {
            this.f19842j.setInterpolator(qr.h);
        }
        this.f19842j.start();
    }
}
