package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h81 extends AnimatorListenerAdapter {
    public final int f47646a;
    public final l81 f47647b;

    public h81(l81 l81Var, int i7) {
        this.f47646a = i7;
        this.f47647b = l81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47646a) {
            case 0:
                l81 l81Var = this.f47647b;
                l81Var.f48903w = 0;
                l81Var.f48900n.setVisibility(8);
                return;
            case 1:
                this.f47647b.f48903w = 0;
                return;
            default:
                this.f47647b.G.setVisibility(8);
                return;
        }
    }
}
