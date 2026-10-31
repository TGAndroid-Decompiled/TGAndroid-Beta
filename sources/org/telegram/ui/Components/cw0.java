package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw0 extends AnimatorListenerAdapter {
    public final int f25188a;
    public final dw0 f25189b;

    public cw0(dw0 dw0Var, int i10) {
        this.f25188a = i10;
        this.f25189b = dw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25188a) {
            case 0:
                this.f25189b.f25555s.setVisibility(8);
                return;
            case 1:
                this.f25189b.f25555s.setVisibility(8);
                return;
            default:
                this.f25189b.f25555s.setVisibility(8);
                return;
        }
    }
}
