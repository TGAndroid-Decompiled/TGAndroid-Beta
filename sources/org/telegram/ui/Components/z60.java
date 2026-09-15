package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f30490a;
    public final a70 f30491b;

    public z60(a70 a70Var, int i10) {
        this.f30490a = i10;
        this.f30491b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30490a) {
            case 0:
                a70 a70Var = this.f30491b;
                a70Var.e.f22674d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f30491b;
                a70Var2.e.f22674d0 = null;
                a70Var2.f22326a = false;
                return;
        }
    }
}
