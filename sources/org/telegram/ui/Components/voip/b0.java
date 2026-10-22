package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31348a;
    public final l0 f31349b;

    public b0(l0 l0Var, t tVar) {
        this.f31349b = l0Var;
        this.f31348a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31349b;
        l0Var.f31546x.unlock();
        l0Var.f31537r = null;
        this.f31348a.f31732r = false;
        if (!l0Var.f31518b) {
            l0Var.d();
            l0Var.f31548y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31518b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31520c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31518b) {
            l0Var.f31530k0.setVisibility(8);
            l0Var.f31531l0.setVisibility(8);
            l0Var.f31523e0.setVisibility(8);
            l0Var.f31525f0.setVisibility(8);
        }
    }
}
