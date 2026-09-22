package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k70 extends AnimatorListenerAdapter {
    public final int f25641a;
    public final l70 f25642b;

    public k70(l70 l70Var, int i10) {
        this.f25641a = i10;
        this.f25642b = l70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25641a) {
            case 0:
                l70 l70Var = this.f25642b;
                l70Var.e.f26353d0 = null;
                l70Var.requestLayout();
                return;
            default:
                l70 l70Var2 = this.f25642b;
                l70Var2.e.f26353d0 = null;
                l70Var2.f26007a = false;
                return;
        }
    }
}
