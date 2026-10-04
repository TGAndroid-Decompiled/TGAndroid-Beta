package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y20 extends AnimatorListenerAdapter {
    public final int f33029a;
    public final d30 f33030b;

    public y20(d30 d30Var, int i10) {
        this.f33029a = i10;
        this.f33030b = d30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33029a) {
            case 0:
                d30 d30Var = this.f33030b;
                d30Var.f25535b.setVisibility(8);
                d30Var.f25546y = false;
                d30Var.E = 0.0f;
                return;
            default:
                this.f33030b.f25539e.setVisibility(8);
                return;
        }
    }
}
