package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k3 extends AnimatorListenerAdapter {

    public final m3 f24570a;

    public k3(m3 m3Var) {
        this.f24570a = m3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m3 m3Var = this.f24570a;
        if (m3Var.v) {
            m3Var.f24671e.setVisibility(4);
            m3Var.f24672f.setVisibility(4);
            m3Var.h.setVisibility(0);
        } else {
            if (m3Var.f24675s) {
                m3Var.f24671e.setVisibility(4);
            } else {
                m3Var.f24672f.setVisibility(4);
            }
            m3Var.h.setVisibility(8);
        }
    }
}
