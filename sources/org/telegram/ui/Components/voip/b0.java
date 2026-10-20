package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31344a;
    public final l0 f31345b;

    public b0(l0 l0Var, t tVar) {
        this.f31345b = l0Var;
        this.f31344a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31345b;
        l0Var.f31542x.unlock();
        l0Var.f31533r = null;
        this.f31344a.f31728r = false;
        if (!l0Var.f31514b) {
            l0Var.d();
            l0Var.f31544y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31514b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31516c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31514b) {
            l0Var.f31526k0.setVisibility(8);
            l0Var.f31527l0.setVisibility(8);
            l0Var.f31519e0.setVisibility(8);
            l0Var.f31521f0.setVisibility(8);
        }
    }
}
