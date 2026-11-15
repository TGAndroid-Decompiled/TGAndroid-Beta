package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f40719a;
    public final l2 f40720b;

    public k2(l2 l2Var, int i7) {
        this.f40719a = i7;
        this.f40720b = l2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40719a) {
            case 0:
                this.f40720b.f40761b.setVisibility(8);
                return;
            default:
                this.f40720b.f40762c.setVisibility(8);
                return;
        }
    }
}
