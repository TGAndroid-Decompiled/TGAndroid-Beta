package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p3 extends AnimatorListenerAdapter {
    public final r3 f31313a;

    public p3(r3 r3Var) {
        this.f31313a = r3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.f31313a;
        if (r3Var.f31774x) {
            r3Var.f31769f.setVisibility(4);
            r3Var.h.setVisibility(4);
            r3Var.f31770n.setVisibility(0);
            return;
        }
        if (r3Var.f31773w) {
            r3Var.f31769f.setVisibility(4);
        } else {
            r3Var.h.setVisibility(4);
        }
        r3Var.f31770n.setVisibility(8);
    }
}
