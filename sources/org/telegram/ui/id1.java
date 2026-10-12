package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class id1 extends AnimatorListenerAdapter {
    public final ce1 f37099a;

    public id1(ce1 ce1Var) {
        this.f37099a = ce1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ce1 ce1Var = this.f37099a;
        if (ce1Var.W0 == null) {
            ce1Var.J0[0].setVisibility(4);
        }
    }
}
