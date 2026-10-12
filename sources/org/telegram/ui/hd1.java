package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hd1 extends AnimatorListenerAdapter {
    public final ce1 f36763a;

    public hd1(ce1 ce1Var) {
        this.f36763a = ce1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        ce1 ce1Var = this.f36763a;
        org.telegram.ui.Components.l91[] l91VarArr = ce1Var.J0;
        if (ce1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        l91VarArr[c10].setVisibility(4);
    }
}
