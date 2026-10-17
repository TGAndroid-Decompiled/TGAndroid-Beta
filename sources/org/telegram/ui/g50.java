package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class g50 extends s4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final s50 L;

    public g50(s50 s50Var) {
        this.L = s50Var;
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
        boolean isEmpty = this.f46002p.isEmpty();
        boolean isEmpty2 = this.f46004r.isEmpty();
        boolean isEmpty3 = this.f46003q.isEmpty();
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
            this.G.addListener(new org.telegram.ui.Components.n31(this, 28));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.bs.f25030f);
            this.G.start();
            s50 s50Var = this.L;
            s50Var.Q.invalidate();
            s50Var.a2.invalidate();
        }
        super.m();
    }
}
