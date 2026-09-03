package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final u f32092a;
    public final l0 f32093b;

    public i0(l0 l0Var, u uVar) {
        this.f32093b = l0Var;
        this.f32092a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32092a;
        if (uVar.getParent() != null) {
            this.f32093b.removeView(uVar);
            uVar.e();
        }
    }
}
