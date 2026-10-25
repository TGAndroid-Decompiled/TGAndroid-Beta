package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f33837a;
    public final l0 f33838b;

    public i0(l0 l0Var, t tVar) {
        this.f33838b = l0Var;
        this.f33837a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33837a;
        if (tVar.getParent() != null) {
            this.f33838b.removeView(tVar);
            tVar.e();
        }
    }
}
