package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class f50 extends f2.l {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final r50 L;

    public f50(r50 r50Var) {
        this.L = r50Var;
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
        boolean isEmpty = this.f6405p.isEmpty();
        boolean isEmpty2 = this.f6407r.isEmpty();
        boolean isEmpty3 = this.f6406q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 17));
            this.G.addListener(new e50(this, 0));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.G.start();
            r50 r50Var = this.L;
            r50Var.M.invalidate();
            r50Var.W1.invalidate();
        }
        super.m();
    }
}
