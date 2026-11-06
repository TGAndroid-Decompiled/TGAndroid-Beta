package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f39173a;
    public final h2 f39174b;

    public g2(h2 h2Var, int i7) {
        this.f39173a = i7;
        this.f39174b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39173a) {
            case 0:
                this.f39174b.f39192b.setVisibility(8);
                return;
            default:
                this.f39174b.f39193c.setVisibility(8);
                return;
        }
    }
}
