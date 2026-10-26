package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dy0 extends AnimatorListenerAdapter {
    public final int f27635a;
    public final ey0 f27636b;

    public dy0(ey0 ey0Var, int i10) {
        this.f27635a = i10;
        this.f27636b = ey0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27635a) {
            case 0:
                this.f27636b.f28020s.setVisibility(8);
                return;
            case 1:
                this.f27636b.f28020s.setVisibility(8);
                return;
            default:
                this.f27636b.f28020s.setVisibility(8);
                return;
        }
    }
}
