package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29211a;
    public final m0 f29212b;

    public c0(m0 m0Var, u uVar) {
        this.f29212b = m0Var;
        this.f29211a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29212b;
        m0Var.f29407x.unlock();
        m0Var.f29398r = null;
        this.f29211a.f29581r = false;
        if (!m0Var.f29379b) {
            m0Var.d();
            m0Var.f29409y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29379b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29381c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29379b) {
            m0Var.f29391k0.setVisibility(8);
            m0Var.f29392l0.setVisibility(8);
            m0Var.f29384e0.setVisibility(8);
            m0Var.f29386f0.setVisibility(8);
        }
    }
}
