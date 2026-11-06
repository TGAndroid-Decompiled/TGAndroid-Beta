package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b71 extends AnimatorListenerAdapter {
    public final u71 f44215a;

    public b71(u71 u71Var) {
        this.f44215a = u71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u71 u71Var = this.f44215a;
        if (u71Var.X0 == null) {
            u71Var.K0[0].setVisibility(4);
        }
    }
}
