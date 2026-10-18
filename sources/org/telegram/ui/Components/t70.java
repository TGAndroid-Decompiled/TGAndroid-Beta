package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t70 extends AnimatorListenerAdapter {
    public final int f30484a;
    public final u70 f30485b;

    public t70(u70 u70Var, int i10) {
        this.f30484a = i10;
        this.f30485b = u70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30484a) {
            case 0:
                u70 u70Var = this.f30485b;
                u70Var.e.f31196d0 = null;
                u70Var.requestLayout();
                return;
            default:
                u70 u70Var2 = this.f30485b;
                u70Var2.e.f31196d0 = null;
                u70Var2.f30902a = false;
                return;
        }
    }
}
