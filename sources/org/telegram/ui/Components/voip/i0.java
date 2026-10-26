package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f33840a;
    public final l0 f33841b;

    public i0(l0 l0Var, t tVar) {
        this.f33841b = l0Var;
        this.f33840a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33840a;
        if (tVar.getParent() != null) {
            this.f33841b.removeView(tVar);
            tVar.e();
        }
    }
}
