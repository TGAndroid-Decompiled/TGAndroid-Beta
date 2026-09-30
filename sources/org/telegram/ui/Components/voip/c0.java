package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29205a;
    public final m0 f29206b;

    public c0(m0 m0Var, u uVar) {
        this.f29206b = m0Var;
        this.f29205a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29206b;
        m0Var.f29401x.unlock();
        m0Var.f29392r = null;
        this.f29205a.f29575r = false;
        if (!m0Var.f29373b) {
            m0Var.d();
            m0Var.f29403y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29373b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29375c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29373b) {
            m0Var.f29385k0.setVisibility(8);
            m0Var.f29386l0.setVisibility(8);
            m0Var.f29378e0.setVisibility(8);
            m0Var.f29380f0.setVisibility(8);
        }
    }
}
