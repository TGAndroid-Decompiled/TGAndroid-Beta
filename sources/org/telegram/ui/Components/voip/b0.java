package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31500a;
    public final l0 f31501b;

    public b0(l0 l0Var, t tVar) {
        this.f31501b = l0Var;
        this.f31500a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31501b;
        l0Var.f31698x.unlock();
        l0Var.f31689r = null;
        this.f31500a.f31884r = false;
        if (!l0Var.f31670b) {
            l0Var.d();
            l0Var.f31700y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31670b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31672c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31670b) {
            l0Var.f31682k0.setVisibility(8);
            l0Var.f31683l0.setVisibility(8);
            l0Var.f31675e0.setVisibility(8);
            l0Var.f31677f0.setVisibility(8);
        }
    }
}
