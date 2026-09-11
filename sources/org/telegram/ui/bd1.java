package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bd1 extends AnimatorListenerAdapter {
    public final wd1 f34769a;

    public bd1(wd1 wd1Var) {
        this.f34769a = wd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        wd1 wd1Var = this.f34769a;
        org.telegram.ui.Components.j81[] j81VarArr = wd1Var.J0;
        if (wd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        j81VarArr[c10].setVisibility(4);
    }
}
