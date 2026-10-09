package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f31872a;
    public final m0 f31873b;

    public c0(m0 m0Var, u uVar) {
        this.f31873b = m0Var;
        this.f31872a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f31873b;
        m0Var.f32084x.unlock();
        m0Var.f32075r = null;
        this.f31872a.f32273r = false;
        if (!m0Var.f32055b) {
            m0Var.d();
            m0Var.f32086y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f32055b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f32057c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f32055b) {
            m0Var.f32068k0.setVisibility(8);
            m0Var.f32069l0.setVisibility(8);
            m0Var.f32061e0.setVisibility(8);
            m0Var.f32063f0.setVisibility(8);
        }
    }
}
