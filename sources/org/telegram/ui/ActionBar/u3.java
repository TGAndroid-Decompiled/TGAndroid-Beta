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
    public final RectF f21568a = new RectF();
    public final v3 f21569b;
    public final l3 f21570c;
    public final j3 d;
    public final Paint f21571e;
    public final Matrix f21572f;
    public final float[] f21573g;
    public final float[] h;
    public float f21574i;
    public ValueAnimator f21575j;
    public final bd f21576k;
    public final Paint f21577l;
    public final RectF f21578m;
    public final Path f21579n;
    public final Paint f21580o;
    public final RadialGradient f21581p;
    public final Matrix f21582q;
    public final Paint f21583r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f21571e = paint;
        this.f21572f = new Matrix();
        this.f21573g = new float[8];
        this.h = new float[8];
        this.f21574i = 0.0f;
        this.f21577l = new Paint(1);
        this.f21578m = new RectF();
        this.f21579n = new Path();
        this.f21580o = new Paint(3);
        this.f21581p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21582q = new Matrix();
        this.f21583r = new Paint(1);
        this.f21569b = v3Var;
        this.f21570c = l3Var;
        this.d = j3Var;
        this.f21576k = new bd(v3Var);
        paint.setColor(l3Var.f21345r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21575j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21574i, f7);
        this.f21575j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f21575j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21575j, 285.0d, 20.0d);
        } else {
            this.f21575j.setInterpolator(is.h);
        }
        this.f21575j.start();
    }
}
