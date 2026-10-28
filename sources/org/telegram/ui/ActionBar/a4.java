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
    public final RectF f22383a = new RectF();
    public final b4 f22384b;
    public final r3 f22385c;
    public final p3 d;
    public final Paint e;
    public final Matrix f22386f;
    public final float[] f22387g;
    public final float[] h;
    public float f22388i;
    public ValueAnimator f22389j;
    public final xc f22390k;
    public final Paint f22391l;
    public final RectF f22392m;
    public final Path f22393n;
    public final Paint f22394o;
    public final RadialGradient f22395p;
    public final Matrix f22396q;
    public final Paint f22397r;

    public a4(b4 b4Var, r3 r3Var, p3 p3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f22386f = new Matrix();
        this.f22387g = new float[8];
        this.h = new float[8];
        this.f22388i = 0.0f;
        this.f22391l = new Paint(1);
        this.f22392m = new RectF();
        this.f22393n = new Path();
        this.f22394o = new Paint(3);
        this.f22395p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f22396q = new Matrix();
        this.f22397r = new Paint(1);
        this.f22384b = b4Var;
        this.f22385c = r3Var;
        this.d = p3Var;
        this.f22390k = new xc(b4Var);
        paint.setColor(r3Var.f23019r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f22389j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22388i, f7);
        this.f22389j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f22389j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f22389j, 285.0d, 20.0d);
        } else {
            this.f22389j.setInterpolator(ds.h);
        }
        this.f22389j.start();
    }
}
