package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.bi;
public final class z9 extends AnimatorListenerAdapter {
    public final bi f43516a;
    public final u6 f43517b;
    public final aa f43518c;

    public z9(aa aaVar, bi biVar, u6 u6Var) {
        this.f43518c = aaVar;
        this.f43516a = biVar;
        this.f43517b = u6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43518c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43518c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f43516a != null) {
            org.telegram.messenger.g0.v1(this.f43517b);
        }
    }
}
