package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final u3 f31411a;

    public s3(u3 u3Var) {
        this.f31411a = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.f31411a;
        if (u3Var.f31720r) {
            u3Var.d.setVisibility(4);
        } else {
            u3Var.f31717e.setVisibility(4);
        }
    }
}
