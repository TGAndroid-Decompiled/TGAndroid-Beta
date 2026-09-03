package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yw0 extends AnimatorListenerAdapter {
    public final int f31186a;
    public final zw0 f31187b;

    public yw0(zw0 zw0Var, int i10) {
        this.f31186a = i10;
        this.f31187b = zw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31186a) {
            case 0:
                this.f31187b.f31488s.setVisibility(8);
                return;
            case 1:
                this.f31187b.f31488s.setVisibility(8);
                return;
            default:
                this.f31187b.f31488s.setVisibility(8);
                return;
        }
    }
}
