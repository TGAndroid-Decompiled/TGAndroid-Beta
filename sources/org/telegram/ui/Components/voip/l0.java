package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29449a;
    public final m0 f29450b;

    public l0(m0 m0Var, u uVar) {
        this.f29450b = m0Var;
        this.f29449a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29449a;
        if (uVar.getParent() != null) {
            this.f29450b.removeView(uVar);
            uVar.e();
        }
    }
}
