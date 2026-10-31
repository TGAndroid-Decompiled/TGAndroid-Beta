package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q3 extends AnimatorListenerAdapter {
    public final s3 f22820a;

    public q3(s3 s3Var) {
        this.f22820a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22820a;
        if (s3Var.f23005x) {
            s3Var.f23000f.setVisibility(4);
            s3Var.h.setVisibility(4);
            s3Var.f23001n.setVisibility(0);
            return;
        }
        if (s3Var.f23004w) {
            s3Var.f23000f.setVisibility(4);
        } else {
            s3Var.h.setVisibility(4);
        }
        s3Var.f23001n.setVisibility(8);
    }
}
