package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f33585a;
    public final k0 f33586b;

    public j0(k0 k0Var, t tVar) {
        this.f33586b = k0Var;
        this.f33585a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33585a;
        if (tVar.getParent() != null) {
            this.f33586b.removeView(tVar);
            tVar.e();
        }
    }
}
