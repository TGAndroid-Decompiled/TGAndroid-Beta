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
    public final RectF f22380a = new RectF();
    public final b4 f22381b;
    public final r3 f22382c;
    public final p3 d;
    public final Paint e;
    public final Matrix f22383f;
    public final float[] f22384g;
    public final float[] h;
    public float f22385i;
    public ValueAnimator f22386j;
    public final xc f22387k;
    public final Paint f22388l;
    public final RectF f22389m;
    public final Path f22390n;
    public final Paint f22391o;
    public final RadialGradient f22392p;
    public final Matrix f22393q;
    public final Paint f22394r;

    public a4(b4 b4Var, r3 r3Var, p3 p3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f22383f = new Matrix();
        this.f22384g = new float[8];
        this.h = new float[8];
        this.f22385i = 0.0f;
        this.f22388l = new Paint(1);
        this.f22389m = new RectF();
        this.f22390n = new Path();
        this.f22391o = new Paint(3);
        this.f22392p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f22393q = new Matrix();
        this.f22394r = new Paint(1);
        this.f22381b = b4Var;
        this.f22382c = r3Var;
        this.d = p3Var;
        this.f22387k = new xc(b4Var);
        paint.setColor(r3Var.f23016r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f22386j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22385i, f7);
        this.f22386j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f22386j.addListener(new a1(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f22386j, 285.0d, 20.0d);
        } else {
            this.f22386j.setInterpolator(ds.h);
        }
        this.f22386j.start();
    }
}
