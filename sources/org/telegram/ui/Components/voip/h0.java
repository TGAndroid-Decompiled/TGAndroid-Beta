package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final t f29666a;
    public final k0 f29667b;

    public h0(k0 k0Var, t tVar) {
        this.f29667b = k0Var;
        this.f29666a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f29666a;
        if (tVar.getParent() != null) {
            this.f29667b.removeView(tVar);
            tVar.e();
        }
    }
}
