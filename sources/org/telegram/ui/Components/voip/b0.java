package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final u f31963a;
    public final l0 f31964b;

    public b0(l0 l0Var, u uVar) {
        this.f31964b = l0Var;
        this.f31963a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        l0 l0Var = this.f31964b;
        l0Var.f32169x.unlock();
        l0Var.f32160r = null;
        this.f31963a.f32382r = false;
        if (!l0Var.f32140b) {
            l0Var.d();
            l0Var.f32171y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f32140b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        l0Var.f32142c = f10;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f32140b) {
            l0Var.f32150h0.setVisibility(8);
            l0Var.f32151i0.setVisibility(8);
            l0Var.f32141b0.setVisibility(8);
            l0Var.f32143c0.setVisibility(8);
        }
    }
}
