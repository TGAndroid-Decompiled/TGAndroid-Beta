package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class i30 extends AnimatorListenerAdapter {

    public final int f29212a;

    public final k30 f29213b;

    public i30(k30 k30Var, int i10) {
        this.f29212a = i10;
        this.f29213b = k30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29212a) {
            case 0:
                k30 k30Var = this.f29213b;
                if (k30Var.U == animator) {
                    k30Var.U = null;
                    k30Var.b();
                }
                break;
            default:
                k30 k30Var2 = this.f29213b;
                if (k30Var2.T == animator) {
                    k30Var2.T = null;
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29212a) {
            case 1:
                j30 j30Var = this.f29213b.S;
                if (j30Var != null) {
                    ((org.telegram.ui.tr0) j30Var).f43000a.f35583a0.requestLayout();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
