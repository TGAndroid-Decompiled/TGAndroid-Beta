package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;

public final class u3 {

    public final RectF f23827a = new RectF();

    public final v3 f23828b;

    public final l3 f23829c;
    public final j3 d;

    public final Paint f23830e;

    public final Matrix f23831f;

    public final float[] f23832g;
    public final float[] h;

    public float f23833i;

    public ValueAnimator f23834j;

    public final nc f23835k;

    public final Paint f23836l;

    public final RectF f23837m;

    public final Path f23838n;

    public final Paint f23839o;

    public final RadialGradient f23840p;

    public final Matrix f23841q;

    public final Paint f23842r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f23830e = paint;
        this.f23831f = new Matrix();
        this.f23832g = new float[8];
        this.h = new float[8];
        this.f23833i = 0.0f;
        this.f23836l = new Paint(1);
        this.f23837m = new RectF();
        this.f23838n = new Path();
        this.f23839o = new Paint(3);
        this.f23840p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f23841q = new Matrix();
        this.f23842r = new Paint(1);
        this.f23828b = v3Var;
        this.f23829c = l3Var;
        this.d = j3Var;
        this.f23835k = new nc(v3Var);
        paint.setColor(l3Var.f23636p);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f23834j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f23833i, f10);
        this.f23834j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new w0(this, 5));
        this.f23834j.addListener(new z0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.f23834j, 285.0d, 20.0d);
        } else {
            this.f23834j.setInterpolator(er.h);
        }
        this.f23834j.start();
    }
}
