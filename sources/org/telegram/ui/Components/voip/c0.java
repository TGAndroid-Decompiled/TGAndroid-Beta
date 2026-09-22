package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29254a;
    public final m0 f29255b;

    public c0(m0 m0Var, u uVar) {
        this.f29255b = m0Var;
        this.f29254a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29255b;
        m0Var.f29451x.unlock();
        m0Var.f29442r = null;
        this.f29254a.f29626r = false;
        if (!m0Var.f29423b) {
            m0Var.d();
            m0Var.f29453y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29423b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29425c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29423b) {
            m0Var.f29435k0.setVisibility(8);
            m0Var.f29436l0.setVisibility(8);
            m0Var.f29428e0.setVisibility(8);
            m0Var.f29430f0.setVisibility(8);
        }
    }
}
