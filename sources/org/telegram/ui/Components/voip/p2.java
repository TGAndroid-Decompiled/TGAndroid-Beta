package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f31865a;
    public final q2 f31866b;

    public p2(q2 q2Var, int i10) {
        this.f31865a = i10;
        this.f31866b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31865a) {
            case 0:
                this.f31866b.f31909b.setVisibility(8);
                return;
            default:
                this.f31866b.f31910c.setVisibility(8);
                return;
        }
    }
}
