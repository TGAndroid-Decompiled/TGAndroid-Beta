package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
public final class u3 {
    public final RectF f20407a = new RectF();
    public final v3 f20408b;
    public final l3 f20409c;
    public final j3 d;
    public final Paint e;
    public final Matrix f20410f;
    public final float[] f20411g;
    public final float[] h;
    public float f20412i;
    public ValueAnimator f20413j;
    public final ad f20414k;
    public final Paint f20415l;
    public final RectF f20416m;
    public final Path f20417n;
    public final Paint f20418o;
    public final RadialGradient f20419p;
    public final Matrix f20420q;
    public final Paint f20421r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f20410f = new Matrix();
        this.f20411g = new float[8];
        this.h = new float[8];
        this.f20412i = 0.0f;
        this.f20415l = new Paint(1);
        this.f20416m = new RectF();
        this.f20417n = new Path();
        this.f20418o = new Paint(3);
        this.f20419p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20420q = new Matrix();
        this.f20421r = new Paint(1);
        this.f20408b = v3Var;
        this.f20409c = l3Var;
        this.d = j3Var;
        this.f20414k = new ad(v3Var);
        paint.setColor(l3Var.f20199r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f20413j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20412i, f7);
        this.f20413j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f20413j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f20413j, 285.0d, 20.0d);
        } else {
            this.f20413j.setInterpolator(es.h);
        }
        this.f20413j.start();
    }
}
