package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31603a;
    public final l0 f31604b;

    public k0(l0 l0Var, t tVar) {
        this.f31604b = l0Var;
        this.f31603a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31603a;
        if (tVar.getParent() != null) {
            this.f31604b.removeView(tVar);
            tVar.e();
        }
    }
}
