package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bd1 extends AnimatorListenerAdapter {
    public final vd1 f32138a;

    public bd1(vd1 vd1Var) {
        this.f32138a = vd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vd1 vd1Var = this.f32138a;
        if (vd1Var.W0 == null) {
            vd1Var.J0[0].setVisibility(4);
        }
    }
}
