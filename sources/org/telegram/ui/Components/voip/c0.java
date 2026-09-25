package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29294a;
    public final m0 f29295b;

    public c0(m0 m0Var, u uVar) {
        this.f29295b = m0Var;
        this.f29294a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29295b;
        m0Var.f29490x.unlock();
        m0Var.f29481r = null;
        this.f29294a.f29664r = false;
        if (!m0Var.f29462b) {
            m0Var.d();
            m0Var.f29492y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29462b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29464c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29462b) {
            m0Var.f29474k0.setVisibility(8);
            m0Var.f29475l0.setVisibility(8);
            m0Var.f29467e0.setVisibility(8);
            m0Var.f29469f0.setVisibility(8);
        }
    }
}
