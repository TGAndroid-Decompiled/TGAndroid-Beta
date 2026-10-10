package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rg0 extends AnimatorListenerAdapter {
    public final int f30462a;
    public final sg0 f30463b;

    public rg0(sg0 sg0Var, int i10) {
        this.f30462a = i10;
        this.f30463b = sg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30462a) {
            case 0:
                this.f30463b.f30782a.f31125n.setVisibility(8);
                return;
            default:
                this.f30463b.f30782a.h.setVisibility(8);
                return;
        }
    }
}
