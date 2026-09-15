package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ad1 extends AnimatorListenerAdapter {
    public final vd1 f31788a;

    public ad1(vd1 vd1Var) {
        this.f31788a = vd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        vd1 vd1Var = this.f31788a;
        org.telegram.ui.Components.j81[] j81VarArr = vd1Var.J0;
        if (vd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        j81VarArr[c10].setVisibility(4);
    }
}
