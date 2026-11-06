package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a71 extends AnimatorListenerAdapter {
    public final u71 f43591a;

    public a71(u71 u71Var) {
        this.f43591a = u71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        u71 u71Var = this.f43591a;
        org.telegram.ui.Components.v61[] v61VarArr = u71Var.K0;
        if (u71Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        v61VarArr[c10].setVisibility(4);
    }
}
