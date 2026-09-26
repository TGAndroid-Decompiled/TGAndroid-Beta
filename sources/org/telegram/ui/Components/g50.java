package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g50 extends AnimatorListenerAdapter {
    public final int f24403a;
    public final d60 f24404b;

    public g50(d60 d60Var, int i10) {
        this.f24403a = i10;
        this.f24404b = d60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24403a) {
            case 0:
                d60 d60Var = this.f24404b;
                if (animator.equals(d60Var.L)) {
                    d60Var.L = null;
                    return;
                }
                return;
            case 1:
                d60 d60Var2 = this.f24404b;
                if (d60Var2.f23563g1 != null) {
                    d60Var2.f23563g1 = null;
                    return;
                }
                return;
            default:
                d60 d60Var3 = this.f24404b;
                if (animator.equals(d60Var3.f23557e0)) {
                    d60Var3.c(true);
                    d60Var3.f23552b1 = false;
                    d60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
