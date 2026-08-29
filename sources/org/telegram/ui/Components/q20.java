package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q20 extends AnimatorListenerAdapter {
    public final int f31832a;
    public final w20 f31833b;

    public q20(w20 w20Var, int i10) {
        this.f31832a = i10;
        this.f31833b = w20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31832a) {
            case 0:
                w20 w20Var = this.f31833b;
                w20Var.f34276b.setVisibility(8);
                w20Var.f34285y = false;
                w20Var.A = 0.0f;
                return;
            default:
                this.f31833b.f34278e.setVisibility(8);
                return;
        }
    }
}
