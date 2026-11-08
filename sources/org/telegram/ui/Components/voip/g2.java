package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f39226a;
    public final h2 f39227b;

    public g2(h2 h2Var, int i7) {
        this.f39226a = i7;
        this.f39227b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39226a) {
            case 0:
                this.f39227b.f39245b.setVisibility(8);
                return;
            default:
                this.f39227b.f39246c.setVisibility(8);
                return;
        }
    }
}
