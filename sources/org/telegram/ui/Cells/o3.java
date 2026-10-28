package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f24585a;

    public o3(q3 q3Var) {
        this.f24585a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f24585a;
        if (q3Var.f24826r) {
            q3Var.d.setVisibility(4);
        } else {
            q3Var.e.setVisibility(4);
        }
    }
}
