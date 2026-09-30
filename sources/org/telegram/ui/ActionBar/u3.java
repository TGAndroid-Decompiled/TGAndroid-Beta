package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.zc;
public final class u3 {
    public final RectF f19822a = new RectF();
    public final v3 f19823b;
    public final l3 f19824c;
    public final j3 d;
    public final Paint e;
    public final Matrix f19825f;
    public final float[] f19826g;
    public final float[] h;
    public float f19827i;
    public ValueAnimator f19828j;
    public final zc f19829k;
    public final Paint f19830l;
    public final RectF f19831m;
    public final Path f19832n;
    public final Paint f19833o;
    public final RadialGradient f19834p;
    public final Matrix f19835q;
    public final Paint f19836r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19825f = new Matrix();
        this.f19826g = new float[8];
        this.h = new float[8];
        this.f19827i = 0.0f;
        this.f19830l = new Paint(1);
        this.f19831m = new RectF();
        this.f19832n = new Path();
        this.f19833o = new Paint(3);
        this.f19834p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19835q = new Matrix();
        this.f19836r = new Paint(1);
        this.f19823b = v3Var;
        this.f19824c = l3Var;
        this.d = j3Var;
        this.f19829k = new zc(v3Var);
        paint.setColor(l3Var.f19613r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19828j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19827i, f7);
        this.f19828j = ofFloat;
        ofFloat.addUpdateListener(new v0(this, 5));
        this.f19828j.addListener(new y0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19828j, 285.0d, 20.0d);
        } else {
            this.f19828j.setInterpolator(sr.h);
        }
        this.f19828j.start();
    }
}
