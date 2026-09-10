package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ue0 extends AnimatorListenerAdapter {
    public final int f27657a;
    public final ye0 f27658b;

    public ue0(ye0 ye0Var, int i10) {
        this.f27657a = i10;
        this.f27658b = ye0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27657a) {
            case 0:
                this.f27658b.f29316x = null;
                return;
            default:
                this.f27658b.f29317y = null;
                return;
        }
    }
}
