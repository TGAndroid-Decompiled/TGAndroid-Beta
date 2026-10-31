package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class p40 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final b50 L;

    public p40(b50 b50Var) {
        this.L = b50Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.H1.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47946p.isEmpty();
        boolean isEmpty2 = this.f47948r.isEmpty();
        boolean isEmpty3 = this.f47947q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 14));
            this.G.addListener(new org.telegram.ui.Components.voip.h2(this, 12));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            this.G.start();
            b50 b50Var = this.L;
            b50Var.H1.invalidate();
            b50Var.R3.invalidate();
        }
        super.m();
    }
}
