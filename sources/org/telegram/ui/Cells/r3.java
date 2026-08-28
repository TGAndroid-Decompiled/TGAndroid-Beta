package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f25086a;

    public r3(s3 s3Var) {
        this.f25086a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f25086a;
        if (s3Var.f25263r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.f25260e.setVisibility(4);
        }
    }
}
