package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final h1 f32023a;

    public e1(h1 h1Var) {
        this.f32023a = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.f32023a;
        h1Var.f32073b.removeViewImmediate(h1Var.d);
        h1Var.f32076f.d.release();
        h1Var.v = null;
        h1Var.f32080w = true;
        h1Var.f32081x = false;
        h1Var.G = null;
        h1Var.E = false;
    }
}
