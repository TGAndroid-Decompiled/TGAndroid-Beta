package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29210a;
    public final m0 f29211b;

    public c0(m0 m0Var, u uVar) {
        this.f29211b = m0Var;
        this.f29210a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29211b;
        m0Var.f29406x.unlock();
        m0Var.f29397r = null;
        this.f29210a.f29580r = false;
        if (!m0Var.f29378b) {
            m0Var.d();
            m0Var.f29408y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29378b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29380c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29378b) {
            m0Var.f29390k0.setVisibility(8);
            m0Var.f29391l0.setVisibility(8);
            m0Var.f29383e0.setVisibility(8);
            m0Var.f29385f0.setVisibility(8);
        }
    }
}
