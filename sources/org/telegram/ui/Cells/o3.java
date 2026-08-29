package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final p3 f24798a;

    public o3(p3 p3Var) {
        this.f24798a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.f24798a;
        if (p3Var.f24966r) {
            p3Var.d.setVisibility(4);
        } else {
            p3Var.f24963e.setVisibility(4);
        }
    }
}
