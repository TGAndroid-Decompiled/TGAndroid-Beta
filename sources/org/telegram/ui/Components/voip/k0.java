package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f32119a;
    public final l0 f32120b;

    public k0(l0 l0Var, u uVar) {
        this.f32120b = l0Var;
        this.f32119a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32119a;
        if (uVar.getParent() != null) {
            this.f32120b.removeView(uVar);
            uVar.e();
        }
    }
}
