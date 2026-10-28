package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f33837a;
    public final l0 f33838b;

    public b0(l0 l0Var, t tVar) {
        this.f33838b = l0Var;
        this.f33837a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f33838b;
        l0Var.f34036x.unlock();
        l0Var.f34027r = null;
        this.f33837a.f34200r = false;
        if (!l0Var.f34008b) {
            l0Var.d();
            l0Var.f34038y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f34008b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f34010c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f34008b) {
            l0Var.f34020k0.setVisibility(8);
            l0Var.f34021l0.setVisibility(8);
            l0Var.f34013e0.setVisibility(8);
            l0Var.f34015f0.setVisibility(8);
        }
    }
}
