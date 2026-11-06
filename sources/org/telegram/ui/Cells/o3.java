package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f29641a;

    public o3(q3 q3Var) {
        this.f29641a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f29641a;
        if (q3Var.f30118x) {
            q3Var.f30113f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.f30114n.setVisibility(0);
            return;
        }
        if (q3Var.f30117w) {
            q3Var.f30113f.setVisibility(4);
        } else {
            q3Var.h.setVisibility(4);
        }
        q3Var.f30114n.setVisibility(8);
    }
}
