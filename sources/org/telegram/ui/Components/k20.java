package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k20 extends AnimatorListenerAdapter {
    public final int f35213a;
    public final m20 f35214b;

    public k20(m20 m20Var, int i7) {
        this.f35213a = i7;
        this.f35214b = m20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35213a) {
            case 0:
                m20 m20Var = this.f35214b;
                if (m20Var.f35913b0 == animator) {
                    m20Var.f35913b0 = null;
                    m20Var.b();
                    return;
                }
                return;
            default:
                m20 m20Var2 = this.f35214b;
                if (m20Var2.f35911a0 == animator) {
                    m20Var2.f35911a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35213a) {
            case 1:
                l20 l20Var = this.f35214b.W;
                if (l20Var != null) {
                    ((org.telegram.ui.vo0) l20Var).f50739a.f41391e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
