package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final u f31968a;
    public final l0 f31969b;

    public b0(l0 l0Var, u uVar) {
        this.f31969b = l0Var;
        this.f31968a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        l0 l0Var = this.f31969b;
        l0Var.f32174x.unlock();
        l0Var.f32165r = null;
        this.f31968a.f32387r = false;
        if (!l0Var.f32145b) {
            l0Var.d();
            l0Var.f32176y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f32145b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        l0Var.f32147c = f10;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f32145b) {
            l0Var.f32155h0.setVisibility(8);
            l0Var.f32156i0.setVisibility(8);
            l0Var.f32146b0.setVisibility(8);
            l0Var.f32148c0.setVisibility(8);
        }
    }
}
