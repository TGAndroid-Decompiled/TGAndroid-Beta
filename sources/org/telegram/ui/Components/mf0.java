package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f30569a;
    public final of0 f30570b;

    public mf0(of0 of0Var, int i10) {
        this.f30569a = i10;
        this.f30570b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30569a) {
            case 0:
                this.f30570b.f31290s = null;
                return;
            default:
                this.f30570b.v = null;
                return;
        }
    }
}
