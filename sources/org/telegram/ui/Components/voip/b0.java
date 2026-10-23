package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31530a;
    public final l0 f31531b;

    public b0(l0 l0Var, t tVar) {
        this.f31531b = l0Var;
        this.f31530a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31531b;
        l0Var.f31728x.unlock();
        l0Var.f31719r = null;
        this.f31530a.f31914r = false;
        if (!l0Var.f31700b) {
            l0Var.d();
            l0Var.f31730y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31700b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31702c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31700b) {
            l0Var.f31712k0.setVisibility(8);
            l0Var.f31713l0.setVisibility(8);
            l0Var.f31705e0.setVisibility(8);
            l0Var.f31707f0.setVisibility(8);
        }
    }
}
