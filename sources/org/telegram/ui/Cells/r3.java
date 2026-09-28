package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f20869a;

    public r3(s3 s3Var) {
        this.f20869a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f20869a;
        if (s3Var.f21057r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.e.setVisibility(4);
        }
    }
}
