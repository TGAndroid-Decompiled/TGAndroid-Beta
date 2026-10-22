package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sx0 extends AnimatorListenerAdapter {
    public final int f30374a;
    public final tx0 f30375b;

    public sx0(tx0 tx0Var, int i10) {
        this.f30374a = i10;
        this.f30375b = tx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30374a) {
            case 0:
                this.f30375b.f30705s.setVisibility(8);
                return;
            case 1:
                this.f30375b.f30705s.setVisibility(8);
                return;
            default:
                this.f30375b.f30705s.setVisibility(8);
                return;
        }
    }
}
