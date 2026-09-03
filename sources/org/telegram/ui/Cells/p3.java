package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p3 extends AnimatorListenerAdapter {
    public final q3 f21504a;

    public p3(q3 q3Var) {
        this.f21504a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f21504a;
        if (q3Var.f21690r) {
            q3Var.d.setVisibility(4);
        } else {
            q3Var.e.setVisibility(4);
        }
    }
}
