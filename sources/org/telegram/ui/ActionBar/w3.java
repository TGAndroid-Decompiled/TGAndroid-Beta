package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.yc;
public final class w3 {
    public final RectF f19870a = new RectF();
    public final x3 f19871b;
    public final n3 f19872c;
    public final l3 d;
    public final Paint e;
    public final Matrix f19873f;
    public final float[] f19874g;
    public final float[] h;
    public float f19875i;
    public ValueAnimator f19876j;
    public final yc f19877k;
    public final Paint f19878l;
    public final RectF f19879m;
    public final Path f19880n;
    public final Paint f19881o;
    public final RadialGradient f19882p;
    public final Matrix f19883q;
    public final Paint f19884r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19873f = new Matrix();
        this.f19874g = new float[8];
        this.h = new float[8];
        this.f19875i = 0.0f;
        this.f19878l = new Paint(1);
        this.f19879m = new RectF();
        this.f19880n = new Path();
        this.f19881o = new Paint(3);
        this.f19882p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19883q = new Matrix();
        this.f19884r = new Paint(1);
        this.f19871b = x3Var;
        this.f19872c = n3Var;
        this.d = l3Var;
        this.f19877k = new yc(x3Var);
        paint.setColor(n3Var.f19663r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19876j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19875i, f7);
        this.f19876j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f19876j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19876j, 285.0d, 20.0d);
        } else {
            this.f19876j.setInterpolator(sr.h);
        }
        this.f19876j.start();
    }
}
