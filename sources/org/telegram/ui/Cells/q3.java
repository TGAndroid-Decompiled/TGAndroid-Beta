package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q3 extends AnimatorListenerAdapter {
    public final r3 f23360a;

    public q3(r3 r3Var) {
        this.f23360a = r3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.f23360a;
        if (r3Var.f23549r) {
            r3Var.d.setVisibility(4);
        } else {
            r3Var.f23546e.setVisibility(4);
        }
    }
}
