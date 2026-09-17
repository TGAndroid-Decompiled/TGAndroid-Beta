package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f30814a;
    public final z20 f30815b;

    public u20(z20 z20Var, int i10) {
        this.f30814a = i10;
        this.f30815b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30814a) {
            case 0:
                z20 z20Var = this.f30815b;
                z20Var.f33086b.setVisibility(8);
                z20Var.f33097y = false;
                z20Var.E = 0.0f;
                return;
            default:
                this.f30815b.f33090e.setVisibility(8);
                return;
        }
    }
}
