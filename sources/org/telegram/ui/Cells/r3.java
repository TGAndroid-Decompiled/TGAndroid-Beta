package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final s3 f22715a;

    public r3(s3 s3Var) {
        this.f22715a = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.f22715a;
        if (s3Var.f22907r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.f22904e.setVisibility(4);
        }
    }
}
