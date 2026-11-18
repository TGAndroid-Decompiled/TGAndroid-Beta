package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f31158a;

    public o3(q3 q3Var) {
        this.f31158a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f31158a;
        if (q3Var.f31643x) {
            q3Var.f31638f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.f31639n.setVisibility(0);
            return;
        }
        if (q3Var.f31642w) {
            q3Var.f31638f.setVisibility(4);
        } else {
            q3Var.h.setVisibility(4);
        }
        q3Var.f31639n.setVisibility(8);
    }
}
