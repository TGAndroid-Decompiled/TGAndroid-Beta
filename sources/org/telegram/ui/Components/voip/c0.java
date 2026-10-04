package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f31795a;
    public final m0 f31796b;

    public c0(m0 m0Var, u uVar) {
        this.f31796b = m0Var;
        this.f31795a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f31796b;
        m0Var.f32005x.unlock();
        m0Var.f31996r = null;
        this.f31795a.f32193r = false;
        if (!m0Var.f31976b) {
            m0Var.d();
            m0Var.f32007y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f31976b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f31978c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f31976b) {
            m0Var.f31989k0.setVisibility(8);
            m0Var.f31990l0.setVisibility(8);
            m0Var.f31982e0.setVisibility(8);
            m0Var.f31984f0.setVisibility(8);
        }
    }
}
