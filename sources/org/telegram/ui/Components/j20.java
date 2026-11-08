package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j20 extends AnimatorListenerAdapter {
    public final int f34875a;
    public final l20 f34876b;

    public j20(l20 l20Var, int i7) {
        this.f34875a = i7;
        this.f34876b = l20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34875a) {
            case 0:
                l20 l20Var = this.f34876b;
                if (l20Var.f35499b0 == animator) {
                    l20Var.f35499b0 = null;
                    l20Var.b();
                    return;
                }
                return;
            default:
                l20 l20Var2 = this.f34876b;
                if (l20Var2.f35497a0 == animator) {
                    l20Var2.f35497a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34875a) {
            case 1:
                k20 k20Var = this.f34876b.W;
                if (k20Var != null) {
                    ((org.telegram.ui.to0) k20Var).f50106a.f41384e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
