package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final xd1 f32713a;

    public cd1(xd1 xd1Var) {
        this.f32713a = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        xd1 xd1Var = this.f32713a;
        org.telegram.ui.Components.y81[] y81VarArr = xd1Var.J0;
        if (xd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        y81VarArr[c10].setVisibility(4);
    }
}
