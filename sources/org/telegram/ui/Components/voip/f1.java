package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final i1 f28120a;

    public f1(i1 i1Var) {
        this.f28120a = i1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i1 i1Var = this.f28120a;
        i1Var.f28172b.removeViewImmediate(i1Var.d);
        i1Var.f28174f.d.release();
        i1Var.v = null;
        i1Var.f28178w = true;
        i1Var.f28179x = false;
        i1Var.J = null;
        i1Var.H = false;
    }
}
