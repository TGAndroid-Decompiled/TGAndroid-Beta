package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f38716a;
    public final ne1 f38717b;

    public me1(ne1 ne1Var, int i10) {
        this.f38716a = i10;
        this.f38717b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38716a) {
            case 0:
                this.f38717b.h.f40762s.setVisibility(8);
                return;
            default:
                this.f38717b.h.f40755a.setVisibility(8);
                return;
        }
    }
}
