package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f22475a;

    public r3(s3 s3Var) {
        this.f22475a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22475a;
        if (s3Var.f22666r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.f22663e.setVisibility(4);
        }
    }
}
