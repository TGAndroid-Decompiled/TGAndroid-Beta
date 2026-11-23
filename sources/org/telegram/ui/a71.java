package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a71 extends AnimatorListenerAdapter {
    public final v71 f45618a;

    public a71(v71 v71Var) {
        this.f45618a = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        v71 v71Var = this.f45618a;
        org.telegram.ui.Components.l71[] l71VarArr = v71Var.L0;
        if (v71Var.Y0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        l71VarArr[c10].setVisibility(4);
    }
}
