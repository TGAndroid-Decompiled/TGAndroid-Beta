package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f33360a;
    public final fe1 f33361b;

    public ee1(fe1 fe1Var, int i10) {
        this.f33360a = i10;
        this.f33361b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33360a) {
            case 0:
                this.f33361b.h.f35313s.setVisibility(8);
                return;
            default:
                this.f33361b.h.f35307a.setVisibility(8);
                return;
        }
    }
}
