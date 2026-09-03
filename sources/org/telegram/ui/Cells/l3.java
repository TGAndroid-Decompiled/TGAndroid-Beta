package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l3 extends AnimatorListenerAdapter {
    public final n3 f21317a;

    public l3(n3 n3Var) {
        this.f21317a = n3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n3 n3Var = this.f21317a;
        if (n3Var.v) {
            n3Var.e.setVisibility(4);
            n3Var.f21420f.setVisibility(4);
            n3Var.h.setVisibility(0);
            return;
        }
        if (n3Var.f21423s) {
            n3Var.e.setVisibility(4);
        } else {
            n3Var.f21420f.setVisibility(4);
        }
        n3Var.h.setVisibility(8);
    }
}
