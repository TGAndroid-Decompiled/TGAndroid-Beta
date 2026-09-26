package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29324a;
    public final m0 f29325b;

    public j0(m0 m0Var, u uVar) {
        this.f29325b = m0Var;
        this.f29324a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29324a;
        if (uVar.getParent() != null) {
            this.f29325b.removeView(uVar);
            uVar.e();
        }
    }
}
