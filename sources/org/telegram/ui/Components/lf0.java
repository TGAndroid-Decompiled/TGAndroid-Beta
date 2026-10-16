package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lf0 extends AnimatorListenerAdapter {
    public final int f26737a;
    public final pf0 f26738b;

    public lf0(pf0 pf0Var, int i10) {
        this.f26737a = i10;
        this.f26738b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26737a) {
            case 0:
                this.f26738b.f27994x = null;
                return;
            default:
                this.f26738b.f27995y = null;
                return;
        }
    }
}
