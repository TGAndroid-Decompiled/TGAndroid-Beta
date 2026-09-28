package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29215a;
    public final m0 f29216b;

    public c0(m0 m0Var, u uVar) {
        this.f29216b = m0Var;
        this.f29215a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29216b;
        m0Var.f29411x.unlock();
        m0Var.f29402r = null;
        this.f29215a.f29585r = false;
        if (!m0Var.f29383b) {
            m0Var.d();
            m0Var.f29413y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29383b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29385c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29383b) {
            m0Var.f29395k0.setVisibility(8);
            m0Var.f29396l0.setVisibility(8);
            m0Var.f29388e0.setVisibility(8);
            m0Var.f29390f0.setVisibility(8);
        }
    }
}
