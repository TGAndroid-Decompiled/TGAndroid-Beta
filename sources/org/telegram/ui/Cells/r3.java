package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f22476a;

    public r3(s3 s3Var) {
        this.f22476a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22476a;
        if (s3Var.f22667r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.f22664e.setVisibility(4);
        }
    }
}
