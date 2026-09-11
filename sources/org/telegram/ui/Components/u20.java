package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f30786a;
    public final z20 f30787b;

    public u20(z20 z20Var, int i10) {
        this.f30786a = i10;
        this.f30787b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30786a) {
            case 0:
                z20 z20Var = this.f30787b;
                z20Var.f33058b.setVisibility(8);
                z20Var.f33069y = false;
                z20Var.E = 0.0f;
                return;
            default:
                this.f30787b.f33062e.setVisibility(8);
                return;
        }
    }
}
