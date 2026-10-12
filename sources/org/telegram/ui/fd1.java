package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fd1 extends AnimatorListenerAdapter {
    public final zd1 f37761a;

    public fd1(zd1 zd1Var) {
        this.f37761a = zd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zd1 zd1Var = this.f37761a;
        if (zd1Var.W0 == null) {
            zd1Var.J0[0].setVisibility(4);
        }
    }
}
