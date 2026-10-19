package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31395a;
    public final l0 f31396b;

    public b0(l0 l0Var, t tVar) {
        this.f31396b = l0Var;
        this.f31395a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31396b;
        l0Var.f31593x.unlock();
        l0Var.f31584r = null;
        this.f31395a.f31779r = false;
        if (!l0Var.f31565b) {
            l0Var.d();
            l0Var.f31595y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31565b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31567c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31565b) {
            l0Var.f31577k0.setVisibility(8);
            l0Var.f31578l0.setVisibility(8);
            l0Var.f31570e0.setVisibility(8);
            l0Var.f31572f0.setVisibility(8);
        }
    }
}
