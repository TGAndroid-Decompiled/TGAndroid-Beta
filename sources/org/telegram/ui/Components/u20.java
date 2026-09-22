package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f28270a;
    public final z20 f28271b;

    public u20(z20 z20Var, int i10) {
        this.f28270a = i10;
        this.f28271b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28270a) {
            case 0:
                z20 z20Var = this.f28271b;
                z20Var.f30455b.setVisibility(8);
                z20Var.f30465y = false;
                z20Var.E = 0.0f;
                return;
            default:
                this.f28271b.e.setVisibility(8);
                return;
        }
    }
}
