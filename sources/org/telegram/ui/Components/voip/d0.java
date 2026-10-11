package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final v f31992a;
    public final n0 f31993b;

    public d0(n0 n0Var, v vVar) {
        this.f31993b = n0Var;
        this.f31992a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        n0 n0Var = this.f31993b;
        n0Var.f32207x.unlock();
        n0Var.f32198r = null;
        this.f31992a.f32396r = false;
        if (!n0Var.f32178b) {
            n0Var.d();
            n0Var.f32209y = null;
            n0Var.d = 0L;
        }
        if (n0Var.f32178b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        n0Var.f32180c = f7;
        n0Var.l();
        n0Var.i(false);
        if (!n0Var.f32178b) {
            n0Var.f32191k0.setVisibility(8);
            n0Var.f32192l0.setVisibility(8);
            n0Var.f32184e0.setVisibility(8);
            n0Var.f32186f0.setVisibility(8);
        }
    }
}
