package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u f29284a;
    public final m0 f29285b;

    public c0(m0 m0Var, u uVar) {
        this.f29285b = m0Var;
        this.f29284a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m0 m0Var = this.f29285b;
        m0Var.f29480x.unlock();
        m0Var.f29471r = null;
        this.f29284a.f29654r = false;
        if (!m0Var.f29452b) {
            m0Var.d();
            m0Var.f29482y = null;
            m0Var.d = 0L;
        }
        if (m0Var.f29452b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        m0Var.f29454c = f7;
        m0Var.l();
        m0Var.i(false);
        if (!m0Var.f29452b) {
            m0Var.f29464k0.setVisibility(8);
            m0Var.f29465l0.setVisibility(8);
            m0Var.f29457e0.setVisibility(8);
            m0Var.f29459f0.setVisibility(8);
        }
    }
}
