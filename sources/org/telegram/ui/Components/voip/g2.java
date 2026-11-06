package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f39170a;
    public final h2 f39171b;

    public g2(h2 h2Var, int i7) {
        this.f39170a = i7;
        this.f39171b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39170a) {
            case 0:
                this.f39171b.f39189b.setVisibility(8);
                return;
            default:
                this.f39171b.f39190c.setVisibility(8);
                return;
        }
    }
}
