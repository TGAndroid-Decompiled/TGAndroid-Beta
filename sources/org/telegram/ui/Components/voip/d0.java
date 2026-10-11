package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final v f31928a;
    public final n0 f31929b;

    public d0(n0 n0Var, v vVar) {
        this.f31929b = n0Var;
        this.f31928a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        n0 n0Var = this.f31929b;
        n0Var.f32143x.unlock();
        n0Var.f32134r = null;
        this.f31928a.f32332r = false;
        if (!n0Var.f32114b) {
            n0Var.d();
            n0Var.f32145y = null;
            n0Var.d = 0L;
        }
        if (n0Var.f32114b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        n0Var.f32116c = f7;
        n0Var.l();
        n0Var.i(false);
        if (!n0Var.f32114b) {
            n0Var.f32127k0.setVisibility(8);
            n0Var.f32128l0.setVisibility(8);
            n0Var.f32120e0.setVisibility(8);
            n0Var.f32122f0.setVisibility(8);
        }
    }
}
