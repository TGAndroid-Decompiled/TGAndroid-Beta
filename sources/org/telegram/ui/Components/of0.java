package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f26723a;
    public final pf0 f26724b;

    public of0(pf0 pf0Var, int i10) {
        this.f26723a = i10;
        this.f26724b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26723a) {
            case 0:
                this.f26724b.f27020a.f27282n.setVisibility(8);
                return;
            default:
                this.f26724b.f27020a.h.setVisibility(8);
                return;
        }
    }
}
