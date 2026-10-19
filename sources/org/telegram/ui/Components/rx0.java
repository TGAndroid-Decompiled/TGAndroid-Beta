package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rx0 extends AnimatorListenerAdapter {
    public final int f30060a;
    public final sx0 f30061b;

    public rx0(sx0 sx0Var, int i10) {
        this.f30060a = i10;
        this.f30061b = sx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30060a) {
            case 0:
                this.f30061b.f30356s.setVisibility(8);
                return;
            case 1:
                this.f30061b.f30356s.setVisibility(8);
                return;
            default:
                this.f30061b.f30356s.setVisibility(8);
                return;
        }
    }
}
