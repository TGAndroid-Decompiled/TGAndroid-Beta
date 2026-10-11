package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.is;
public final class u3 {
    public final RectF f21604a = new RectF();
    public final v3 f21605b;
    public final l3 f21606c;
    public final j3 d;
    public final Paint f21607e;
    public final Matrix f21608f;
    public final float[] f21609g;
    public final float[] h;
    public float f21610i;
    public ValueAnimator f21611j;
    public final bd f21612k;
    public final Paint f21613l;
    public final RectF f21614m;
    public final Path f21615n;
    public final Paint f21616o;
    public final RadialGradient f21617p;
    public final Matrix f21618q;
    public final Paint f21619r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f21607e = paint;
        this.f21608f = new Matrix();
        this.f21609g = new float[8];
        this.h = new float[8];
        this.f21610i = 0.0f;
        this.f21613l = new Paint(1);
        this.f21614m = new RectF();
        this.f21615n = new Path();
        this.f21616o = new Paint(3);
        this.f21617p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21618q = new Matrix();
        this.f21619r = new Paint(1);
        this.f21605b = v3Var;
        this.f21606c = l3Var;
        this.d = j3Var;
        this.f21612k = new bd(v3Var);
        paint.setColor(l3Var.f21381r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21611j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21610i, f7);
        this.f21611j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21611j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21611j, 285.0d, 20.0d);
        } else {
            this.f21611j.setInterpolator(is.h);
        }
        this.f21611j.start();
    }
}
