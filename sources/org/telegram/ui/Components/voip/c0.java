package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29236a;
    public final m0 f29237b;

    public c0(m0 m0Var, u uVar) {
        this.f29237b = m0Var;
        this.f29236a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29237b;
        m0Var.f29432x.unlock();
        m0Var.f29423r = null;
        this.f29236a.f29606r = false;
        if (!m0Var.f29404b) {
            m0Var.d();
            m0Var.f29434y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29404b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29406c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29404b) {
            m0Var.f29416k0.setVisibility(8);
            m0Var.f29417l0.setVisibility(8);
            m0Var.f29409e0.setVisibility(8);
            m0Var.f29411f0.setVisibility(8);
        }
    }
}
