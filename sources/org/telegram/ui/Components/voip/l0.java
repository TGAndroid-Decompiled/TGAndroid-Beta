package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29365a;
    public final m0 f29366b;

    public l0(m0 m0Var, u uVar) {
        this.f29366b = m0Var;
        this.f29365a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29365a;
        if (uVar.getParent() != null) {
            this.f29366b.removeView(uVar);
            uVar.e();
        }
    }
}
