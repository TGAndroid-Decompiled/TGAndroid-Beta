package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f33785a;
    public final l0 f33786b;

    public k0(l0 l0Var, u uVar) {
        this.f33786b = l0Var;
        this.f33785a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f33785a;
        if (uVar.getParent() != null) {
            this.f33786b.removeView(uVar);
            uVar.e();
        }
    }
}
