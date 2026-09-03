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
import org.telegram.ui.Components.rc;
public final class w3 {
    public final RectF f22376a = new RectF();
    public final x3 f22377b;
    public final n3 f22378c;
    public final l3 d;
    public final Paint f22379e;
    public final Matrix f22380f;
    public final float[] f22381g;
    public final float[] h;
    public float f22382i;
    public ValueAnimator f22383j;
    public final rc f22384k;
    public final Paint f22385l;
    public final RectF f22386m;
    public final Path f22387n;
    public final Paint f22388o;
    public final RadialGradient f22389p;
    public final Matrix f22390q;
    public final Paint f22391r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.f22379e = paint;
        this.f22380f = new Matrix();
        this.f22381g = new float[8];
        this.h = new float[8];
        this.f22382i = 0.0f;
        this.f22385l = new Paint(1);
        this.f22386m = new RectF();
        this.f22387n = new Path();
        this.f22388o = new Paint(3);
        this.f22389p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f22390q = new Matrix();
        this.f22391r = new Paint(1);
        this.f22377b = x3Var;
        this.f22378c = n3Var;
        this.d = l3Var;
        this.f22384k = new rc(x3Var);
        paint.setColor(n3Var.f22175p);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f22383j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22382i, f10);
        this.f22383j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f22383j.addListener(new a1(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.f22383j, 285.0d, 20.0d);
        } else {
            this.f22383j.setInterpolator(pr.h);
        }
        this.f22383j.start();
    }
}
