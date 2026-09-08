package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f30813a;
    public final z20 f30814b;

    public u20(z20 z20Var, int i10) {
        this.f30813a = i10;
        this.f30814b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30813a) {
            case 0:
                z20 z20Var = this.f30814b;
                z20Var.f33085b.setVisibility(8);
                z20Var.f33096y = false;
                z20Var.E = 0.0f;
                return;
            default:
                this.f30814b.f33089e.setVisibility(8);
                return;
        }
    }
}
