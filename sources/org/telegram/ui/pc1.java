package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pc1 extends AnimatorListenerAdapter {
    public final jd1 f39976a;

    public pc1(jd1 jd1Var) {
        this.f39976a = jd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jd1 jd1Var = this.f39976a;
        if (jd1Var.T0 == null) {
            jd1Var.G0[0].setVisibility(4);
        }
    }
}
