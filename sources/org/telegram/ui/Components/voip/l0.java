package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f32034a;
    public final m0 f32035b;

    public l0(m0 m0Var, u uVar) {
        this.f32035b = m0Var;
        this.f32034a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32034a;
        if (uVar.getParent() != null) {
            this.f32035b.removeView(uVar);
            uVar.e();
        }
    }
}
