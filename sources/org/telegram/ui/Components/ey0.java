package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ey0 extends AnimatorListenerAdapter {
    public final int f27964a;
    public final fy0 f27965b;

    public ey0(fy0 fy0Var, int i10) {
        this.f27964a = i10;
        this.f27965b = fy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27964a) {
            case 0:
                this.f27965b.f28318s.setVisibility(8);
                return;
            case 1:
                this.f27965b.f28318s.setVisibility(8);
                return;
            default:
                this.f27965b.f28318s.setVisibility(8);
                return;
        }
    }
}
