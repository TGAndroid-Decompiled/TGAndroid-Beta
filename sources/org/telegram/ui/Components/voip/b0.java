package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31413a;
    public final l0 f31414b;

    public b0(l0 l0Var, t tVar) {
        this.f31414b = l0Var;
        this.f31413a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31414b;
        l0Var.f31627x.unlock();
        l0Var.f31618r = null;
        this.f31413a.f31827r = false;
        if (!l0Var.f31598b) {
            l0Var.d();
            l0Var.f31629y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31598b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31600c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31598b) {
            l0Var.f31611k0.setVisibility(8);
            l0Var.f31612l0.setVisibility(8);
            l0Var.f31604e0.setVisibility(8);
            l0Var.f31606f0.setVisibility(8);
        }
    }
}
