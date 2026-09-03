package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f32114a;
    public final u f32115b;
    public final l0 f32116c;

    public j0(l0 l0Var, u uVar, u uVar2) {
        this.f32116c = l0Var;
        this.f32114a = uVar;
        this.f32115b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f32116c;
        l0Var.K0 = null;
        this.f32114a.B = false;
        u uVar = l0Var.B;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.B);
                this.f32115b.e();
            }
            l0Var.B = null;
        }
    }
}
