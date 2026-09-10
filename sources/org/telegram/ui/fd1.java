package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fd1 extends AnimatorListenerAdapter {
    public final ae1 f32787a;

    public fd1(ae1 ae1Var) {
        this.f32787a = ae1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        ae1 ae1Var = this.f32787a;
        org.telegram.ui.Components.w81[] w81VarArr = ae1Var.J0;
        if (ae1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        w81VarArr[c10].setVisibility(4);
    }
}
