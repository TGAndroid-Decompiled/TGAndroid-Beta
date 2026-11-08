package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b71 extends AnimatorListenerAdapter {
    public final v71 f44220a;

    public b71(v71 v71Var) {
        this.f44220a = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        v71 v71Var = this.f44220a;
        org.telegram.ui.Components.w61[] w61VarArr = v71Var.K0;
        if (v71Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        w61VarArr[c10].setVisibility(4);
    }
}
