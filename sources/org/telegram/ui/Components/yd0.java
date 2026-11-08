package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f40653a;
    public final zd0 f40654b;

    public yd0(zd0 zd0Var, int i7) {
        this.f40653a = i7;
        this.f40654b = zd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40653a) {
            case 0:
                this.f40654b.f40956a.f31797n.setVisibility(8);
                return;
            default:
                this.f40654b.f40956a.h.setVisibility(8);
                return;
        }
    }
}
