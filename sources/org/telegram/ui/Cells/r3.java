package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f22740a;

    public r3(s3 s3Var) {
        this.f22740a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22740a;
        if (s3Var.f22931r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.f22928e.setVisibility(4);
        }
    }
}
