package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31384a;
    public final l0 f31385b;

    public b0(l0 l0Var, t tVar) {
        this.f31385b = l0Var;
        this.f31384a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31385b;
        l0Var.f31582x.unlock();
        l0Var.f31573r = null;
        this.f31384a.f31768r = false;
        if (!l0Var.f31554b) {
            l0Var.d();
            l0Var.f31584y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31554b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31556c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31554b) {
            l0Var.f31566k0.setVisibility(8);
            l0Var.f31567l0.setVisibility(8);
            l0Var.f31559e0.setVisibility(8);
            l0Var.f31561f0.setVisibility(8);
        }
    }
}
