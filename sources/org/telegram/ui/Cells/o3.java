package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f29642a;

    public o3(q3 q3Var) {
        this.f29642a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f29642a;
        if (q3Var.f30119x) {
            q3Var.f30114f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.f30115n.setVisibility(0);
            return;
        }
        if (q3Var.f30118w) {
            q3Var.f30114f.setVisibility(4);
        } else {
            q3Var.h.setVisibility(4);
        }
        q3Var.f30115n.setVisibility(8);
    }
}
