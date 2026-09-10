package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final t f28064a;
    public final m0 f28065b;

    public c0(m0 m0Var, t tVar) {
        this.f28065b = m0Var;
        this.f28064a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f28065b;
        m0Var.f28269x.unlock();
        m0Var.f28260r = null;
        this.f28064a.f28430r = false;
        if (!m0Var.f28241b) {
            m0Var.d();
            m0Var.f28271y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f28241b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f28243c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f28241b) {
            m0Var.f28253k0.setVisibility(8);
            m0Var.f28254l0.setVisibility(8);
            m0Var.f28246e0.setVisibility(8);
            m0Var.f28248f0.setVisibility(8);
        }
    }
}
