package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j20 extends AnimatorListenerAdapter {
    public final int f34825a;
    public final l20 f34826b;

    public j20(l20 l20Var, int i7) {
        this.f34825a = i7;
        this.f34826b = l20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34825a) {
            case 0:
                l20 l20Var = this.f34826b;
                if (l20Var.f35504b0 == animator) {
                    l20Var.f35504b0 = null;
                    l20Var.b();
                    return;
                }
                return;
            default:
                l20 l20Var2 = this.f34826b;
                if (l20Var2.f35502a0 == animator) {
                    l20Var2.f35502a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34825a) {
            case 1:
                k20 k20Var = this.f34826b.W;
                if (k20Var != null) {
                    ((org.telegram.ui.to0) k20Var).f50115a.f41381e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
