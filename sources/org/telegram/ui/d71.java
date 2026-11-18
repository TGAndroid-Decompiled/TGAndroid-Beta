package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d71 extends AnimatorListenerAdapter {
    public final x71 f46888a;

    public d71(x71 x71Var) {
        this.f46888a = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.f46888a;
        if (x71Var.Y0 == null) {
            x71Var.L0[0].setVisibility(4);
        }
    }
}
