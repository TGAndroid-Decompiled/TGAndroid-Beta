package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t3 extends AnimatorListenerAdapter {
    public final v3 f31829a;

    public t3(v3 v3Var) {
        this.f31829a = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.f31829a;
        if (v3Var.f32162r) {
            v3Var.d.setVisibility(4);
        } else {
            v3Var.f32159e.setVisibility(4);
        }
    }
}
