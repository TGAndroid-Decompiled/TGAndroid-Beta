package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f30404a;
    public final a70 f30405b;

    public z60(a70 a70Var, int i10) {
        this.f30404a = i10;
        this.f30405b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30404a) {
            case 0:
                a70 a70Var = this.f30405b;
                a70Var.e.f22625d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f30405b;
                a70Var2.e.f22625d0 = null;
                a70Var2.f22339a = false;
                return;
        }
    }
}
