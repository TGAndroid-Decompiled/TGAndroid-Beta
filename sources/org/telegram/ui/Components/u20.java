package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f30787a;
    public final z20 f30788b;

    public u20(z20 z20Var, int i10) {
        this.f30787a = i10;
        this.f30788b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30787a) {
            case 0:
                z20 z20Var = this.f30788b;
                z20Var.f33059b.setVisibility(8);
                z20Var.f33070y = false;
                z20Var.E = 0.0f;
                return;
            default:
                this.f30788b.f33063e.setVisibility(8);
                return;
        }
    }
}
