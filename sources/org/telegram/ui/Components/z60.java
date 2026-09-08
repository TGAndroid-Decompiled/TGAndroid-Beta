package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f33114a;
    public final a70 f33115b;

    public z60(a70 a70Var, int i10) {
        this.f33114a = i10;
        this.f33115b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33114a) {
            case 0:
                a70 a70Var = this.f33115b;
                a70Var.f24326e.f24597d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f33115b;
                a70Var2.f24326e.f24597d0 = null;
                a70Var2.f24323a = false;
                return;
        }
    }
}
