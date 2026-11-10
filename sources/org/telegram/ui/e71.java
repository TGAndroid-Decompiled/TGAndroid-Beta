package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e71 extends AnimatorListenerAdapter {
    public final x71 f45190a;

    public e71(x71 x71Var) {
        this.f45190a = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.f45190a;
        if (x71Var.X0 == null) {
            x71Var.K0[0].setVisibility(4);
        }
    }
}
