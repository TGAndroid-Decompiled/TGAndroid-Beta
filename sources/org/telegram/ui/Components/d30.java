package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d30 extends AnimatorListenerAdapter {
    public final int f27645a;
    public final f30 f27646b;

    public d30(f30 f30Var, int i9) {
        this.f27645a = i9;
        this.f27646b = f30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27645a) {
            case 0:
                f30 f30Var = this.f27646b;
                if (f30Var.U == animator) {
                    f30Var.U = null;
                    f30Var.b();
                    return;
                }
                return;
            default:
                f30 f30Var2 = this.f27646b;
                if (f30Var2.T == animator) {
                    f30Var2.T = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27645a) {
            case 1:
                e30 e30Var = this.f27646b.S;
                if (e30Var != null) {
                    ((org.telegram.ui.sr0) e30Var).f42756a.f35580a0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
