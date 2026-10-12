package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f30103a;
    public final l0 f30104b;

    public b0(l0 l0Var, t tVar) {
        this.f30104b = l0Var;
        this.f30103a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f30104b;
        l0Var.f30309x.unlock();
        l0Var.f30300r = null;
        this.f30103a.f30497r = false;
        if (!l0Var.f30281b) {
            l0Var.d();
            l0Var.f30311y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f30281b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f30283c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f30281b) {
            l0Var.f30293k0.setVisibility(8);
            l0Var.f30294l0.setVisibility(8);
            l0Var.f30286e0.setVisibility(8);
            l0Var.f30288f0.setVisibility(8);
        }
    }
}
