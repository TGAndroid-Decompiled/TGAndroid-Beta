package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f33986a;
    public final l0 f33987b;

    public k0(l0 l0Var, t tVar) {
        this.f33987b = l0Var;
        this.f33986a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33986a;
        if (tVar.getParent() != null) {
            this.f33987b.removeView(tVar);
            tVar.e();
        }
    }
}
