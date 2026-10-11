package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f39926a;
    public final ne1 f39927b;

    public me1(ne1 ne1Var, int i10) {
        this.f39926a = i10;
        this.f39927b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39926a) {
            case 0:
                this.f39927b.h.f42174s.setVisibility(8);
                return;
            default:
                this.f39927b.h.f42167a.setVisibility(8);
                return;
        }
    }
}
