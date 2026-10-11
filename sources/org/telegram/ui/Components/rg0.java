package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rg0 extends AnimatorListenerAdapter {
    public final int f30521a;
    public final sg0 f30522b;

    public rg0(sg0 sg0Var, int i10) {
        this.f30521a = i10;
        this.f30522b = sg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30521a) {
            case 0:
                this.f30522b.f30862a.f31244n.setVisibility(8);
                return;
            default:
                this.f30522b.f30862a.h.setVisibility(8);
                return;
        }
    }
}
