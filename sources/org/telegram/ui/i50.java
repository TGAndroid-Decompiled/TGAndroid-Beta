package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class i50 extends s4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final u50 L;

    public i50(u50 u50Var) {
        this.L = u50Var;
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
        boolean isEmpty = this.f46406p.isEmpty();
        boolean isEmpty2 = this.f46408r.isEmpty();
        boolean isEmpty3 = this.f46407q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.o31(this, 29));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            this.G.start();
            u50 u50Var = this.L;
            u50Var.Q.invalidate();
            u50Var.a2.invalidate();
        }
        super.m();
    }
}
