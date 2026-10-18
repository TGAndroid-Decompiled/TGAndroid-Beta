package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t70 extends AnimatorListenerAdapter {
    public final int f30491a;
    public final u70 f30492b;

    public t70(u70 u70Var, int i10) {
        this.f30491a = i10;
        this.f30492b = u70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30491a) {
            case 0:
                u70 u70Var = this.f30492b;
                u70Var.e.f31203d0 = null;
                u70Var.requestLayout();
                return;
            default:
                u70 u70Var2 = this.f30492b;
                u70Var2.e.f31203d0 = null;
                u70Var2.f30909a = false;
                return;
        }
    }
}
