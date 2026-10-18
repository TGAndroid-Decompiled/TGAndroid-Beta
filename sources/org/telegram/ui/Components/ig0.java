package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f27236a;
    public final jg0 f27237b;

    public ig0(jg0 jg0Var, int i10) {
        this.f27236a = i10;
        this.f27237b = jg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27236a) {
            case 0:
                this.f27237b.f27530a.f27874n.setVisibility(8);
                return;
            default:
                this.f27237b.f27530a.h.setVisibility(8);
                return;
        }
    }
}
