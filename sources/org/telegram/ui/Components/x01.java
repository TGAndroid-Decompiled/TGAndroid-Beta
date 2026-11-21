package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x01 extends AnimatorListenerAdapter {
    public final int f41946a;
    public final h11 f41947b;

    public x01(h11 h11Var, int i7) {
        this.f41946a = i7;
        this.f41947b = h11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41946a) {
            case 0:
                h11 h11Var = this.f41947b;
                if (h11Var.f35729b0 == animator) {
                    h11Var.f35729b0 = null;
                    return;
                }
                return;
            case 1:
                h11 h11Var2 = this.f41947b;
                if (h11Var2.f35741k0 == animator) {
                    h11Var2.f35741k0 = null;
                }
                h11Var2.c(1.0f);
                return;
            default:
                h11 h11Var3 = this.f41947b;
                if (h11Var3.K == animator) {
                    h11Var3.K = null;
                    return;
                }
                return;
        }
    }
}
