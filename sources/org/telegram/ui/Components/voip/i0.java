package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f29893a;
    public final l0 f29894b;

    public i0(l0 l0Var, t tVar) {
        this.f29894b = l0Var;
        this.f29893a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f29893a;
        if (tVar.getParent() != null) {
            this.f29894b.removeView(tVar);
            tVar.e();
        }
    }
}
