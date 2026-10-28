package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class l50 extends s4.l {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final x50 L;

    public l50(x50 x50Var) {
        this.L = x50Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.Q.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47823p.isEmpty();
        boolean isEmpty2 = this.f47825r.isEmpty();
        boolean isEmpty3 = this.f47824q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 15));
            this.G.addListener(new k50(this, 0));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.ds.f27530f);
            this.G.start();
            x50 x50Var = this.L;
            x50Var.Q.invalidate();
            x50Var.a2.invalidate();
        }
        super.m();
    }
}
