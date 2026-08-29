package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final u f33748a;
    public final l0 f33749b;

    public i0(l0 l0Var, u uVar) {
        this.f33749b = l0Var;
        this.f33748a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f33748a;
        if (uVar.getParent() != null) {
            this.f33749b.removeView(uVar);
            uVar.e();
        }
    }
}
