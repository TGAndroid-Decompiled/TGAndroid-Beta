package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final p3 f21260a;

    public n3(p3 p3Var) {
        this.f21260a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.f21260a;
        if (p3Var.v) {
            p3Var.e.setVisibility(4);
            p3Var.f21387f.setVisibility(4);
            p3Var.h.setVisibility(0);
            return;
        }
        if (p3Var.f21390s) {
            p3Var.e.setVisibility(4);
        } else {
            p3Var.f21387f.setVisibility(4);
        }
        p3Var.h.setVisibility(8);
    }
}
