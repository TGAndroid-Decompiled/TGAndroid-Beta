package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yw0 extends AnimatorListenerAdapter {
    public final int f30349a;
    public final zw0 f30350b;

    public yw0(zw0 zw0Var, int i10) {
        this.f30349a = i10;
        this.f30350b = zw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30349a) {
            case 0:
                this.f30350b.f30678s.setVisibility(8);
                return;
            case 1:
                this.f30350b.f30678s.setVisibility(8);
                return;
            default:
                this.f30350b.f30678s.setVisibility(8);
                return;
        }
    }
}
