package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final h1 f32018a;

    public e1(h1 h1Var) {
        this.f32018a = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.f32018a;
        h1Var.f32068b.removeViewImmediate(h1Var.d);
        h1Var.f32071f.d.release();
        h1Var.v = null;
        h1Var.f32075w = true;
        h1Var.f32076x = false;
        h1Var.G = null;
        h1Var.E = false;
    }
}
