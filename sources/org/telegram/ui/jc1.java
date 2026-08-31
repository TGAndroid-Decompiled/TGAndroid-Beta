package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jc1 extends AnimatorListenerAdapter {
    public final ed1 f38106a;

    public jc1(ed1 ed1Var) {
        this.f38106a = ed1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c3;
        ed1 ed1Var = this.f38106a;
        org.telegram.ui.Components.n81[] n81VarArr = ed1Var.G0;
        if (ed1Var.T0 != null) {
            c3 = 0;
        } else {
            c3 = 2;
        }
        n81VarArr[c3].setVisibility(4);
    }
}
