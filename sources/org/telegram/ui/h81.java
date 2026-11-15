package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h81 extends AnimatorListenerAdapter {
    public final int f47636a;
    public final l81 f47637b;

    public h81(l81 l81Var, int i7) {
        this.f47636a = i7;
        this.f47637b = l81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47636a) {
            case 0:
                l81 l81Var = this.f47637b;
                l81Var.f48899w = 0;
                l81Var.f48896n.setVisibility(8);
                return;
            case 1:
                this.f47637b.f48899w = 0;
                return;
            default:
                this.f47637b.G.setVisibility(8);
                return;
        }
    }
}
