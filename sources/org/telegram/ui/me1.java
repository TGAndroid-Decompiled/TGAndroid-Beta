package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f39960a;
    public final ne1 f39961b;

    public me1(ne1 ne1Var, int i10) {
        this.f39960a = i10;
        this.f39961b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39960a) {
            case 0:
                this.f39961b.h.f42208s.setVisibility(8);
                return;
            default:
                this.f39961b.h.f42201a.setVisibility(8);
                return;
        }
    }
}
