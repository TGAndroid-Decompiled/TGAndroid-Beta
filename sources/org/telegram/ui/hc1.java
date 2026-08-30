package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hc1 extends AnimatorListenerAdapter {
    public final cd1 f34813a;

    public hc1(cd1 cd1Var) {
        this.f34813a = cd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c3;
        cd1 cd1Var = this.f34813a;
        org.telegram.ui.Components.m81[] m81VarArr = cd1Var.G0;
        if (cd1Var.T0 != null) {
            c3 = 0;
        } else {
            c3 = 2;
        }
        m81VarArr[c3].setVisibility(4);
    }
}
