package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f28886a;
    public final m0 f28887b;

    public c0(m0 m0Var, u uVar) {
        this.f28887b = m0Var;
        this.f28886a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f28887b;
        m0Var.f29083x.unlock();
        m0Var.f29074r = null;
        this.f28886a.f29258r = false;
        if (!m0Var.f29055b) {
            m0Var.d();
            m0Var.f29085y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29055b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29057c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29055b) {
            m0Var.f29067k0.setVisibility(8);
            m0Var.f29068l0.setVisibility(8);
            m0Var.f29060e0.setVisibility(8);
            m0Var.f29062f0.setVisibility(8);
        }
    }
}
