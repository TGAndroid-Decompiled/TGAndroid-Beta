package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;

public final class g50 extends f2.l {
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
        this.L.M.invalidate();
    }

    @Override
    public final void m() {
        boolean zIsEmpty = this.f5738p.isEmpty();
        boolean zIsEmpty2 = this.f5740r.isEmpty();
        boolean zIsEmpty3 = this.f5739q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
            this.F = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 17));
            this.G.addListener(new f50(this, 0));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.G.start();
            s50 s50Var = this.L;
            s50Var.M.invalidate();
            s50Var.W1.invalidate();
        }
        super.m();
    }
}
