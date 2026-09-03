package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f29667a;
    public final k0 f29668b;

    public j0(k0 k0Var, t tVar) {
        this.f29668b = k0Var;
        this.f29667a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f29667a;
        if (tVar.getParent() != null) {
            this.f29668b.removeView(tVar);
            tVar.e();
        }
    }
}
