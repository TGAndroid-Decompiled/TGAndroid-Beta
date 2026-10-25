package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e40 extends AnimatorListenerAdapter {
    public final int f27720a;
    public final g40 f27721b;

    public e40(g40 g40Var, int i10) {
        this.f27720a = i10;
        this.f27721b = g40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27720a) {
            case 0:
                g40 g40Var = this.f27721b;
                if (g40Var.f28405b0 == animator) {
                    g40Var.f28405b0 = null;
                    g40Var.b();
                    return;
                }
                return;
            default:
                g40 g40Var2 = this.f27721b;
                if (g40Var2.f28403a0 == animator) {
                    g40Var2.f28403a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27720a) {
            case 1:
                f40 f40Var = this.f27721b.W;
                if (f40Var != null) {
                    ((org.telegram.ui.is0) f40Var).f40346a.f35643e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
