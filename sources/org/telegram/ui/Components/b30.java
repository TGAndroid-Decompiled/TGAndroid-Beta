package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b30 extends AnimatorListenerAdapter {
    public final int f24615a;
    public final d30 f24616b;

    public b30(d30 d30Var, int i10) {
        this.f24615a = i10;
        this.f24616b = d30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24615a) {
            case 0:
                d30 d30Var = this.f24616b;
                if (d30Var.f25344b0 == animator) {
                    d30Var.f25344b0 = null;
                    d30Var.b();
                    return;
                }
                return;
            default:
                d30 d30Var2 = this.f24616b;
                if (d30Var2.f25342a0 == animator) {
                    d30Var2.f25342a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24615a) {
            case 1:
                c30 c30Var = this.f24616b.W;
                if (c30Var != null) {
                    ((org.telegram.ui.bq0) c30Var).f36098a.f33477e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
