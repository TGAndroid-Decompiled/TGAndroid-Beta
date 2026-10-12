package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fy0 extends AnimatorListenerAdapter {
    public final int f26186a;
    public final gy0 f26187b;

    public fy0(gy0 gy0Var, int i10) {
        this.f26186a = i10;
        this.f26187b = gy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26186a) {
            case 0:
                this.f26187b.f26565s.setVisibility(8);
                return;
            case 1:
                this.f26187b.f26565s.setVisibility(8);
                return;
            default:
                this.f26187b.f26565s.setVisibility(8);
                return;
        }
    }
}
