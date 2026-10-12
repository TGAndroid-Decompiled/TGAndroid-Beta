package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class b60 extends s4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final n60 L;

    public b60(n60 n60Var) {
        this.L = n60Var;
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
        boolean isEmpty = this.f44902p.isEmpty();
        boolean isEmpty2 = this.f44904r.isEmpty();
        boolean isEmpty3 = this.f44903q.isEmpty();
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
            this.G.addListener(new org.telegram.ui.Components.u61(this, 26));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.es.f24771f);
            this.G.start();
            n60 n60Var = this.L;
            n60Var.Q.invalidate();
            n60Var.a2.invalidate();
        }
        super.m();
    }
}
