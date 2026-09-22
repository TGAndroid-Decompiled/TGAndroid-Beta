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
public final class w3 {
    public final RectF f19645a = new RectF();
    public final x3 f19646b;
    public final n3 f19647c;
    public final l3 d;
    public final Paint e;
    public final Matrix f19648f;
    public final float[] f19649g;
    public final float[] h;
    public float f19650i;
    public ValueAnimator f19651j;
    public final wc f19652k;
    public final Paint f19653l;
    public final RectF f19654m;
    public final Path f19655n;
    public final Paint f19656o;
    public final RadialGradient f19657p;
    public final Matrix f19658q;
    public final Paint f19659r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19648f = new Matrix();
        this.f19649g = new float[8];
        this.h = new float[8];
        this.f19650i = 0.0f;
        this.f19653l = new Paint(1);
        this.f19654m = new RectF();
        this.f19655n = new Path();
        this.f19656o = new Paint(3);
        this.f19657p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19658q = new Matrix();
        this.f19659r = new Paint(1);
        this.f19646b = x3Var;
        this.f19647c = n3Var;
        this.d = l3Var;
        this.f19652k = new wc(x3Var);
        paint.setColor(n3Var.f19436r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19651j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19650i, f7);
        this.f19651j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f19651j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19651j, 285.0d, 20.0d);
        } else {
            this.f19651j.setInterpolator(qr.h);
        }
        this.f19651j.start();
    }
}
