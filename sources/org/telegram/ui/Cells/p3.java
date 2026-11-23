package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p3 extends AnimatorListenerAdapter {
    public final r3 f31202a;

    public p3(r3 r3Var) {
        this.f31202a = r3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.f31202a;
        if (r3Var.f31690x) {
            r3Var.f31685f.setVisibility(4);
            r3Var.h.setVisibility(4);
            r3Var.f31686n.setVisibility(0);
            return;
        }
        if (r3Var.f31689w) {
            r3Var.f31685f.setVisibility(4);
        } else {
            r3Var.h.setVisibility(4);
        }
        r3Var.f31686n.setVisibility(8);
    }
}
