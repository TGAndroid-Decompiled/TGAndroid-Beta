package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31349a;
    public final l0 f31350b;

    public b0(l0 l0Var, t tVar) {
        this.f31350b = l0Var;
        this.f31349a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31350b;
        l0Var.f31547x.unlock();
        l0Var.f31538r = null;
        this.f31349a.f31733r = false;
        if (!l0Var.f31519b) {
            l0Var.d();
            l0Var.f31549y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31519b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31521c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31519b) {
            l0Var.f31531k0.setVisibility(8);
            l0Var.f31532l0.setVisibility(8);
            l0Var.f31524e0.setVisibility(8);
            l0Var.f31526f0.setVisibility(8);
        }
    }
}
