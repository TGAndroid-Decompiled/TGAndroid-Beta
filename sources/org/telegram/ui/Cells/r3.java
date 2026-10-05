package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f22722a;

    public r3(s3 s3Var) {
        this.f22722a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22722a;
        if (s3Var.f22914r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.f22911e.setVisibility(4);
        }
    }
}
