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
    public final RectF f19868a = new RectF();
    public final x3 f19869b;
    public final n3 f19870c;
    public final l3 d;
    public final Paint e;
    public final Matrix f19871f;
    public final float[] f19872g;
    public final float[] h;
    public float f19873i;
    public ValueAnimator f19874j;
    public final yc f19875k;
    public final Paint f19876l;
    public final RectF f19877m;
    public final Path f19878n;
    public final Paint f19879o;
    public final RadialGradient f19880p;
    public final Matrix f19881q;
    public final Paint f19882r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19871f = new Matrix();
        this.f19872g = new float[8];
        this.h = new float[8];
        this.f19873i = 0.0f;
        this.f19876l = new Paint(1);
        this.f19877m = new RectF();
        this.f19878n = new Path();
        this.f19879o = new Paint(3);
        this.f19880p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19881q = new Matrix();
        this.f19882r = new Paint(1);
        this.f19869b = x3Var;
        this.f19870c = n3Var;
        this.d = l3Var;
        this.f19875k = new yc(x3Var);
        paint.setColor(n3Var.f19660r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19874j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19873i, f7);
        this.f19874j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f19874j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19874j, 285.0d, 20.0d);
        } else {
            this.f19874j.setInterpolator(qr.h);
        }
        this.f19874j.start();
    }
}
