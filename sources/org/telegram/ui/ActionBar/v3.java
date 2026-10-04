package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
public final class v3 {
    public final RectF f21603a = new RectF();
    public final w3 f21604b;
    public final m3 f21605c;
    public final k3 d;
    public final Paint f21606e;
    public final Matrix f21607f;
    public final float[] f21608g;
    public final float[] h;
    public float f21609i;
    public ValueAnimator f21610j;
    public final zc f21611k;
    public final Paint f21612l;
    public final RectF f21613m;
    public final Path f21614n;
    public final Paint f21615o;
    public final RadialGradient f21616p;
    public final Matrix f21617q;
    public final Paint f21618r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.f21606e = paint;
        this.f21607f = new Matrix();
        this.f21608g = new float[8];
        this.h = new float[8];
        this.f21609i = 0.0f;
        this.f21612l = new Paint(1);
        this.f21613m = new RectF();
        this.f21614n = new Path();
        this.f21615o = new Paint(3);
        this.f21616p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21617q = new Matrix();
        this.f21618r = new Paint(1);
        this.f21604b = w3Var;
        this.f21605c = m3Var;
        this.d = k3Var;
        this.f21611k = new zc(w3Var);
        paint.setColor(m3Var.f21383r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21610j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21609i, f7);
        this.f21610j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21610j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21610j, 285.0d, 20.0d);
        } else {
            this.f21610j.setInterpolator(tr.h);
        }
        this.f21610j.start();
    }
}
