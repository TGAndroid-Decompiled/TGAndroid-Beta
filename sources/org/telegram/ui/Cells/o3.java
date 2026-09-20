package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f20742a;

    public o3(q3 q3Var) {
        this.f20742a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f20742a;
        if (q3Var.v) {
            q3Var.e.setVisibility(4);
            q3Var.f20838f.setVisibility(4);
            q3Var.h.setVisibility(0);
            return;
        }
        if (q3Var.f20841s) {
            q3Var.e.setVisibility(4);
        } else {
            q3Var.f20838f.setVisibility(4);
        }
        q3Var.h.setVisibility(8);
    }
}
