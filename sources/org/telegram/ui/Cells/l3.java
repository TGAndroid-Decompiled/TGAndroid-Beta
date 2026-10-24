package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l3 extends AnimatorListenerAdapter {
    public final n3 f22673a;

    public l3(n3 n3Var) {
        this.f22673a = n3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n3 n3Var = this.f22673a;
        if (n3Var.f22791w) {
            n3Var.f22787f.setVisibility(4);
            n3Var.h.setVisibility(4);
            n3Var.f22788n.setVisibility(0);
            return;
        }
        if (n3Var.v) {
            n3Var.f22787f.setVisibility(4);
        } else {
            n3Var.h.setVisibility(4);
        }
        n3Var.f22788n.setVisibility(8);
    }
}
