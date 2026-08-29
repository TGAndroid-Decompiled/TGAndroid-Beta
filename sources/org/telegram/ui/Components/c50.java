package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c50 extends AnimatorListenerAdapter {
    public final int f27309a;
    public final s50 f27310b;

    public c50(s50 s50Var, int i10) {
        this.f27309a = i10;
        this.f27310b = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27309a) {
            case 0:
                s50 s50Var = this.f27310b;
                if (animator.equals(s50Var.C)) {
                    s50Var.C = null;
                    return;
                }
                return;
            case 1:
                s50 s50Var2 = this.f27310b;
                if (s50Var2.X0 != null) {
                    s50Var2.X0 = null;
                    return;
                }
                return;
            default:
                s50 s50Var3 = this.f27310b;
                if (animator.equals(s50Var3.S)) {
                    s50Var3.h(true);
                    s50Var3.S0 = false;
                    s50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
