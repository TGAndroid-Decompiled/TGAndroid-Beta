package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f40722a;
    public final l2 f40723b;

    public k2(l2 l2Var, int i7) {
        this.f40722a = i7;
        this.f40723b = l2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40722a) {
            case 0:
                this.f40723b.f40764b.setVisibility(8);
                return;
            default:
                this.f40723b.f40765c.setVisibility(8);
                return;
        }
    }
}
