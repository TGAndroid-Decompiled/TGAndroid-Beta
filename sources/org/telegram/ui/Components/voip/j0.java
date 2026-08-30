package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f29695a;
    public final k0 f29696b;

    public j0(k0 k0Var, t tVar) {
        this.f29696b = k0Var;
        this.f29695a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f29695a;
        if (tVar.getParent() != null) {
            this.f29696b.removeView(tVar);
            tVar.e();
        }
    }
}
