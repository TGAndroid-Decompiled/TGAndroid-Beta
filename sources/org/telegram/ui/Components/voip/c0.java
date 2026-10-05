package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f31868a;
    public final m0 f31869b;

    public c0(m0 m0Var, u uVar) {
        this.f31869b = m0Var;
        this.f31868a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f31869b;
        m0Var.f32078x.unlock();
        m0Var.f32069r = null;
        this.f31868a.f32266r = false;
        if (!m0Var.f32049b) {
            m0Var.d();
            m0Var.f32080y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f32049b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f32051c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f32049b) {
            m0Var.f32062k0.setVisibility(8);
            m0Var.f32063l0.setVisibility(8);
            m0Var.f32055e0.setVisibility(8);
            m0Var.f32057f0.setVisibility(8);
        }
    }
}
