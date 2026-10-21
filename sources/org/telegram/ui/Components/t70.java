package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t70 extends AnimatorListenerAdapter {
    public final int f30457a;
    public final u70 f30458b;

    public t70(u70 u70Var, int i10) {
        this.f30457a = i10;
        this.f30458b = u70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30457a) {
            case 0:
                u70 u70Var = this.f30458b;
                u70Var.e.f31171d0 = null;
                u70Var.requestLayout();
                return;
            default:
                u70 u70Var2 = this.f30458b;
                u70Var2.e.f31171d0 = null;
                u70Var2.f30868a = false;
                return;
        }
    }
}
