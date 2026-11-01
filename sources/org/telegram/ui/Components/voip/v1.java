package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v1 extends AnimatorListenerAdapter {
    public final int f31761a;
    public final w1 f31762b;

    public v1(w1 w1Var, int i10) {
        this.f31761a = i10;
        this.f31762b = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31761a) {
            case 0:
                this.f31762b.f31771b.setVisibility(8);
                return;
            default:
                this.f31762b.f31772c.setVisibility(8);
                return;
        }
    }
}
