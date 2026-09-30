package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f30216a;
    public final c30 f30217b;

    public x20(c30 c30Var, int i10) {
        this.f30216a = i10;
        this.f30217b = c30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30216a) {
            case 0:
                c30 c30Var = this.f30217b;
                c30Var.f23163b.setVisibility(8);
                c30Var.f23173y = false;
                c30Var.E = 0.0f;
                return;
            default:
                this.f30217b.e.setVisibility(8);
                return;
        }
    }
}
