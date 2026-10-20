package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class e50 extends s4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final q50 L;

    public e50(q50 q50Var) {
        this.L = q50Var;
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
        boolean isEmpty = this.f45981p.isEmpty();
        boolean isEmpty2 = this.f45983r.isEmpty();
        boolean isEmpty3 = this.f45982q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.p31(this, 28));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.bs.f25021f);
            this.G.start();
            q50 q50Var = this.L;
            q50Var.Q.invalidate();
            q50Var.a2.invalidate();
        }
        super.m();
    }
}
