package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yc;
public final class u3 {
    public final RectF f19820a = new RectF();
    public final v3 f19821b;
    public final l3 f19822c;
    public final j3 d;
    public final Paint e;
    public final Matrix f19823f;
    public final float[] f19824g;
    public final float[] h;
    public float f19825i;
    public ValueAnimator f19826j;
    public final yc f19827k;
    public final Paint f19828l;
    public final RectF f19829m;
    public final Path f19830n;
    public final Paint f19831o;
    public final RadialGradient f19832p;
    public final Matrix f19833q;
    public final Paint f19834r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19823f = new Matrix();
        this.f19824g = new float[8];
        this.h = new float[8];
        this.f19825i = 0.0f;
        this.f19828l = new Paint(1);
        this.f19829m = new RectF();
        this.f19830n = new Path();
        this.f19831o = new Paint(3);
        this.f19832p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19833q = new Matrix();
        this.f19834r = new Paint(1);
        this.f19821b = v3Var;
        this.f19822c = l3Var;
        this.d = j3Var;
        this.f19827k = new yc(v3Var);
        paint.setColor(l3Var.f19611r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19826j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19825i, f7);
        this.f19826j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f19826j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19826j, 285.0d, 20.0d);
        } else {
            this.f19826j.setInterpolator(rr.h);
        }
        this.f19826j.start();
    }
}
