package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f41094a;
    public final k2 f41095b;

    public j2(k2 k2Var, int i7) {
        this.f41094a = i7;
        this.f41095b = k2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41094a) {
            case 0:
                this.f41095b.f41146b.setVisibility(8);
                return;
            default:
                this.f41095b.f41147c.setVisibility(8);
                return;
        }
    }
}
