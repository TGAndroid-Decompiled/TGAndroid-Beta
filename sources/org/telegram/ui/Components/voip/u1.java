package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u1 extends AnimatorListenerAdapter {
    public final int f31681a;
    public final v1 f31682b;

    public u1(v1 v1Var, int i10) {
        this.f31681a = i10;
        this.f31682b = v1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31681a) {
            case 0:
                this.f31682b.f31691b.setVisibility(8);
                return;
            default:
                this.f31682b.f31692c.setVisibility(8);
                return;
        }
    }
}
