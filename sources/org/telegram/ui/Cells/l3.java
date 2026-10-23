package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l3 extends AnimatorListenerAdapter {
    public final n3 f22672a;

    public l3(n3 n3Var) {
        this.f22672a = n3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n3 n3Var = this.f22672a;
        if (n3Var.f22790w) {
            n3Var.f22786f.setVisibility(4);
            n3Var.h.setVisibility(4);
            n3Var.f22787n.setVisibility(0);
            return;
        }
        if (n3Var.v) {
            n3Var.f22786f.setVisibility(4);
        } else {
            n3Var.h.setVisibility(4);
        }
        n3Var.f22787n.setVisibility(8);
    }
}
