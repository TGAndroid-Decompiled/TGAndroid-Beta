package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f30407a;
    public final a70 f30408b;

    public z60(a70 a70Var, int i10) {
        this.f30407a = i10;
        this.f30408b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30407a) {
            case 0:
                a70 a70Var = this.f30408b;
                a70Var.e.f22628d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f30408b;
                a70Var2.e.f22628d0 = null;
                a70Var2.f22342a = false;
                return;
        }
    }
}
