package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31516a;
    public final l0 f31517b;

    public i0(l0 l0Var, t tVar) {
        this.f31517b = l0Var;
        this.f31516a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31516a;
        if (tVar.getParent() != null) {
            this.f31517b.removeView(tVar);
            tVar.e();
        }
    }
}
