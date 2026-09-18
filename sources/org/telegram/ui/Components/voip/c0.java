package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29185a;
    public final m0 f29186b;

    public c0(m0 m0Var, u uVar) {
        this.f29186b = m0Var;
        this.f29185a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29186b;
        m0Var.f29382x.unlock();
        m0Var.f29373r = null;
        this.f29185a.f29557r = false;
        if (!m0Var.f29354b) {
            m0Var.d();
            m0Var.f29384y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29354b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29356c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29354b) {
            m0Var.f29366k0.setVisibility(8);
            m0Var.f29367l0.setVisibility(8);
            m0Var.f29359e0.setVisibility(8);
            m0Var.f29361f0.setVisibility(8);
        }
    }
}
