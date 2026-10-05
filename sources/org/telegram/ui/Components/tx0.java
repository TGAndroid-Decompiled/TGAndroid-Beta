package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tx0 extends AnimatorListenerAdapter {
    public final int f31254a;
    public final ux0 f31255b;

    public tx0(ux0 ux0Var, int i10) {
        this.f31254a = i10;
        this.f31255b = ux0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31254a) {
            case 0:
                this.f31255b.f31555s.setVisibility(8);
                return;
            case 1:
                this.f31255b.f31555s.setVisibility(8);
                return;
            default:
                this.f31255b.f31555s.setVisibility(8);
                return;
        }
    }
}
