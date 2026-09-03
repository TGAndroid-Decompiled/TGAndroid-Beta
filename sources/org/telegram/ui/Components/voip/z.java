package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32492a;
    public final l0 f32493b;

    public z(l0 l0Var, u uVar) {
        this.f32493b = l0Var;
        this.f32492a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f32493b;
        l0Var.K0 = null;
        this.f32492a.B = false;
        u uVar = l0Var.B;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.B);
                l0Var.B.e();
            }
            l0Var.B = null;
        }
    }
}
