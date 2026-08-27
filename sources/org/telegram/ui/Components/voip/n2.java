package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class n2 extends AnimatorListenerAdapter {

    public final int f33747a;

    public final o2 f33748b;

    public n2(o2 o2Var, int i10) {
        this.f33747a = i10;
        this.f33748b = o2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33747a) {
            case 0:
                this.f33748b.f33784b.setVisibility(8);
                break;
            default:
                this.f33748b.f33785c.setVisibility(8);
                break;
        }
    }
}
