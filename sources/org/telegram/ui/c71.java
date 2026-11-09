package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c71 extends AnimatorListenerAdapter {
    public final w71 f44242a;

    public c71(w71 w71Var) {
        this.f44242a = w71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        w71 w71Var = this.f44242a;
        org.telegram.ui.Components.x61[] x61VarArr = w71Var.K0;
        if (w71Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        x61VarArr[c10].setVisibility(4);
    }
}
