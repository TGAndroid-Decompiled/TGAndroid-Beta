package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t70 extends AnimatorListenerAdapter {
    public final int f30446a;
    public final u70 f30447b;

    public t70(u70 u70Var, int i10) {
        this.f30446a = i10;
        this.f30447b = u70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30446a) {
            case 0:
                u70 u70Var = this.f30447b;
                u70Var.e.f31173d0 = null;
                u70Var.requestLayout();
                return;
            default:
                u70 u70Var2 = this.f30447b;
                u70Var2.e.f31173d0 = null;
                u70Var2.f30904a = false;
                return;
        }
    }
}
