package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w01 extends AnimatorListenerAdapter {
    public final int f41612a;
    public final g11 f41613b;

    public w01(g11 g11Var, int i7) {
        this.f41612a = i7;
        this.f41613b = g11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41612a) {
            case 0:
                g11 g11Var = this.f41613b;
                if (g11Var.f35368b0 == animator) {
                    g11Var.f35368b0 = null;
                    return;
                }
                return;
            case 1:
                g11 g11Var2 = this.f41613b;
                if (g11Var2.f35380k0 == animator) {
                    g11Var2.f35380k0 = null;
                }
                g11Var2.c(1.0f);
                return;
            default:
                g11 g11Var3 = this.f41613b;
                if (g11Var3.K == animator) {
                    g11Var3.K = null;
                    return;
                }
                return;
        }
    }
}
