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
    public final RectF f21608a = new RectF();
    public final w3 f21609b;
    public final m3 f21610c;
    public final k3 d;
    public final Paint f21611e;
    public final Matrix f21612f;
    public final float[] f21613g;
    public final float[] h;
    public float f21614i;
    public ValueAnimator f21615j;
    public final zc f21616k;
    public final Paint f21617l;
    public final RectF f21618m;
    public final Path f21619n;
    public final Paint f21620o;
    public final RadialGradient f21621p;
    public final Matrix f21622q;
    public final Paint f21623r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.f21611e = paint;
        this.f21612f = new Matrix();
        this.f21613g = new float[8];
        this.h = new float[8];
        this.f21614i = 0.0f;
        this.f21617l = new Paint(1);
        this.f21618m = new RectF();
        this.f21619n = new Path();
        this.f21620o = new Paint(3);
        this.f21621p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f21622q = new Matrix();
        this.f21623r = new Paint(1);
        this.f21609b = w3Var;
        this.f21610c = m3Var;
        this.d = k3Var;
        this.f21616k = new zc(w3Var);
        paint.setColor(m3Var.f21388r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f21615j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21614i, f7);
        this.f21615j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f21615j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f21615j, 285.0d, 20.0d);
        } else {
            this.f21615j.setInterpolator(tr.h);
        }
        this.f21615j.start();
    }
}
