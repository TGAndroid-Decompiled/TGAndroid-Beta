package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f31937a;
    public final m0 f31938b;

    public c0(m0 m0Var, u uVar) {
        this.f31938b = m0Var;
        this.f31937a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f31938b;
        m0Var.f32149x.unlock();
        m0Var.f32140r = null;
        this.f31937a.f32338r = false;
        if (!m0Var.f32120b) {
            m0Var.d();
            m0Var.f32151y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f32120b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f32122c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f32120b) {
            m0Var.f32133k0.setVisibility(8);
            m0Var.f32134l0.setVisibility(8);
            m0Var.f32126e0.setVisibility(8);
            m0Var.f32128f0.setVisibility(8);
        }
    }
}
