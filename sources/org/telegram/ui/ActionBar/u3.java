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
    public final RectF f19821a = new RectF();
    public final v3 f19822b;
    public final l3 f19823c;
    public final j3 d;
    public final Paint e;
    public final Matrix f19824f;
    public final float[] f19825g;
    public final float[] h;
    public float f19826i;
    public ValueAnimator f19827j;
    public final yc f19828k;
    public final Paint f19829l;
    public final RectF f19830m;
    public final Path f19831n;
    public final Paint f19832o;
    public final RadialGradient f19833p;
    public final Matrix f19834q;
    public final Paint f19835r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19824f = new Matrix();
        this.f19825g = new float[8];
        this.h = new float[8];
        this.f19826i = 0.0f;
        this.f19829l = new Paint(1);
        this.f19830m = new RectF();
        this.f19831n = new Path();
        this.f19832o = new Paint(3);
        this.f19833p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19834q = new Matrix();
        this.f19835r = new Paint(1);
        this.f19822b = v3Var;
        this.f19823c = l3Var;
        this.d = j3Var;
        this.f19828k = new yc(v3Var);
        paint.setColor(l3Var.f19612r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19827j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19826i, f7);
        this.f19827j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f19827j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19827j, 285.0d, 20.0d);
        } else {
            this.f19827j.setInterpolator(rr.h);
        }
        this.f19827j.start();
    }
}
