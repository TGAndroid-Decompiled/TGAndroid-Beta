package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rx0 extends AnimatorListenerAdapter {
    public final int f30063a;
    public final sx0 f30064b;

    public rx0(sx0 sx0Var, int i10) {
        this.f30063a = i10;
        this.f30064b = sx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30063a) {
            case 0:
                this.f30064b.f30358s.setVisibility(8);
                return;
            case 1:
                this.f30064b.f30358s.setVisibility(8);
                return;
            default:
                this.f30064b.f30358s.setVisibility(8);
                return;
        }
    }
}
