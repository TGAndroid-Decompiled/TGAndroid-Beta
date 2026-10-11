package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f32013a;

    public h1(k1 k1Var) {
        this.f32013a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f32013a;
        k1Var.f32059b.removeViewImmediate(k1Var.d);
        k1Var.f32062f.d.release();
        k1Var.v = null;
        k1Var.f32066w = true;
        k1Var.f32067x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
