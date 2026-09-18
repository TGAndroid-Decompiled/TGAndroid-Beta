package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ad1 extends AnimatorListenerAdapter {
    public final vd1 f32006a;

    public ad1(vd1 vd1Var) {
        this.f32006a = vd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        vd1 vd1Var = this.f32006a;
        org.telegram.ui.Components.y81[] y81VarArr = vd1Var.J0;
        if (vd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        y81VarArr[c10].setVisibility(4);
    }
}
