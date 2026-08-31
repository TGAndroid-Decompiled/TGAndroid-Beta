package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m3 extends AnimatorListenerAdapter {
    public final o3 f23159a;

    public m3(o3 o3Var) {
        this.f23159a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o3 o3Var = this.f23159a;
        if (o3Var.v) {
            o3Var.f23291e.setVisibility(4);
            o3Var.f23292f.setVisibility(4);
            o3Var.h.setVisibility(0);
            return;
        }
        if (o3Var.f23295s) {
            o3Var.f23291e.setVisibility(4);
        } else {
            o3Var.f23292f.setVisibility(4);
        }
        o3Var.h.setVisibility(8);
    }
}
