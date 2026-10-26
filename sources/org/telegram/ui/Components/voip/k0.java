package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f33881a;
    public final l0 f33882b;

    public k0(l0 l0Var, t tVar) {
        this.f33882b = l0Var;
        this.f33881a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33881a;
        if (tVar.getParent() != null) {
            this.f33882b.removeView(tVar);
            tVar.e();
        }
    }
}
