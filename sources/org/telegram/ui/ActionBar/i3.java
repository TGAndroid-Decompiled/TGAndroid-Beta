package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
public final class i3 {
    public final RectF f28666a = new RectF();
    public final j3 f28667b;
    public final b3 f28668c;
    public final z2 d;
    public final Paint f28669e;
    public final Matrix f28670f;
    public final float[] f28671g;
    public final float[] h;
    public float f28672i;
    public ValueAnimator f28673j;
    public final dc f28674k;
    public final Paint f28675l;
    public final RectF f28676m;
    public final Path f28677n;
    public final Paint f28678o;
    public final RadialGradient f28679p;
    public final Matrix f28680q;
    public final Paint f28681r;

    public i3(j3 j3Var, b3 b3Var, z2 z2Var) {
        Paint paint = new Paint(1);
        this.f28669e = paint;
        this.f28670f = new Matrix();
        this.f28671g = new float[8];
        this.h = new float[8];
        this.f28672i = 0.0f;
        this.f28675l = new Paint(1);
        this.f28676m = new RectF();
        this.f28677n = new Path();
        this.f28678o = new Paint(3);
        this.f28679p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f28680q = new Matrix();
        this.f28681r = new Paint(1);
        this.f28667b = j3Var;
        this.f28668c = b3Var;
        this.d = z2Var;
        this.f28674k = new dc(j3Var);
        paint.setColor(b3Var.f28439r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f28673j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28672i, f10);
        this.f28673j = ofFloat;
        ofFloat.addUpdateListener(new hi.j3(this, 15));
        this.f28673j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f28673j, 285.0d, 20.0d);
        } else {
            this.f28673j.setInterpolator(er.h);
        }
        this.f28673j.start();
    }
}
