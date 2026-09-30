package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y20 extends AnimatorListenerAdapter {
    public final int f30569a;
    public final d30 f30570b;

    public y20(d30 d30Var, int i10) {
        this.f30569a = i10;
        this.f30570b = d30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30569a) {
            case 0:
                d30 d30Var = this.f30570b;
                d30Var.f23501b.setVisibility(8);
                d30Var.f23511y = false;
                d30Var.E = 0.0f;
                return;
            default:
                this.f30570b.e.setVisibility(8);
                return;
        }
    }
}
