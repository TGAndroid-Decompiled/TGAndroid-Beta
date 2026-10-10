package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f32058a;
    public final m0 f32059b;

    public j0(m0 m0Var, u uVar) {
        this.f32059b = m0Var;
        this.f32058a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32058a;
        if (uVar.getParent() != null) {
            this.f32059b.removeView(uVar);
            uVar.e();
        }
    }
}
