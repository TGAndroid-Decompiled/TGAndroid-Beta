package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f20757a;

    public o3(q3 q3Var) {
        this.f20757a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f20757a;
        if (q3Var.v) {
            q3Var.e.setVisibility(4);
            q3Var.f20853f.setVisibility(4);
            q3Var.h.setVisibility(0);
            return;
        }
        if (q3Var.f20856s) {
            q3Var.e.setVisibility(4);
        } else {
            q3Var.f20853f.setVisibility(4);
        }
        q3Var.h.setVisibility(8);
    }
}
