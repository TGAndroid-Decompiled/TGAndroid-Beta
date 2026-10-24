package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t70 extends AnimatorListenerAdapter {
    public final int f30744a;
    public final u70 f30745b;

    public t70(u70 u70Var, int i10) {
        this.f30744a = i10;
        this.f30745b = u70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30744a) {
            case 0:
                u70 u70Var = this.f30745b;
                u70Var.e.f31349d0 = null;
                u70Var.requestLayout();
                return;
            default:
                u70 u70Var2 = this.f30745b;
                u70Var2.e.f31349d0 = null;
                u70Var2.f31035a = false;
                return;
        }
    }
}
