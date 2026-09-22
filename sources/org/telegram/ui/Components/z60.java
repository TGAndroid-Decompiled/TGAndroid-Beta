package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f30487a;
    public final a70 f30488b;

    public z60(a70 a70Var, int i10) {
        this.f30487a = i10;
        this.f30488b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30487a) {
            case 0:
                a70 a70Var = this.f30488b;
                a70Var.e.f22670d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f30488b;
                a70Var2.e.f22670d0 = null;
                a70Var2.f22323a = false;
                return;
        }
    }
}
