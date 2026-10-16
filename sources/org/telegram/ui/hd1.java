package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hd1 extends AnimatorListenerAdapter {
    public final ce1 f36525a;

    public hd1(ce1 ce1Var) {
        this.f36525a = ce1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        ce1 ce1Var = this.f36525a;
        org.telegram.ui.Components.m91[] m91VarArr = ce1Var.J0;
        if (ce1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        m91VarArr[c10].setVisibility(4);
    }
}
