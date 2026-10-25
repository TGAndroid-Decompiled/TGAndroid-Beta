package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k3 extends AnimatorListenerAdapter {
    public final m3 f24318a;

    public k3(m3 m3Var) {
        this.f24318a = m3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m3 m3Var = this.f24318a;
        if (m3Var.f24440w) {
            m3Var.f24436f.setVisibility(4);
            m3Var.h.setVisibility(4);
            m3Var.f24437n.setVisibility(0);
            return;
        }
        if (m3Var.v) {
            m3Var.f24436f.setVisibility(4);
        } else {
            m3Var.h.setVisibility(4);
        }
        m3Var.f24437n.setVisibility(8);
    }
}
