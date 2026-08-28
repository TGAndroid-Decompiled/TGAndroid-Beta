package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class c50 extends f2.n {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final o50 L;

    public c50(o50 o50Var) {
        this.L = o50Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.M.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5450p.isEmpty();
        boolean isEmpty2 = this.f5452r.isEmpty();
        boolean isEmpty3 = this.f5451q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.y11(this, 28));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.G.start();
            o50 o50Var = this.L;
            o50Var.M.invalidate();
            o50Var.W1.invalidate();
        }
        super.m();
    }
}
