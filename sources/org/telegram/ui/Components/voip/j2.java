package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f41093a;
    public final k2 f41094b;

    public j2(k2 k2Var, int i7) {
        this.f41093a = i7;
        this.f41094b = k2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41093a) {
            case 0:
                this.f41094b.f41145b.setVisibility(8);
                return;
            default:
                this.f41094b.f41146c.setVisibility(8);
                return;
        }
    }
}
