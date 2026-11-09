package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f39315a;
    public final h2 f39316b;

    public g2(h2 h2Var, int i7) {
        this.f39315a = i7;
        this.f39316b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39315a) {
            case 0:
                this.f39316b.f39334b.setVisibility(8);
                return;
            default:
                this.f39316b.f39335c.setVisibility(8);
                return;
        }
    }
}
