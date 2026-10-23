package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pb1 extends AnimatorListenerAdapter {
    public final kc1 f40189a;

    public pb1(kc1 kc1Var) {
        this.f40189a = kc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        kc1 kc1Var = this.f40189a;
        org.telegram.ui.Components.f91[] f91VarArr = kc1Var.J0;
        if (kc1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        f91VarArr[c10].setVisibility(4);
    }
}
