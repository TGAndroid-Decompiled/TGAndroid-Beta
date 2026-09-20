package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29292a;
    public final m0 f29293b;

    public c0(m0 m0Var, u uVar) {
        this.f29293b = m0Var;
        this.f29292a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29293b;
        m0Var.f29489x.unlock();
        m0Var.f29480r = null;
        this.f29292a.f29664r = false;
        if (!m0Var.f29461b) {
            m0Var.d();
            m0Var.f29491y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29461b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29463c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29461b) {
            m0Var.f29473k0.setVisibility(8);
            m0Var.f29474l0.setVisibility(8);
            m0Var.f29466e0.setVisibility(8);
            m0Var.f29468f0.setVisibility(8);
        }
    }
}
