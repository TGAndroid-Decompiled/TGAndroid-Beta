package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f33387a;
    public final fe1 f33388b;

    public ee1(fe1 fe1Var, int i10) {
        this.f33387a = i10;
        this.f33388b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33387a) {
            case 0:
                this.f33388b.h.f35345s.setVisibility(8);
                return;
            default:
                this.f33388b.h.f35339a.setVisibility(8);
                return;
        }
    }
}
