package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f28889a;
    public final m0 f28890b;

    public c0(m0 m0Var, u uVar) {
        this.f28890b = m0Var;
        this.f28889a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f28890b;
        m0Var.f29086x.unlock();
        m0Var.f29077r = null;
        this.f28889a.f29261r = false;
        if (!m0Var.f29058b) {
            m0Var.d();
            m0Var.f29088y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29058b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29060c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29058b) {
            m0Var.f29070k0.setVisibility(8);
            m0Var.f29071l0.setVisibility(8);
            m0Var.f29063e0.setVisibility(8);
            m0Var.f29065f0.setVisibility(8);
        }
    }
}
