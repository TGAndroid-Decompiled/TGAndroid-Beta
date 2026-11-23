package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c71 extends AnimatorListenerAdapter {
    public final x71 f46486a;

    public c71(x71 x71Var) {
        this.f46486a = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        x71 x71Var = this.f46486a;
        org.telegram.ui.Components.k71[] k71VarArr = x71Var.L0;
        if (x71Var.Y0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        k71VarArr[c10].setVisibility(4);
    }
}
