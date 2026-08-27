package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class h20 extends AnimatorListenerAdapter {

    public final int f28905a;

    public final n20 f28906b;

    public h20(n20 n20Var, int i10) {
        this.f28905a = i10;
        this.f28906b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28905a) {
            case 0:
                n20 n20Var = this.f28906b;
                n20Var.f30820b.setVisibility(8);
                n20Var.f30829y = false;
                n20Var.A = 0.0f;
                break;
            default:
                this.f28906b.f30822e.setVisibility(8);
                break;
        }
    }
}
