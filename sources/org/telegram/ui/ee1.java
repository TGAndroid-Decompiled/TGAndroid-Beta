package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f33470a;
    public final fe1 f33471b;

    public ee1(fe1 fe1Var, int i10) {
        this.f33470a = i10;
        this.f33471b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33470a) {
            case 0:
                this.f33471b.h.f35436s.setVisibility(8);
                return;
            default:
                this.f33471b.h.f35430a.setVisibility(8);
                return;
        }
    }
}
