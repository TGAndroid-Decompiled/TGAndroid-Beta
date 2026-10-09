package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f32042a;
    public final m0 f32043b;

    public l0(m0 m0Var, u uVar) {
        this.f32043b = m0Var;
        this.f32042a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32042a;
        if (uVar.getParent() != null) {
            this.f32043b.removeView(uVar);
            uVar.e();
        }
    }
}
