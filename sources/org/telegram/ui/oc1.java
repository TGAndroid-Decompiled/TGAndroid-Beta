package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oc1 extends AnimatorListenerAdapter {
    public final jd1 f39656a;

    public oc1(jd1 jd1Var) {
        this.f39656a = jd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c3;
        jd1 jd1Var = this.f39656a;
        org.telegram.ui.Components.m81[] m81VarArr = jd1Var.G0;
        if (jd1Var.T0 != null) {
            c3 = 0;
        } else {
            c3 = 2;
        }
        m81VarArr[c3].setVisibility(4);
    }
}
