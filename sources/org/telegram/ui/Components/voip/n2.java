package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f30337a;
    public final o2 f30338b;

    public n2(o2 o2Var, int i10) {
        this.f30337a = i10;
        this.f30338b = o2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30337a) {
            case 0:
                this.f30338b.f30387b.setVisibility(8);
                return;
            default:
                this.f30338b.f30388c.setVisibility(8);
                return;
        }
    }
}
