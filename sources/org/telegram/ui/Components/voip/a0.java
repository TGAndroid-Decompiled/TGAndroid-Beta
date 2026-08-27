package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a0 extends AnimatorListenerAdapter {

    public final t f33473a;

    public final k0 f33474b;

    public a0(k0 k0Var, t tVar) {
        this.f33474b = k0Var;
        this.f33473a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f33474b;
        k0Var.f33677x.unlock();
        k0Var.f33668r = null;
        this.f33473a.f33893r = false;
        if (!k0Var.f33648b) {
            k0Var.d();
            k0Var.f33679y = null;
            k0Var.d = 0L;
        }
        k0Var.f33650c = k0Var.f33648b ? 1.0f : 0.0f;
        k0Var.l();
        k0Var.i(false);
        if (k0Var.f33648b) {
            return;
        }
        k0Var.f33657g0.setVisibility(8);
        k0Var.f33658h0.setVisibility(8);
        k0Var.f33647a0.setVisibility(8);
        k0Var.f33649b0.setVisibility(8);
    }
}
