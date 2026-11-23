package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g40 extends AnimatorListenerAdapter {
    public final int f35377a;
    public final c50 f35378b;

    public g40(c50 c50Var, int i7) {
        this.f35377a = i7;
        this.f35378b = c50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35377a) {
            case 0:
                c50 c50Var = this.f35378b;
                if (animator.equals(c50Var.L)) {
                    c50Var.L = null;
                    return;
                }
                return;
            case 1:
                c50 c50Var2 = this.f35378b;
                if (c50Var2.l1 != null) {
                    c50Var2.l1 = null;
                    return;
                }
                return;
            default:
                c50 c50Var3 = this.f35378b;
                if (animator.equals(c50Var3.f33988e0)) {
                    c50Var3.d(true);
                    c50Var3.f33994g1 = false;
                    c50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
