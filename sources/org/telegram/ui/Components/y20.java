package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y20 extends AnimatorListenerAdapter {
    public final int f33030a;
    public final d30 f33031b;

    public y20(d30 d30Var, int i10) {
        this.f33030a = i10;
        this.f33031b = d30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33030a) {
            case 0:
                d30 d30Var = this.f33031b;
                d30Var.f25536b.setVisibility(8);
                d30Var.f25547y = false;
                d30Var.E = 0.0f;
                return;
            default:
                this.f33031b.f25540e.setVisibility(8);
                return;
        }
    }
}
