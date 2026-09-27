package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f30240a;
    public final c30 f30241b;

    public x20(c30 c30Var, int i10) {
        this.f30240a = i10;
        this.f30241b = c30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30240a) {
            case 0:
                c30 c30Var = this.f30241b;
                c30Var.f23201b.setVisibility(8);
                c30Var.f23211y = false;
                c30Var.E = 0.0f;
                return;
            default:
                this.f30241b.e.setVisibility(8);
                return;
        }
    }
}
