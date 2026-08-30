package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final t f29551a;
    public final k0 f29552b;

    public a0(k0 k0Var, t tVar) {
        this.f29552b = k0Var;
        this.f29551a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        k0 k0Var = this.f29552b;
        k0Var.f29741x.unlock();
        k0Var.f29732r = null;
        this.f29551a.f29940r = false;
        if (!k0Var.f29713b) {
            k0Var.d();
            k0Var.f29743y = null;
            k0Var.d = 0L;
        }
        if (k0Var.f29713b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        k0Var.f29715c = f10;
        k0Var.l();
        k0Var.i(false);
        if (!k0Var.f29713b) {
            k0Var.f29722h0.setVisibility(8);
            k0Var.f29723i0.setVisibility(8);
            k0Var.f29714b0.setVisibility(8);
            k0Var.f29716c0.setVisibility(8);
        }
    }
}
