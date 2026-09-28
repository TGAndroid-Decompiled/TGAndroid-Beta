package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29214a;
    public final m0 f29215b;

    public c0(m0 m0Var, u uVar) {
        this.f29215b = m0Var;
        this.f29214a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29215b;
        m0Var.f29410x.unlock();
        m0Var.f29401r = null;
        this.f29214a.f29584r = false;
        if (!m0Var.f29382b) {
            m0Var.d();
            m0Var.f29412y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29382b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29384c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29382b) {
            m0Var.f29394k0.setVisibility(8);
            m0Var.f29395l0.setVisibility(8);
            m0Var.f29387e0.setVisibility(8);
            m0Var.f29389f0.setVisibility(8);
        }
    }
}
