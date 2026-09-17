package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f28866a;
    public final m0 f28867b;

    public c0(m0 m0Var, u uVar) {
        this.f28867b = m0Var;
        this.f28866a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f28867b;
        m0Var.f29063x.unlock();
        m0Var.f29054r = null;
        this.f28866a.f29238r = false;
        if (!m0Var.f29035b) {
            m0Var.d();
            m0Var.f29065y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29035b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29037c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29035b) {
            m0Var.f29047k0.setVisibility(8);
            m0Var.f29048l0.setVisibility(8);
            m0Var.f29040e0.setVisibility(8);
            m0Var.f29042f0.setVisibility(8);
        }
    }
}
