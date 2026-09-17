package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31440a;
    public final l0 f31441b;

    public b0(l0 l0Var, t tVar) {
        this.f31441b = l0Var;
        this.f31440a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31441b;
        l0Var.f31654x.unlock();
        l0Var.f31645r = null;
        this.f31440a.f31854r = false;
        if (!l0Var.f31625b) {
            l0Var.d();
            l0Var.f31656y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31625b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31627c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31625b) {
            l0Var.f31638k0.setVisibility(8);
            l0Var.f31639l0.setVisibility(8);
            l0Var.f31631e0.setVisibility(8);
            l0Var.f31633f0.setVisibility(8);
        }
    }
}
