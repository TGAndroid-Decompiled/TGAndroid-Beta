package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed1 extends AnimatorListenerAdapter {
    public final zd1 f37070a;

    public ed1(zd1 zd1Var) {
        this.f37070a = zd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        zd1 zd1Var = this.f37070a;
        org.telegram.ui.Components.v91[] v91VarArr = zd1Var.J0;
        if (zd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        v91VarArr[c10].setVisibility(4);
    }
}
