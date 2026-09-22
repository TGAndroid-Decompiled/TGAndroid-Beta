package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f26772a;
    public final pf0 f26773b;

    public of0(pf0 pf0Var, int i10) {
        this.f26772a = i10;
        this.f26773b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26772a) {
            case 0:
                this.f26773b.f27030a.f27323n.setVisibility(8);
                return;
            default:
                this.f26773b.f27030a.h.setVisibility(8);
                return;
        }
    }
}
