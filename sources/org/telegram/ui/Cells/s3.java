package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final u3 f30266a;

    public s3(u3 u3Var) {
        this.f30266a = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.f30266a;
        if (u3Var.f30576r) {
            u3Var.d.setVisibility(4);
        } else {
            u3Var.f30573e.setVisibility(4);
        }
    }
}
