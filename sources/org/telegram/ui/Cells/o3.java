package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f24581a;

    public o3(q3 q3Var) {
        this.f24581a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f24581a;
        if (q3Var.f24822r) {
            q3Var.d.setVisibility(4);
        } else {
            q3Var.e.setVisibility(4);
        }
    }
}
