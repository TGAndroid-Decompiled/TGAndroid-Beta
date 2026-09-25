package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f29129a;
    public final ze0 f29130b;

    public ve0(ze0 ze0Var, int i10) {
        this.f29129a = i10;
        this.f29130b = ze0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29129a) {
            case 0:
                this.f29130b.f30864x = null;
                return;
            default:
                this.f29130b.f30865y = null;
                return;
        }
    }
}
