package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class l30 extends u4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final x30 L;

    public l30(x30 x30Var) {
        this.L = x30Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.I1.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f55598p.isEmpty();
        boolean isEmpty2 = this.f55600r.isEmpty();
        boolean isEmpty3 = this.f55599q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 14));
            this.G.addListener(new y20(this, 1));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.G.start();
            x30 x30Var = this.L;
            x30Var.I1.invalidate();
            x30Var.S3.invalidate();
        }
        super.m();
    }
}
