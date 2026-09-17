package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f38717a;
    public final ne1 f38718b;

    public me1(ne1 ne1Var, int i10) {
        this.f38717a = i10;
        this.f38718b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38717a) {
            case 0:
                this.f38718b.h.f40763s.setVisibility(8);
                return;
            default:
                this.f38718b.h.f40756a.setVisibility(8);
                return;
        }
    }
}
