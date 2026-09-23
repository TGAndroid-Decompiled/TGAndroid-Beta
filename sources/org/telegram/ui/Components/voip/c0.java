package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f28860a;
    public final m0 f28861b;

    public c0(m0 m0Var, u uVar) {
        this.f28861b = m0Var;
        this.f28860a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f28861b;
        m0Var.f29057x.unlock();
        m0Var.f29048r = null;
        this.f28860a.f29232r = false;
        if (!m0Var.f29029b) {
            m0Var.d();
            m0Var.f29059y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29029b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29031c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29029b) {
            m0Var.f29041k0.setVisibility(8);
            m0Var.f29042l0.setVisibility(8);
            m0Var.f29034e0.setVisibility(8);
            m0Var.f29036f0.setVisibility(8);
        }
    }
}
