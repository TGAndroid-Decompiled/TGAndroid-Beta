package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fy0 extends AnimatorListenerAdapter {
    public final int f26188a;
    public final gy0 f26189b;

    public fy0(gy0 gy0Var, int i10) {
        this.f26188a = i10;
        this.f26189b = gy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26188a) {
            case 0:
                this.f26189b.f26561s.setVisibility(8);
                return;
            case 1:
                this.f26189b.f26561s.setVisibility(8);
                return;
            default:
                this.f26189b.f26561s.setVisibility(8);
                return;
        }
    }
}
