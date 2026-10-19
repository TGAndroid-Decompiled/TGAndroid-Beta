package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31393a;
    public final l0 f31394b;

    public b0(l0 l0Var, t tVar) {
        this.f31394b = l0Var;
        this.f31393a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31394b;
        l0Var.f31591x.unlock();
        l0Var.f31582r = null;
        this.f31393a.f31777r = false;
        if (!l0Var.f31563b) {
            l0Var.d();
            l0Var.f31593y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31563b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31565c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31563b) {
            l0Var.f31575k0.setVisibility(8);
            l0Var.f31576l0.setVisibility(8);
            l0Var.f31568e0.setVisibility(8);
            l0Var.f31570f0.setVisibility(8);
        }
    }
}
