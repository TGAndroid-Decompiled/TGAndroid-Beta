package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f38690a;
    public final ne1 f38691b;

    public me1(ne1 ne1Var, int i10) {
        this.f38690a = i10;
        this.f38691b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38690a) {
            case 0:
                this.f38691b.h.f40736s.setVisibility(8);
                return;
            default:
                this.f38691b.h.f40729a.setVisibility(8);
                return;
        }
    }
}
