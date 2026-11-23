package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b71 extends AnimatorListenerAdapter {
    public final v71 f45978a;

    public b71(v71 v71Var) {
        this.f45978a = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.f45978a;
        if (v71Var.Y0 == null) {
            v71Var.L0[0].setVisibility(4);
        }
    }
}
