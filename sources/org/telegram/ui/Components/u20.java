package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f28273a;
    public final z20 f28274b;

    public u20(z20 z20Var, int i10) {
        this.f28273a = i10;
        this.f28274b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28273a) {
            case 0:
                z20 z20Var = this.f28274b;
                z20Var.f30458b.setVisibility(8);
                z20Var.f30468y = false;
                z20Var.E = 0.0f;
                return;
            default:
                this.f28274b.e.setVisibility(8);
                return;
        }
    }
}
