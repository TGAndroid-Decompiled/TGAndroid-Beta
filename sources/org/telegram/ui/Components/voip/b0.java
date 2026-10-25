package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f33729a;
    public final l0 f33730b;

    public b0(l0 l0Var, t tVar) {
        this.f33730b = l0Var;
        this.f33729a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f33730b;
        l0Var.f33928x.unlock();
        l0Var.f33919r = null;
        this.f33729a.f34092r = false;
        if (!l0Var.f33900b) {
            l0Var.d();
            l0Var.f33930y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f33900b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f33902c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f33900b) {
            l0Var.f33912k0.setVisibility(8);
            l0Var.f33913l0.setVisibility(8);
            l0Var.f33905e0.setVisibility(8);
            l0Var.f33907f0.setVisibility(8);
        }
    }
}
