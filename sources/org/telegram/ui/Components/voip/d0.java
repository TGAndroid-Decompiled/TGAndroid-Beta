package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final v f31614a;
    public final n0 f31615b;

    public d0(n0 n0Var, v vVar) {
        this.f31615b = n0Var;
        this.f31614a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        n0 n0Var = this.f31615b;
        n0Var.f31828x.unlock();
        n0Var.f31819r = null;
        this.f31614a.f32018r = false;
        if (!n0Var.f31799b) {
            n0Var.d();
            n0Var.f31830y = null;
            n0Var.d = 0L;
        }
        if (n0Var.f31799b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        n0Var.f31801c = f7;
        n0Var.l();
        n0Var.i(false);
        if (!n0Var.f31799b) {
            n0Var.f31812k0.setVisibility(8);
            n0Var.f31813l0.setVisibility(8);
            n0Var.f31805e0.setVisibility(8);
            n0Var.f31807f0.setVisibility(8);
        }
    }
}
