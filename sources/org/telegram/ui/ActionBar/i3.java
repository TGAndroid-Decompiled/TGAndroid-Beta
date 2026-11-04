package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;
public final class i3 {
    public final RectF f27592a = new RectF();
    public final j3 f27593b;
    public final a3 f27594c;
    public final y2 d;
    public final Paint f27595e;
    public final Matrix f27596f;
    public final float[] f27597g;
    public final float[] h;
    public float f27598i;
    public ValueAnimator f27599j;
    public final gc f27600k;
    public final Paint f27601l;
    public final RectF f27602m;
    public final Path f27603n;
    public final Paint f27604o;
    public final RadialGradient f27605p;
    public final Matrix f27606q;
    public final Paint f27607r;

    public i3(j3 j3Var, a3 a3Var, y2 y2Var) {
        Paint paint = new Paint(1);
        this.f27595e = paint;
        this.f27596f = new Matrix();
        this.f27597g = new float[8];
        this.h = new float[8];
        this.f27598i = 0.0f;
        this.f27601l = new Paint(1);
        this.f27602m = new RectF();
        this.f27603n = new Path();
        this.f27604o = new Paint(3);
        this.f27605p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f27606q = new Matrix();
        this.f27607r = new Paint(1);
        this.f27593b = j3Var;
        this.f27594c = a3Var;
        this.d = y2Var;
        this.f27600k = new gc(j3Var);
        paint.setColor(a3Var.f27366r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27599j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27598i, f10);
        this.f27599j = ofFloat;
        ofFloat.addUpdateListener(new gi.j3(this, 16));
        this.f27599j.addListener(new s0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.f27599j, 285.0d, 20.0d);
        } else {
            this.f27599j.setInterpolator(xq.h);
        }
        this.f27599j.start();
    }
}
