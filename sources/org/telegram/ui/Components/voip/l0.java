package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f32107a;
    public final m0 f32108b;

    public l0(m0 m0Var, u uVar) {
        this.f32108b = m0Var;
        this.f32107a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32107a;
        if (uVar.getParent() != null) {
            this.f32108b.removeView(uVar);
            uVar.e();
        }
    }
}
