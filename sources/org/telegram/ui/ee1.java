package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f33386a;
    public final fe1 f33387b;

    public ee1(fe1 fe1Var, int i10) {
        this.f33386a = i10;
        this.f33387b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33386a) {
            case 0:
                this.f33387b.h.f35344s.setVisibility(8);
                return;
            default:
                this.f33387b.h.f35338a.setVisibility(8);
                return;
        }
    }
}
