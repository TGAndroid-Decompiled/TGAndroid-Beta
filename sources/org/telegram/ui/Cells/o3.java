package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o3 extends AnimatorListenerAdapter {

    public final p3 f24778a;

    public o3(p3 p3Var) {
        this.f24778a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.f24778a;
        if (p3Var.f24975r) {
            p3Var.d.setVisibility(4);
        } else {
            p3Var.f24972e.setVisibility(4);
        }
    }
}
