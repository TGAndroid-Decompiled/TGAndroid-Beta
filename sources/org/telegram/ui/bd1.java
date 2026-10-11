package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bd1 extends AnimatorListenerAdapter {
    public final wd1 f36345a;

    public bd1(wd1 wd1Var) {
        this.f36345a = wd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        wd1 wd1Var = this.f36345a;
        org.telegram.ui.Components.r91[] r91VarArr = wd1Var.J0;
        if (wd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        r91VarArr[c10].setVisibility(4);
    }
}
