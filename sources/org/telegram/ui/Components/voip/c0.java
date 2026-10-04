package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f31794a;
    public final m0 f31795b;

    public c0(m0 m0Var, u uVar) {
        this.f31795b = m0Var;
        this.f31794a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f31795b;
        m0Var.f32004x.unlock();
        m0Var.f31995r = null;
        this.f31794a.f32192r = false;
        if (!m0Var.f31975b) {
            m0Var.d();
            m0Var.f32006y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f31975b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f31977c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f31975b) {
            m0Var.f31988k0.setVisibility(8);
            m0Var.f31989l0.setVisibility(8);
            m0Var.f31981e0.setVisibility(8);
            m0Var.f31983f0.setVisibility(8);
        }
    }
}
