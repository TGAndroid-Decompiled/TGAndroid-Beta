package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v30 extends AnimatorListenerAdapter {
    public final int f28981a;
    public final x30 f28982b;

    public v30(x30 x30Var, int i10) {
        this.f28981a = i10;
        this.f28982b = x30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28981a) {
            case 0:
                x30 x30Var = this.f28982b;
                if (x30Var.f30256b0 == animator) {
                    x30Var.f30256b0 = null;
                    x30Var.b();
                    return;
                }
                return;
            default:
                x30 x30Var2 = this.f28982b;
                if (x30Var2.f30254a0 == animator) {
                    x30Var2.f30254a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28981a) {
            case 1:
                w30 w30Var = this.f28982b.W;
                if (w30Var != null) {
                    ((org.telegram.ui.ns0) w30Var).f35968a.f31222e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
