package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q3 extends AnimatorListenerAdapter {
    public final s3 f22821a;

    public q3(s3 s3Var) {
        this.f22821a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22821a;
        if (s3Var.f23006x) {
            s3Var.f23001f.setVisibility(4);
            s3Var.h.setVisibility(4);
            s3Var.f23002n.setVisibility(0);
            return;
        }
        if (s3Var.f23005w) {
            s3Var.f23001f.setVisibility(4);
        } else {
            s3Var.h.setVisibility(4);
        }
        s3Var.f23002n.setVisibility(8);
    }
}
