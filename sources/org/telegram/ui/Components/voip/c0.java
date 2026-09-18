package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f28869a;
    public final m0 f28870b;

    public c0(m0 m0Var, u uVar) {
        this.f28870b = m0Var;
        this.f28869a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f28870b;
        m0Var.f29066x.unlock();
        m0Var.f29057r = null;
        this.f28869a.f29241r = false;
        if (!m0Var.f29038b) {
            m0Var.d();
            m0Var.f29068y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29038b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29040c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29038b) {
            m0Var.f29050k0.setVisibility(8);
            m0Var.f29051l0.setVisibility(8);
            m0Var.f29043e0.setVisibility(8);
            m0Var.f29045f0.setVisibility(8);
        }
    }
}
