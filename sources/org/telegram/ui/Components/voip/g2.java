package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f39191a;
    public final h2 f39192b;

    public g2(h2 h2Var, int i7) {
        this.f39191a = i7;
        this.f39192b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39191a) {
            case 0:
                this.f39192b.f39210b.setVisibility(8);
                return;
            default:
                this.f39192b.f39211c.setVisibility(8);
                return;
        }
    }
}
