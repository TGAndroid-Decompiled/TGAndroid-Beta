package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf0 extends AnimatorListenerAdapter {
    public final int f30314a;
    public final yf0 f30315b;

    public xf0(yf0 yf0Var, int i10) {
        this.f30314a = i10;
        this.f30315b = yf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30314a) {
            case 0:
                this.f30315b.f30569a.f30787n.setVisibility(8);
                return;
            default:
                this.f30315b.f30569a.h.setVisibility(8);
                return;
        }
    }
}
