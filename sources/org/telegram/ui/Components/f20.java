package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f20 extends AnimatorListenerAdapter {
    public final int f33664a;
    public final h20 f33665b;

    public f20(h20 h20Var, int i3) {
        this.f33664a = i3;
        this.f33665b = h20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33664a) {
            case 0:
                h20 h20Var = this.f33665b;
                if (h20Var.f34273c0 == animator) {
                    h20Var.f34273c0 = null;
                    h20Var.b();
                    return;
                }
                return;
            default:
                h20 h20Var2 = this.f33665b;
                if (h20Var2.f34271b0 == animator) {
                    h20Var2.f34271b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33664a) {
            case 1:
                g20 g20Var = this.f33665b.f34269a0;
                if (g20Var != null) {
                    ((org.telegram.ui.ko0) g20Var).f46994a.f41420f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
