package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k70 extends AnimatorListenerAdapter {
    public final int f25657a;
    public final l70 f25658b;

    public k70(l70 l70Var, int i10) {
        this.f25657a = i10;
        this.f25658b = l70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25657a) {
            case 0:
                l70 l70Var = this.f25658b;
                l70Var.e.f26371d0 = null;
                l70Var.requestLayout();
                return;
            default:
                l70 l70Var2 = this.f25658b;
                l70Var2.e.f26371d0 = null;
                l70Var2.f26030a = false;
                return;
        }
    }
}
