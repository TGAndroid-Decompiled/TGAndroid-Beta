package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xc;
public final class a4 {
    public final RectF f22382a = new RectF();
    public final b4 f22383b;
    public final r3 f22384c;
    public final p3 d;
    public final Paint e;
    public final Matrix f22385f;
    public final float[] f22386g;
    public final float[] h;
    public float f22387i;
    public ValueAnimator f22388j;
    public final xc f22389k;
    public final Paint f22390l;
    public final RectF f22391m;
    public final Path f22392n;
    public final Paint f22393o;
    public final RadialGradient f22394p;
    public final Matrix f22395q;
    public final Paint f22396r;

    public a4(b4 b4Var, r3 r3Var, p3 p3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f22385f = new Matrix();
        this.f22386g = new float[8];
        this.h = new float[8];
        this.f22387i = 0.0f;
        this.f22390l = new Paint(1);
        this.f22391m = new RectF();
        this.f22392n = new Path();
        this.f22393o = new Paint(3);
        this.f22394p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f22395q = new Matrix();
        this.f22396r = new Paint(1);
        this.f22383b = b4Var;
        this.f22384c = r3Var;
        this.d = p3Var;
        this.f22389k = new xc(b4Var);
        paint.setColor(r3Var.f23018r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f22388j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22387i, f7);
        this.f22388j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f22388j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f22388j, 285.0d, 20.0d);
        } else {
            this.f22388j.setInterpolator(ds.h);
        }
        this.f22388j.start();
    }
}
