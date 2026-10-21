package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31345a;
    public final l0 f31346b;

    public b0(l0 l0Var, t tVar) {
        this.f31346b = l0Var;
        this.f31345a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31346b;
        l0Var.f31543x.unlock();
        l0Var.f31534r = null;
        this.f31345a.f31729r = false;
        if (!l0Var.f31515b) {
            l0Var.d();
            l0Var.f31545y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31515b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31517c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31515b) {
            l0Var.f31527k0.setVisibility(8);
            l0Var.f31528l0.setVisibility(8);
            l0Var.f31520e0.setVisibility(8);
            l0Var.f31522f0.setVisibility(8);
        }
    }
}
