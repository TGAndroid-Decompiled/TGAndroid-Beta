package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v1 extends AnimatorListenerAdapter {
    public final int f39656a;
    public final w1 f39657b;

    public v1(w1 w1Var, int i3) {
        this.f39656a = i3;
        this.f39657b = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39656a) {
            case 0:
                this.f39657b.f39663b.setVisibility(8);
                return;
            default:
                this.f39657b.f39664c.setVisibility(8);
                return;
        }
    }
}
