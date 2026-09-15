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
    public final RectF f19649a = new RectF();
    public final x3 f19650b;
    public final n3 f19651c;
    public final l3 d;
    public final Paint e;
    public final Matrix f19652f;
    public final float[] f19653g;
    public final float[] h;
    public float f19654i;
    public ValueAnimator f19655j;
    public final wc f19656k;
    public final Paint f19657l;
    public final RectF f19658m;
    public final Path f19659n;
    public final Paint f19660o;
    public final RadialGradient f19661p;
    public final Matrix f19662q;
    public final Paint f19663r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19652f = new Matrix();
        this.f19653g = new float[8];
        this.h = new float[8];
        this.f19654i = 0.0f;
        this.f19657l = new Paint(1);
        this.f19658m = new RectF();
        this.f19659n = new Path();
        this.f19660o = new Paint(3);
        this.f19661p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19662q = new Matrix();
        this.f19663r = new Paint(1);
        this.f19650b = x3Var;
        this.f19651c = n3Var;
        this.d = l3Var;
        this.f19656k = new wc(x3Var);
        paint.setColor(n3Var.f19440r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19655j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19654i, f7);
        this.f19655j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f19655j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19655j, 285.0d, 20.0d);
        } else {
            this.f19655j.setInterpolator(qr.h);
        }
        this.f19655j.start();
    }
}
