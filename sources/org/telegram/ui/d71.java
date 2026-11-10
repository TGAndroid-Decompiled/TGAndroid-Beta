package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d71 extends AnimatorListenerAdapter {
    public final x71 f44923a;

    public d71(x71 x71Var) {
        this.f44923a = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        x71 x71Var = this.f44923a;
        org.telegram.ui.Components.w61[] w61VarArr = x71Var.K0;
        if (x71Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        w61VarArr[c10].setVisibility(4);
    }
}
