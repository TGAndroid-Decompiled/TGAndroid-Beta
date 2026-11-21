package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t3 extends AnimatorListenerAdapter {
    public final v3 f31857a;

    public t3(v3 v3Var) {
        this.f31857a = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.f31857a;
        if (v3Var.f32190r) {
            v3Var.d.setVisibility(4);
        } else {
            v3Var.f32187e.setVisibility(4);
        }
    }
}
