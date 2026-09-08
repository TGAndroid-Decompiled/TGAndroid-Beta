package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31439a;
    public final l0 f31440b;

    public b0(l0 l0Var, t tVar) {
        this.f31440b = l0Var;
        this.f31439a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31440b;
        l0Var.f31653x.unlock();
        l0Var.f31644r = null;
        this.f31439a.f31853r = false;
        if (!l0Var.f31624b) {
            l0Var.d();
            l0Var.f31655y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31624b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31626c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31624b) {
            l0Var.f31637k0.setVisibility(8);
            l0Var.f31638l0.setVisibility(8);
            l0Var.f31630e0.setVisibility(8);
            l0Var.f31632f0.setVisibility(8);
        }
    }
}
