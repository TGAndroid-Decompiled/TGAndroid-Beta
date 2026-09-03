package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f32124a;
    public final l0 f32125b;

    public k0(l0 l0Var, u uVar) {
        this.f32125b = l0Var;
        this.f32124a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32124a;
        if (uVar.getParent() != null) {
            this.f32125b.removeView(uVar);
            uVar.e();
        }
    }
}
