package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k3 extends AnimatorListenerAdapter {
    public final m3 f24591a;

    public k3(m3 m3Var) {
        this.f24591a = m3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m3 m3Var = this.f24591a;
        if (m3Var.v) {
            m3Var.f24689e.setVisibility(4);
            m3Var.f24690f.setVisibility(4);
            m3Var.h.setVisibility(0);
            return;
        }
        if (m3Var.f24693s) {
            m3Var.f24689e.setVisibility(4);
        } else {
            m3Var.f24690f.setVisibility(4);
        }
        m3Var.h.setVisibility(8);
    }
}
