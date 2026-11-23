package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f40998a;
    public final l2 f40999b;

    public k2(l2 l2Var, int i7) {
        this.f40998a = i7;
        this.f40999b = l2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40998a) {
            case 0:
                this.f40999b.f41040b.setVisibility(8);
                return;
            default:
                this.f40999b.f41041c.setVisibility(8);
                return;
        }
    }
}
