package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final t3 f21055a;

    public s3(t3 t3Var) {
        this.f21055a = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t3 t3Var = this.f21055a;
        if (t3Var.f21200r) {
            t3Var.d.setVisibility(4);
        } else {
            t3Var.e.setVisibility(4);
        }
    }
}
