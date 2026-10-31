package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class te0 extends AnimatorListenerAdapter {
    public final int f30549a;
    public final ue0 f30550b;

    public te0(ue0 ue0Var, int i10) {
        this.f30549a = i10;
        this.f30550b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30549a) {
            case 0:
                this.f30550b.f30912a.f31238n.setVisibility(8);
                return;
            default:
                this.f30550b.f30912a.h.setVisibility(8);
                return;
        }
    }
}
