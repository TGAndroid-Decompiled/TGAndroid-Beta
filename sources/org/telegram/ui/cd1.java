package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final xd1 f36672a;

    public cd1(xd1 xd1Var) {
        this.f36672a = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        xd1 xd1Var = this.f36672a;
        org.telegram.ui.Components.q91[] q91VarArr = xd1Var.J0;
        if (xd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        q91VarArr[c10].setVisibility(4);
    }
}
