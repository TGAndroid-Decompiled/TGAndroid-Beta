package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f29649a;

    public o3(q3 q3Var) {
        this.f29649a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f29649a;
        if (q3Var.f30127x) {
            q3Var.f30122f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.f30123n.setVisibility(0);
            return;
        }
        if (q3Var.f30126w) {
            q3Var.f30122f.setVisibility(4);
        } else {
            q3Var.h.setVisibility(4);
        }
        q3Var.f30123n.setVisibility(8);
    }
}
