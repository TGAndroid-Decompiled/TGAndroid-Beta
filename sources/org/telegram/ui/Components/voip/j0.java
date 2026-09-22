package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29366a;
    public final m0 f29367b;

    public j0(m0 m0Var, u uVar) {
        this.f29367b = m0Var;
        this.f29366a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29366a;
        if (uVar.getParent() != null) {
            this.f29367b.removeView(uVar);
            uVar.e();
        }
    }
}
