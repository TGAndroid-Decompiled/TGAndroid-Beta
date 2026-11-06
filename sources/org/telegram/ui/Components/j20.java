package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j20 extends AnimatorListenerAdapter {
    public final int f34862a;
    public final l20 f34863b;

    public j20(l20 l20Var, int i7) {
        this.f34862a = i7;
        this.f34863b = l20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34862a) {
            case 0:
                l20 l20Var = this.f34863b;
                if (l20Var.f35482b0 == animator) {
                    l20Var.f35482b0 = null;
                    l20Var.b();
                    return;
                }
                return;
            default:
                l20 l20Var2 = this.f34863b;
                if (l20Var2.f35480a0 == animator) {
                    l20Var2.f35480a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34862a) {
            case 1:
                k20 k20Var = this.f34863b.W;
                if (k20Var != null) {
                    ((org.telegram.ui.so0) k20Var).f49787a.f41356e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
