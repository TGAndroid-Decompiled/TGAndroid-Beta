package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final xd1 f32763a;

    public cd1(xd1 xd1Var) {
        this.f32763a = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        xd1 xd1Var = this.f32763a;
        org.telegram.ui.Components.k81[] k81VarArr = xd1Var.J0;
        if (xd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        k81VarArr[c10].setVisibility(4);
    }
}
