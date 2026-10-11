package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sg0 extends AnimatorListenerAdapter {
    public final int f30747a;
    public final tg0 f30748b;

    public sg0(tg0 tg0Var, int i10) {
        this.f30747a = i10;
        this.f30748b = tg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30747a) {
            case 0:
                this.f30748b.f31092a.f31441n.setVisibility(8);
                return;
            default:
                this.f30748b.f31092a.h.setVisibility(8);
                return;
        }
    }
}
