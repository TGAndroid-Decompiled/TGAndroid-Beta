package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final p3 f20686a;

    public n3(p3 p3Var) {
        this.f20686a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.f20686a;
        if (p3Var.v) {
            p3Var.e.setVisibility(4);
            p3Var.f20804f.setVisibility(4);
            p3Var.h.setVisibility(0);
            return;
        }
        if (p3Var.f20807s) {
            p3Var.e.setVisibility(4);
        } else {
            p3Var.f20804f.setVisibility(4);
        }
        p3Var.h.setVisibility(8);
    }
}
