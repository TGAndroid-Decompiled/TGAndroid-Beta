package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u3 extends AnimatorListenerAdapter {
    public final w3 f23130a;

    public u3(w3 w3Var) {
        this.f23130a = w3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w3 w3Var = this.f23130a;
        if (w3Var.f23386r) {
            w3Var.d.setVisibility(4);
        } else {
            w3Var.e.setVisibility(4);
        }
    }
}
