package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g1 extends AnimatorListenerAdapter {
    public final j1 f31943a;

    public g1(j1 j1Var) {
        this.f31943a = j1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j1 j1Var = this.f31943a;
        j1Var.f32000b.removeViewImmediate(j1Var.d);
        j1Var.f32003f.d.release();
        j1Var.v = null;
        j1Var.f32007w = true;
        j1Var.f32008x = false;
        j1Var.J = null;
        j1Var.H = false;
    }
}
