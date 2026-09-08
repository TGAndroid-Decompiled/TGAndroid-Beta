package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m3 extends AnimatorListenerAdapter {
    public final o3 f22306a;

    public m3(o3 o3Var) {
        this.f22306a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o3 o3Var = this.f22306a;
        if (o3Var.v) {
            o3Var.f22450e.setVisibility(4);
            o3Var.f22451f.setVisibility(4);
            o3Var.h.setVisibility(0);
            return;
        }
        if (o3Var.f22454s) {
            o3Var.f22450e.setVisibility(4);
        } else {
            o3Var.f22451f.setVisibility(4);
        }
        o3Var.h.setVisibility(8);
    }
}
