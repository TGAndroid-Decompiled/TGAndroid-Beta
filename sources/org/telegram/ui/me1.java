package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f38689a;
    public final ne1 f38690b;

    public me1(ne1 ne1Var, int i10) {
        this.f38689a = i10;
        this.f38690b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38689a) {
            case 0:
                this.f38690b.h.f40735s.setVisibility(8);
                return;
            default:
                this.f38690b.h.f40728a.setVisibility(8);
                return;
        }
    }
}
