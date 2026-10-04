package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je1 extends AnimatorListenerAdapter {
    public final int f37673a;
    public final ne1 f37674b;

    public je1(ne1 ne1Var, int i10) {
        this.f37673a = i10;
        this.f37674b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37673a) {
            case 0:
                ne1 ne1Var = this.f37674b;
                ne1Var.v = 0;
                ne1Var.f38966n.setVisibility(8);
                return;
            case 1:
                this.f37674b.v = 0;
                return;
            default:
                this.f37674b.F.setVisibility(8);
                return;
        }
    }
}
