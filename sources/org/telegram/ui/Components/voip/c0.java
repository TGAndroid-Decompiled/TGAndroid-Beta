package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f31801a;
    public final m0 f31802b;

    public c0(m0 m0Var, u uVar) {
        this.f31802b = m0Var;
        this.f31801a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f31802b;
        m0Var.f32011x.unlock();
        m0Var.f32002r = null;
        this.f31801a.f32199r = false;
        if (!m0Var.f31982b) {
            m0Var.d();
            m0Var.f32013y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f31982b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f31984c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f31982b) {
            m0Var.f31995k0.setVisibility(8);
            m0Var.f31996l0.setVisibility(8);
            m0Var.f31988e0.setVisibility(8);
            m0Var.f31990f0.setVisibility(8);
        }
    }
}
