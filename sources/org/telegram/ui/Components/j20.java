package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j20 extends AnimatorListenerAdapter {
    public final int f34820a;
    public final l20 f34821b;

    public j20(l20 l20Var, int i7) {
        this.f34820a = i7;
        this.f34821b = l20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34820a) {
            case 0:
                l20 l20Var = this.f34821b;
                if (l20Var.f35505b0 == animator) {
                    l20Var.f35505b0 = null;
                    l20Var.b();
                    return;
                }
                return;
            default:
                l20 l20Var2 = this.f34821b;
                if (l20Var2.f35503a0 == animator) {
                    l20Var2.f35503a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34820a) {
            case 1:
                k20 k20Var = this.f34821b.W;
                if (k20Var != null) {
                    ((org.telegram.ui.wo0) k20Var).f51413a.f41382e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
