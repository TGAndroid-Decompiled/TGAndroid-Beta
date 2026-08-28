package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final t f33423a;
    public final k0 f33424b;

    public a0(k0 k0Var, t tVar) {
        this.f33424b = k0Var;
        this.f33423a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        k0 k0Var = this.f33424b;
        k0Var.f33627x.unlock();
        k0Var.f33618r = null;
        this.f33423a.f33843r = false;
        if (!k0Var.f33598b) {
            k0Var.d();
            k0Var.f33629y = null;
            k0Var.d = 0L;
        }
        if (k0Var.f33598b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        k0Var.f33600c = f10;
        k0Var.l();
        k0Var.i(false);
        if (!k0Var.f33598b) {
            k0Var.f33607g0.setVisibility(8);
            k0Var.f33608h0.setVisibility(8);
            k0Var.f33597a0.setVisibility(8);
            k0Var.f33599b0.setVisibility(8);
        }
    }
}
