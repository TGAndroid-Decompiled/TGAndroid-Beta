package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d71 extends AnimatorListenerAdapter {
    public final w71 f44882a;

    public d71(w71 w71Var) {
        this.f44882a = w71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w71 w71Var = this.f44882a;
        if (w71Var.X0 == null) {
            w71Var.K0[0].setVisibility(4);
        }
    }
}
