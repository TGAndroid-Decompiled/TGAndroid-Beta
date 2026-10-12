package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f31753a;
    public final n0 f31754b;

    public k0(n0 n0Var, u uVar) {
        this.f31754b = n0Var;
        this.f31753a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31753a;
        if (uVar.getParent() != null) {
            this.f31754b.removeView(uVar);
            uVar.e();
        }
    }
}
