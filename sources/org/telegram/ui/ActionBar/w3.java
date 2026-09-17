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
    public final RectF f21481a = new RectF();
    public final x3 f21482b;
    public final n3 f21483c;
    public final l3 d;
    public final Paint f21484e;
    public final Matrix f21485f;
    public final float[] f21486g;
    public final float[] h;
    public float f21487i;
    public ValueAnimator f21488j;
    public final zc f21489k;
    public final Paint f21490l;
    public final RectF f21491m;
    public final Path f21492n;
    public final Paint f21493o;
    public final RadialGradient f21494p;
    public final Matrix f21495q;
    public final Paint f21496r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.f21484e = paint;
        this.f21485f = new Matrix();
        this.f21486g = new float[8];
        this.h = new float[8];
        this.f21487i = 0.0f;
        this.f21490l = new Paint(1);
        this.f21491m = new RectF();
        this.f21492n = new Path();
        this.f21493o = new Paint(3);
        this.f21494p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21495q = new Matrix();
        this.f21496r = new Paint(1);
        this.f21482b = x3Var;
        this.f21483c = n3Var;
        this.d = l3Var;
        this.f21489k = new zc(x3Var);
        paint.setColor(n3Var.f21259r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21488j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21487i, f7);
        this.f21488j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21488j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21488j, 285.0d, 20.0d);
        } else {
            this.f21488j.setInterpolator(pr.h);
        }
        this.f21488j.start();
    }
}
