package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29297a;
    public final m0 f29298b;

    public j0(m0 m0Var, u uVar) {
        this.f29298b = m0Var;
        this.f29297a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29297a;
        if (uVar.getParent() != null) {
            this.f29298b.removeView(uVar);
            uVar.e();
        }
    }
}
