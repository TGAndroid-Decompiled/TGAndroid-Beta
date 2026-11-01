package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q81 extends AnimatorListenerAdapter {
    public final k91 f40726a;

    public q81(k91 k91Var) {
        this.f40726a = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        k91 k91Var = this.f40726a;
        org.telegram.ui.Components.y71[] y71VarArr = k91Var.K0;
        if (k91Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        y71VarArr[c10].setVisibility(4);
    }
}
